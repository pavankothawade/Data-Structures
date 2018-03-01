package quick_sort;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] inputArray, int start, int end) {
		if(start < end) {
			int pp= partition(inputArray, start, end);
			quickSort(inputArray, start, pp-1);
			quickSort(inputArray, pp+1, end);
		}
	}
	public static int partition(int[] inputArray, int start, int end) {
		int pivot = inputArray[end];
		int i= start-1;
    	for(int j= start; j <= end-1; j++) {
    		if(inputArray[j] <= pivot) {
    			i++;
    			int ival = inputArray[i];
    			int jval = inputArray[j];
    			inputArray[i] = jval;
    			inputArray[j] = ival;
    		}
    	}
		
    	int ival = inputArray[i+1];
    	inputArray[end] = ival;
    	inputArray[i+1] = pivot;
    	
    	return i+1;
	}
	public static void main(String[] args) {
		
		int[] arr = {1,4,8,2,9,3};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
