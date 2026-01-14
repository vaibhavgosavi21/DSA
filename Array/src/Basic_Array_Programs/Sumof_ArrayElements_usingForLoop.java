package Basic_Array_Programs;

public class Sumof_ArrayElements_usingForLoop {
	
	
	public static int sumofelements(int arr[]) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int arr[]= {12,34,56,23};
		
		System.out.println("Sum: "+sumofelements(arr));
		
		
	}

}
