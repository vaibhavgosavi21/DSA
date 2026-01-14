package Basic_Array_Programs;

public class Find_EvenElements_usingWhileLoop {
	public static void main(String[] args) {
		int arr[] = new int[] { 12, 11, 22, 45, 43, 44 };
		int i = 0;
		while (i < arr.length) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
			i++;
		}
	}

}
