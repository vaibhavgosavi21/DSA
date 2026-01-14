package Basic_Array_Programs;

public class Access_array_usingDo_WhileLoop {
	public static void main(String[] args) {
		int[]a=new int[] {10,20,30,40,50};
		int i=0;
		do {
			System.out.println(a[i]);
			i++;
		}while(i<a.length);
	}

}
