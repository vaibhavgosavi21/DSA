package Basic_Array_Programs;

public class Reverse_array_usingWhileLoop {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		int i=arr.length-1;
		while(i>=0) {
			System.out.print(arr[i]+" ");
			i--;
		}

	}
}
