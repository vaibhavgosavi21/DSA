package Basic_Array_Programs;

public class Productof_ArrayElements_usingForLoop {
	public static int product(int arr[]) {
		int prod = 1;
		for (int i = 0; i < arr.length; i++) {
			prod = prod * arr[i];
		}
		return prod;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		System.out.println("Poduct of Array Elements: " + product(arr));

	}
}
