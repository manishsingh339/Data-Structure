import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author manish
 *
 */
public class FibonacciModified {
	static BigInteger[] store;
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int first,second, nth;
		first = console.nextInt();
		second  = console.nextInt();
		nth  = console.nextInt();
		console.close();
		
		first = 0;
		second  = 1;
		//nth  = 5;
		
		store = new BigInteger[nth+1];
		store[0] = new BigInteger(""+first+"");
		store[1] = new BigInteger(""+second+"");
		
		//long startTime = System.currentTimeMillis();
		System.out.println(modifiedFib(nth));
		//long endTime = System.currentTimeMillis();
		//System.out.println("Total Time taken to run: "+(endTime-startTime));
	}
	
	public static BigInteger modifiedFib(int input){
		for(int i = 2; i <= input; i++)
			store[i] = store[i-1].multiply(store[i-1]).add(store[i-2]);
		return store[input]; 
	}

}
