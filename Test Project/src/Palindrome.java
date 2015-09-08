import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		String line;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		line = in.nextLine();
		palindromeCheckFun(line);
		in.close();
	}
	
	public static void palindromeCheckFun(String line) {
		boolean flag = false;
		int length = line.length();
		
        for(int i=0; i < length; i++){
            if(line.charAt(i) != line.charAt(length-i-1)){
                flag = true;
                break;
	       }
	   }
       
       if(flag == true){
    	   System.out.println("not a palindrome");
       }else{
    	   System.out.println("palindrome");
       }
	}

}