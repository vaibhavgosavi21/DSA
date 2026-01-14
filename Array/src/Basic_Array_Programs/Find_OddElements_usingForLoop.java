package Basic_Array_Programs;

public class Find_OddElements_usingForLoop {
	public static void main(String[] args) {
		int arr[] = { 12, 23, 34, 32, 5, 7 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
