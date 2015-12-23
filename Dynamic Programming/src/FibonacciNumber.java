/**
 * This class shows the Fibonacci Number number implementation using Dynamic Programming.
 * There for given input (50) normal recursive approach is taking almost 90sec and dynamic programming is taking 1ms.  
 */

/**
 * @author Manish
 *
 */
public class FibonacciNumber {
	public static long[] store ;
	
	public static void main(String[] args) {	
		int input = 50;
		store = new long[input+1];
		
		long startTime = System.currentTimeMillis();
		System.out.println(fibonacci(input));
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time taken by normal approach: "+(endTime - startTime));
		System.out.println("");
		
		startTime = System.currentTimeMillis();
		System.out.println(fibonacciDP(input));
		endTime = System.currentTimeMillis();
		System.out.println("Total Time taken by dynamic programming approach: "+(endTime - startTime));
	}
	
	/**
	 * Fibonacci series using normal approach.
	 * @param input
	 * @return 
	 */
	private static long fibonacci(int input) {
		if(input <= 1)
			return input;
		return fibonacci(input - 1) + fibonacci(input - 2);					
	}
	
	/**
	 * Fibonacci series using normal using dynamic programming approach.
	 * @param input
	 * @return
	 */
	private static long fibonacciDP(int input) {
		if(store[input] == 0){
			if(input <= 1)
				return input;
			store[input] = (fibonacciDP(input - 1) + fibonacciDP(input - 2));
		}
		return store[input]; 
	}
}