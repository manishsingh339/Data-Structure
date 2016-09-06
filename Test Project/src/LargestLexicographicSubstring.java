import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestLexicographicSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:-");
		String str = sc.nextLine();				
		List<String> list = new ArrayList<String>();
		for(int i = str.length(); i > 0; i--){
			list.add(largestLexico(str, i));
		}
		Collections.sort(list);		
		System.out.println(list.get(list.size() - 1));
	}
	
	public static String largestLexico(String str, int count) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < str.length(); i = i + 1) {
			if (str.length() - i >= count) {
				list.add(str.substring(i, count + i));
			}
		}
		Collections.sort(list);		
		return list.get(list.size() - 1);
	}
}
