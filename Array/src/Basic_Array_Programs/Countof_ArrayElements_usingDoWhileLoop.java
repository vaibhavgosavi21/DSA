package Basic_Array_Programs;

public class Countof_ArrayElements_usingDoWhileLoop {
	public static int totalboofelements(int arr[]) {
		int count = 0;
		int i = 0;
		 do{
			count++;
			i++;
		}while (i < arr.length);
		return count;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 30, 40, 50 };

		System.out.println("Total Count: " + totalboofelements(arr));
	}

}
