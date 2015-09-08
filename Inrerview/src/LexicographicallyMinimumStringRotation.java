import java.util.Arrays;

/*
 * Problem Statement: Write code to find lexicographic minimum in a circular array, e.g. for the array BCABDADAB, 
 * the lexicographic minimum is ABBCABDAD.
 */

/*
 * Following is a simple solution. Let the given string be ‘str’
 *  1) Concatenate ‘str’ with itself and store in a temporary string say ‘concat’.
 *  2) Create an array of strings to store all rotations of ‘str’. Let the array be ‘arr’.
 *  3) Find all rotations of ‘str’ by taking substrings of ‘concat’ at index 0, 1, 2..n-1. Store these rotations in arr[]
 *  4) Sort arr[] and return arr[0].
 */
public class LexicographicallyMinimumStringRotation {

	public static void main(String[] args) {
		String str = "DANIEL";
		lexicographicMinimum(str);

	}
	 public static void lexicographicMinimum(String str){
		 int len = str.length();
		 String[] arr = new String[len];
		 String concat = str+str;
		 
		 for(int i = 0; i < len; i++){
			 arr[i] = concat.substring(i, len+i);			
		 }
		 Arrays.sort(arr);
		 System.out.println(arr[0]);
	 }
	
}
