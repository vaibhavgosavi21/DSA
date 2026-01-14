package Basic_Array_Programs;

public class Reverse_array_usingDoWhileLoop {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int i=arr.length-1;
		do {
			System.out.print(arr[i]+" ");
			i--;
		}while(i>=0);
	}
}
