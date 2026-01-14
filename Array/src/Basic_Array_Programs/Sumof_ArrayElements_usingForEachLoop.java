package Basic_Array_Programs;

public class Sumof_ArrayElements_usingForEachLoop {
	public static int sumofelements(int arr[]) {
		int sum = 0;

		for (int b : arr)
			sum = sum + b;
		return sum;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 2, 3, 45 };
		System.out.println("Sum: " + sumofelements(arr));
	}

}
