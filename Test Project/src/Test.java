import java.util.HashMap;
import java.util.Scanner;

public class Test {
	static HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
	static int track =0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int start,end;
		for(int i = 0 ; i < size; i++){
			start = in.nextInt();
			end = in.nextInt();
			chackRange(start,end);
		}
	}
	
	public static void chackRange(int start, int end){
		boolean b = false;
		int count = 0;
		for(int i = start; i <= end; i++){
			b = isPrimeNumber(i);
			if(b){
				count++;
			}else{
				int len = (int) Math.log10(i)+1;
				int track = 0;
				for(int j = 0; j < len; j++){
					b = isPrimeNumber(i);
					if(b){
						count++;
						break;
					}else{
						track++;
						b = isPrimeNumber(i%(10*track));
						if(b)
							count++;
					}
				}
			}
		}
		System.out.println(count);
	}
	
	
	public static boolean isPrimeNumber(int number){   
		if(number < 2)
			return false;
		
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        hm.put(number, true);
        return true;
    }

}
