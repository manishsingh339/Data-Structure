package Searching;

/*
 * In this example I am implementing the binary search recursively/iteravely.Array should be sorted.
 */
public class BinarySearchArray {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5, 17, 19, 27};
		int result = 0;
		result = binarySearchRec(arr,0,arr.length, 17);
		//result = binarySearchItr(arr,0,arr.length, 17);
		if(result == -1)  System.out.println("Element Not found."); 
		else System.out.println("Element found at "+result);		
		
	}
	
/*
 * This function is implementing the binary search recursively.
 */	
	public static int binarySearchRec(int[] arr, int first, int last, int find){
		if(last >= first){
			int midIdx = (first+last)/2;
			System.out.println("mid: "+midIdx+" element: "+arr[midIdx]);
			if(arr[midIdx] == find){
				return midIdx;
			}else if(arr[midIdx] > find){
				return binarySearchRec(arr,first,midIdx-1,find);
			}else if(arr[midIdx] < find){
				return binarySearchRec(arr,midIdx+1,last,find);
			}
		}
		return -1;
	}
	
/*
 * This function is implementing the binary search iteratively.
 */
	public static int binarySearchItr(int[] arr, int first, int last, int find){
		while(last>=first){
			int midIdx = (first+last)/2;
			if(arr[midIdx] == find) return midIdx;
			else if(arr[midIdx] > find) last = midIdx-1;
			else first = midIdx+1;
		}
		return -1;
	}
}
