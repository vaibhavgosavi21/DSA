//WAPT reverse a string and store it in new object

package String;

import java.util.Scanner;

public class String15_reverseAndStoreInsideNewObject {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		
		System.out.println(rev(s));
	}
	
	public static String rev(String str) {
		String res="";
		
		for(int i=str.length()-1; i>=0; i--) {
			char ch=str.charAt(i);
			res=res+ch;
		}
		return res;
	}

}
