//WAPT store only digits inside new String object
package String;

import java.util.Scanner;

public class String18_storeOnlyDigitsInsideNewString {
	
	public static String Digits(String str) {
		String digit="";
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9') {
				digit=digit+ch;
			}
		}
		return digit;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.next();
		
		System.out.println("Digits in string are: "+Digits(str));
	}


}
