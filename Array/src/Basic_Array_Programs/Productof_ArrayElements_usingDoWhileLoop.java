package Basic_Array_Programs;

public class Productof_ArrayElements_usingDoWhileLoop {
	public static int product(int arr[]) {
		int prod = 1;
		int i = 0;

		do {
			prod = prod * arr[i];
			i++;
		} while (i < arr.length);
		return prod;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 2 };

		System.out.println("Peoduct :" + product(arr));
	}

}
