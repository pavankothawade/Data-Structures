package binarysearch;



public class BinarySearch {

	   public static void main(String args[]){
	         
	    
	      
	        System.out.println(binarysearch(new int[]{23,45,30,65}, 65));
	       
	    }


	 public static int binarysearch(int[] arr,int key){
	int low=0;
	int high= arr.length-1;
	while(low<=high) {
		int mid= (low+high)/2;
		if(key< arr[mid]) {
			high=mid-1;
		}else if(key> arr[mid]) {
			low= mid+1;
		} else return mid;
	}
	return -1;
	     
	    }
	     
	 


}
