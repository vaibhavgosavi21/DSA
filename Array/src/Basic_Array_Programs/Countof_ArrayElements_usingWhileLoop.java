package Basic_Array_Programs;

public class Countof_ArrayElements_usingWhileLoop {
	public static int totalboofelements(int arr[]) {
		int count = 0;
		int i = 0;
		while (i < arr.length) {
			count++;
			i++;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 30, 40, 50 };

		System.out.println("Total Count: " + totalboofelements(arr));
	}

}
