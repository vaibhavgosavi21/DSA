package Basic_Array_Programs;

public class Countof_ArrayElements_usingForLoop {

	public static int totalboofelements(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 30, 40, 50 };

		System.out.println("Total Count: " + totalboofelements(arr));
	}

}
