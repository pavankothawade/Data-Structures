package linearsearch;

public class LinearSearch {


	 public static int linerSearch(int[] arr, int key){
         
	        int size = arr.length;
	        for(int i=0;i<size;i++){
	            if(arr[i] == key){
	                return i;
	            }
	        }
	        return -1;
	    }
	     
	    public static void main(String a[]){
	         
	        int[] arr1= {23,45,21,55,234,1,34,90};
	       
	        System.out.println(linerSearch(arr1, 34));
	        int[] arr2= {123,445,421,595,2134,41,304,190};
	       
	        System.out.println(linerSearch(arr2, 421));
	    }



}