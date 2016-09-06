package Sorting;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class mergeSort {

	public static void main(String[] args) {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size! ");		
		try {
			int size = Integer.parseInt(bReader.readLine());
			int[] arr = new int[size];			
			for(int i = 0; i < size; i++ ){
				arr[i] = Integer.parseInt(bReader.readLine());
			}
			doMergeSorting(arr, 0, size);
			bReader.close();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
	}

	private static void doMergeSorting(int[] arr, int start, int end) {
		if (start < end) {
			int middle = ( start + end )/2;
			doMergeSorting(arr, start, middle);
			doMergeSorting(arr, middle+1, end);
			merge(arr, start, middle, end);
		}
	}

	private static void merge(int[] A, int start, int mid, int end) {
		//stores the starting position of both parts in temporary variables.
	    int p = start ,q = mid+1;

	    int[] Arr = new int[end-start+1];
	    int k=0;

	    for(int i = start ;i <= end ;i++) {
	        if(p > mid)      //checks if first part comes to an end or not .
	           Arr[ k++ ] = A[ q++] ;

	       else if ( q > end)   //checks if second part comes to an end or not
	           Arr[ k++ ] = A[ p++ ];

	       else if( A[ p ] < A[ q ])     //checks which part has smaller element.
	          Arr[ k++ ] = A[ p++ ];

	       else
	          Arr[ k++ ] = A[ q++];
	   }
	    
	   for ( p = 0 ; p< k ;p ++) {
	     /* Now the real array has elements in sorted manner including both 
	            parts.*/
	       A[ start++ ] = Arr[ p ] ;                          
	   }
	}
	
}
