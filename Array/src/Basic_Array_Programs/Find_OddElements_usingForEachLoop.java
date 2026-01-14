package Basic_Array_Programs;

public class Find_OddElements_usingForEachLoop {
	public static void odd(int arr[]) {
		for (int a : arr) {
			if (a % 2 != 0) {
				System.out.println(a);
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = { 12, 23, 34, 45, 56, 67 };

		odd(arr);

	}

}
