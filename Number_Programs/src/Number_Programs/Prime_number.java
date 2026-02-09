package Number_Programs;

import java.util.Scanner;

public class Prime_number {

	public static boolean isprime(int num) {
		if (num <= 1)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;

		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0) {
				return false;
			}

		}
		return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();

		System.out.println(isprime(num) ? "prime number" : "Not a prime number");

	}

}
