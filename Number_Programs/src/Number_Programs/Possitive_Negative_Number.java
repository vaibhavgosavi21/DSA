package Number_Programs;

import java.util.Scanner;

public class Possitive_Negative_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=sc.nextInt();
		
		if(number<0) {
			System.out.println(number+" is Negative Number");
		}else if(number>0) {
			System.out.println(number+" is Possitive Number");
		}else {
			System.out.println("It is zero");
		}
	}

}
