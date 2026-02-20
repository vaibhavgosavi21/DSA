//WAPT check string palindrome or not
package String;

import java.util.Scanner;

public class String21_CheckPalindrome {
	public static boolean palindrome(String str) {
		String reverse="";
		for(int i=str.length()-1; i>=0; i--) {
			char ch=str.charAt(i);
			reverse=reverse+ch;
		}
		return reverse.equals(str);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		
		if(palindrome(str)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}

}
