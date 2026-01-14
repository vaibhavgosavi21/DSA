package Basic_Array_Programs;

public class FindSize_without_length_Variable {

	public static int lengthofArray(int a[]) {
		int count = 0;

		for (int arr : a)
		count++;
		return count;

	}

	public static void main(String[] args) {
		int a[] = { 10, 15, 20, 25, 30 };
		System.out.println("Length: " + lengthofArray(a));

	}
}
