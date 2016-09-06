import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Modu {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = {1,2,3,4,1};
		//myFun(k, arr);
		//int[] op = SubArraySumModK(arr, k);
		//System.out.println(op[0]);
		/*for(int i : op){
			System.out.println(i);
		}*/
		SubArraySumModK(arr, k);
	}
	
	
	public static void SubArraySumModK(int A[], int K)
	{
		int sum = 0, count = 0;
		Map<Integer, ArrayList<Integer>> candidates = new HashMap<Integer, ArrayList<Integer>>();

		for(int i=0; i<A.length; i++)
		{
			sum += A[i];
			if(!candidates.containsKey(sum%K) || !candidates.containsKey(sum%A[i])){
				candidates.put(sum%K, new ArrayList<Integer>());
				count++;
			}			
		}
		
		System.out.println(count);

		//output all the pairs for each of the key
	}

	
	public static void myFun(int K, int[] arr){
		int sum = 0, count = 0;
		for(int i = 0; i < arr.length; i++){
			sum = 0;
			for(int j = i; j < arr.length; j++){
				sum += arr[j];
				if(sum%K == 0){
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	
	
	
	/*public static int[] SubArraySumModK(int A[], int K) {
	    int sum = 0;
	    Map<Integer, Integer> candidates = new HashMap<Integer, Integer>();

	    for (int i = 0; i < A.length; i++) {
	        sum += A[i];
	        if (!candidates.containsKey(sum % K)) {
	            candidates.put(sum % K, i);
	        } else {
	            // a subarray found
	            return Arrays.copyOfRange(A, candidates.get(sum % K) + 1, i+1);
	        }
	    }
	    return null;
	}
*/
}
