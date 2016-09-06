/**
 * This method is implementing combination formula using dynamic programming.  
 */

/**
 * @author manish
 *
 */
public class CombinationFormulaUsingDP {
	static long[] store;
	public static void main(String[] args) {
		int n = 100, r = 5;	
		long startTime = System.currentTimeMillis();
		combinationFormula(n,r);
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken:"+(endTime - startTime));
	}
	
	/**
	 * This method implements  
	 * @param n
	 * @param r
	 */
	public static void combinationFormula(int n, int r){
		long result = fib(n)/(fib(r)*fib(n-r));
		System.out.println(result);
	}
	
	public static long fib(int input){
		if(store[input] == 0){
			if(input <= 1)
				store[input] = input;
			store[input] = fib(input - 1) + fib(input - 2); 
		}		
		return store[input];			
	}
}
