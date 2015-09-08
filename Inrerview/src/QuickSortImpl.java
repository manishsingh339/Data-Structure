import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

	public class QuickSortImpl {	     
	    private static int[] array = null;	    
	 
	    private static void quickSort(int lowerIndex, int higherIndex) {
	         
	        int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        System.out.println("pivot: "+pivot+" LowerIndex: "+lowerIndex+" HigherIndex: "+higherIndex);
	        // Divide into two arrays
	        while (i <= j) {
	            /**
	             * In each iteration, we will identify a number from left side which
	             * is greater then the pivot value, and also we will identify a number
	             * from right side which is less then the pivot value. Once the search
	             * is done, then we exchange both numbers.
	             */
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	            for(int currEle:array){
		            System.out.print(currEle+" ");	            
		        }
	            System.out.println();
	        }	        
	        
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    }
	 
	    private static void exchangeNumbers(int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	     
	    public static void main(String a[]){	    	
	    	array = new int[] {5,2,4,6,1,3};
	        quickSort(0,array.length-1);
	        for(int i:array){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
	}