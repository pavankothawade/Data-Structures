package recursivelinearsearch;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		System.out.println(reclinsearch(new int[] {1,2, 3, 4}, 3, 4));

	}
public static int reclinsearch(int[] a, int i, int x) {
	int n= a.length-1;
	if(i>n) return -1;
	else if(a[i]== x) return i;
	else {
		System.out.println("Index is" +i);
		return reclinsearch(a, i+1, x);
	}
}
}
