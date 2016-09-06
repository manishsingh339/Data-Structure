import java.util.HashMap;

import com.sun.crypto.provider.HmacMD5;

/*
 * This code finds the all prime in a range.
 */
public class PrimeRangeDP {
	static HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>(); 
	public static void main(String[] args) {
		int start = 1;
		int end = 1000;
		StringBuffer sBuffer = new StringBuffer();
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < end; i++){
			if(isPrimeNumber(i))
				sBuffer += i;
		}		
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time in normal approach:"+(endTime - startTime));
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < end; i++){
			
		}		
		endTime = System.currentTimeMillis();
		System.out.println("Total Time in normal approach:"+(endTime - startTime));
		
	}
	
	
	public static boolean isPrimeNumber(int number){   
		if(number < 2)
			return false;
		
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }     
        return true;
    }
	
	public static boolean isPrimeNumberDP(int number){   
		if(number < 2)
			return false;
		if(hm.get(number) != null)
			return true;
		
        for(int i=2; i<=number/2; i++){
            if(number % i == 0)
                return false;           
        }
        hm.put(number, true);
        return true;
    }
	
}
