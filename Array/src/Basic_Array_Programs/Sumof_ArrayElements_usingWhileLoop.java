package Basic_Array_Programs;

public class Sumof_ArrayElements_usingWhileLoop {
	
	public static int sumofelemnts(int arr[]) {
		int sum=0;
		int i=0;
		while(i<arr.length) {
			sum=sum+arr[i];
			i++;
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		
		System.out.println("Sum :"+sumofelemnts(arr));
	}
}
