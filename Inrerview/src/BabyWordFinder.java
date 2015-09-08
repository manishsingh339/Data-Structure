/* A baby can speak few words given in array and you have a string. Using array you need to form the 
 * given the String. like str = "gagagoogoo";  and arr = {"gag","goo","gaga"}; 
 * the output will be gaga goo goo.
 */
public class BabyWordFinder {

	public static void main(String[] args) {
		String str = "gagagoogoo";
		String[] arr = {"gag","goo","gaga"};
		Babyword(arr,str);		
	}

	public static void Babyword(String[] arr, String str ){
		String result = "";		
		for (int i = 0; i < str.length(); i++) {
			for (int j = str.length()-1; j >= i+1; j--) {
				String curr = str.substring(i, j + 1);
				boolean bool = wordMatch(arr,curr);
				if(bool == true){					
					result = result+curr+" ";
					i = result.length()-3;					
					break;
				}
			}
		} 
		System.out.println(result);
	}
	
	public static Boolean wordMatch(String[] arr, String ip ){		
		for(int i = 0; i < arr.length; i++){
			if(arr[i].equals(ip)){
				return true;
			}
		}
		return false;
	}
}
