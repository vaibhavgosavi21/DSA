package Basic_Array_Programs;

public class Reverse_array_usingForLoop {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 30 };
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
