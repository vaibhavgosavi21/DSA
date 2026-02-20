//WAPT store only Lowercase characters inside new string object
package String;

import java.util.Scanner;

public class String17_StoreOnlyLowercaseInsideNewString {
	
	public static String storeLoercase(String str) {
		String lower="";
		for(int i=0; i<=str.length()-1; i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				lower=lower+ch;
			}
		}
		return lower;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		
		System.out.println("Lowercase Charcter: "+storeLoercase(str));
		
		
	}

}
