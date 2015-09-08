import java.util.Scanner;
import java.util.HashMap;

/*
 *  This code will remove the duplicate from string in O(n/2) using hashMap. 
 */
public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int _nobOfInputs = in.nextInt();
		String[] srtArr = new String[_nobOfInputs];
		in.nextLine();
		for(int i = 0; i<_nobOfInputs; i++){
			srtArr[i] = in.nextLine(); 
		}
		DuplicateRemoveCaller(srtArr);		
	}
	
	public static void DuplicateRemoveCaller(String[] strArr){
		for(int i = 0; i < strArr.length; i++){
			removeDuplicateChar(strArr[i]);
		}
	}
	
	public static void removeDuplicateChar(String str) {
		HashMap<Character,Boolean> hm = new HashMap<Character,Boolean>();
		int len = str.length();
		String newStr = "";
		char chi = 1, chj = 2;
		for(int i = 0, j = len-1; i <= j; j--,i++){
			chi = str.charAt(i);
			chj = str.charAt(j);
			if(hm.get(chi) == null){
				hm.put(chi, true);
				newStr += chi;
			}			
			
			if(hm.get(chj) == null){
				hm.put(chj, true);
				newStr += chj;
			}			
		}
		System.out.println(newStr);
	}
}