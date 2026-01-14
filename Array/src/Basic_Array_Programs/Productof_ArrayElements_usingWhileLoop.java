package Basic_Array_Programs;

public class Productof_ArrayElements_usingWhileLoop {
	
	public static int product(int arr[]) {
		int prod=1;
		int i=0;
		while(i<arr.length) {
			prod=prod*arr[i];
			i++;
		}
		return prod;
	};

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		System.out.println("product: "+product(arr));
	}

}
