package Basic_Array_Programs;

public class Access_array_usingWhileLoop {
	public static void main(String[] args) {
		int[] a = new int[] { 10, 20, 30, 40 };
		int i = 0;

		while (i < a.length) {
			System.out.println(a[i]);
			i++;
		}

	}
}