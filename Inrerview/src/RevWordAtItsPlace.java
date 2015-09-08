import java.util.Scanner;


public class RevWordAtItsPlace {
	
	public static void main(String[] args) {
		String str = "I want to walk my dog";
		revEachStringAtItsPlace(str);
	}
	
	public static void revEachStringAtItsPlace(String str){
		String result = "";
		int index = 0;
		for(int i = 0, len = str.length(); i < len; i++){
			if(str.charAt(i) == ' '){								
				result = result + reverseString(str.substring(index,i));
				index = i;
			}else if(i == len-1){
				result = result + reverseString(str.substring(index));
			}
		}
		System.out.println(result);
	}
	
	public static String reverseString(String str){
		String returnVal = "";
		System.out.println(str.length()+" "+str);
		for(int i = str.length()-1; i >= 0; i--){
			returnVal = returnVal+str.charAt(i);
		}
		return returnVal;
	}

}
