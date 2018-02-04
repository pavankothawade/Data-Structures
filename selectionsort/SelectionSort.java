package selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] myArray= selectionsort(new int [] {1,4,2,7,5,9});
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	public static int [] selectionsort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			int min= i;
			for(int j=i+1; j<a.length; j++ ) {
				if(a[j] < a[min]) {
					min= j;
				}
				
					
			}
			int temp= a[i];
			a[i]= a[min];
			a[min]= temp;
		}
		return a;
	}

}
