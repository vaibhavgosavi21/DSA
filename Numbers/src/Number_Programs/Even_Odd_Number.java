package Number_Programs;

import java.util.Scanner;

public class Even_Odd_Number {
	//2,4,6,8,.... Even Number
	//1,3,5,7,.... Odd Number

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=sc.nextInt();
		
		if(number%2==0) {
			System.out.println(number+" is Even Number");
		}else {
			System.out.println(number+" is Odd Number");

		}
		
	}

}
