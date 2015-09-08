import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String _inputString = in.nextLine();
		removeDuplicateFun(_inputString);		
		in.close();
	}
	
	public static void removeDuplicateFun(String line){
		line = line.toLowerCase();
		String withoutDuplicateString = "";
		
		for(int i = 0; i < line.length(); i++){
			if( withoutDuplicateString.indexOf(line.charAt(i)) == -1){
				withoutDuplicateString += line.charAt(i);
			}
		}
		System.out.println("Without Duplicate: "+withoutDuplicateString);
		
		for(int j = 0; j < withoutDuplicateString.length(); j++){
			findFrequencyFunction( line, withoutDuplicateString.charAt(j) );
		}
	}
	
	public static void findFrequencyFunction(String line, char ch) {
		int count = 0; 
		
		for(int k = 0; k < line.length(); k++){
			if( line.charAt(k) == ch)
					count++;
		}
		System.out.println("The Character "+ch+" "+count+" places.");
	}
}