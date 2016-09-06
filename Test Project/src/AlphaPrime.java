/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
/**
Chandu is a big fan of primes. He defines another kind of primes alpha-primes. Alpha-primes are defined as primes for which there exists some suffix of a given number which is a prime. For example, 12 is not prime but 12 is alpha prime as there exists a suffix which is a prime. In case of 12, 2 is prime therefore 12 is alpha-prime.
Now, he gives you Q queries of the form L R for which you have to calculate how many alpha-primes are there in the range [L, R].

Input : 
First line contains a single integer Q denoting no. of queries.
Next Q line contains two space separated integers L and R.

Output : 
For each query output the count of alpha-primes in the range [L, R]

Constraints : 
1 <= Q <= 106
1 <= L <= R <= 106

Sample Input(Plaintext Link)
 4
1 2
10 14
110 114
5 5
Sample Output(Plaintext Link)
 1
3
3
1
 */
public class AlphaPrime {
	static HashMap<Long, Boolean> hm = new HashMap<Long,Boolean>();
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            alphaPrimesInRange(line = br.readLine());
        }
        //System.out.println("Hello World!");
    }
    
    public static void alphaPrimesInRange(String range){
    	long start = Integer.parseInt(range.split(" ")[0]);
    	long end = Integer.parseInt(range.split(" ")[1]);
    	int count = 0;
    	for(long i = end; i >= start; i-- ){
    		count += isAlphaPrime(i);
    	}
    	System.out.println(count);
    }
	
	public static int isAlphaPrime(long num){
		if(isPrimeNumberDP(num)){
			//System.out.println(num+" is Alpha Prime");
			return 1;
		}else{
			int len = (int)Math.log10(num)+1;
			for(int j = 1; j < len; j++){
				if(isPrimeNumberDP( num%(10*j) )){
					//System.out.println(num+" is Alpha Prime");
					//break;
					return 1;
				}				
			}
		}
		
		return 0;
	}
    
    public static boolean isPrimeNumberDP(long number){		
		if(number < 2)
			return false;
		//System.out.println(hm.get(number)+" "+number);
		if( (hm.get(number) != null) && (hm.get(number) == true) ){
			return true;
		}else if((hm.get(number) != null) && (hm.get(number) == false)){
			return false;
		}
		
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
            	hm.put(number, false);
                return false;   
             }        
        }
        hm.put(number, true);
        return true;
    }
    
}
