package insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] myArray= insertionsort(new int [] {1,4,2,7,5,9});
		System.out.println("Insertion Sort:");
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}
	public static int[] insertionsort(int [] a) {
		for(int i=1; i<a.length; i++) {
			int element= a[i];
			int j= i-1;
			while(j>=0 && a[j]> element) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]= element;
		}
		return a;
	}

}
