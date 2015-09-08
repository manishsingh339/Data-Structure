import java.util.Scanner;


public class UnStepNobGenerator {

    public static void main(String[] args) {             
    	Scanner in = new Scanner(System.in);
        int _nobOfInput = in.nextInt();
        
        for(int i = 0; i < _nobOfInput; i++){
            palindromeIndex(in.nextInt(),in.nextInt());
        }
     }
     
     public static void palindromeIndex(int n1, int n2){    	 	 
    	 int len1 = (int)(Math.log10(n1)+1);
    	 //int len2 = (int)(Math.log10(n2)+1);
    	 int firstDigit1 = Integer.parseInt(Integer.toString(n1).substring(0, 1));
    	 //int firstDigit2 = Integer.parseInt(Integer.toString(n2).substring(0, 1));
    	    	     	 
    	 long number = 0;
    	 for(int j = len1; j >= 1; j--){
    		 number += (long) (firstDigit1*(Math.pow(10, j-1)));    			 
    	 }
    	 System.out.println(number);    	 
     }        	
}