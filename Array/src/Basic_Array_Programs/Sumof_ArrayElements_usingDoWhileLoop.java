package Basic_Array_Programs;

public class Sumof_ArrayElements_usingDoWhileLoop {
	
	public static int sumofelements(int arr[]) {
		int sum=0;
		int i=0;
		
		do {
			sum=sum+arr[i];
			i++;
		}while(i<arr.length);
		return sum;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {12,34,56,23,1};
		
	System.out.println("sum: "+sumofelements(arr));
	}

}
