//WAPT store only Special charcter inside the new String
package String;

import java.util.Scanner;

public class String23_storeOnlySpecialCharcterInsideNewString {
	public static String specialcharacter(String str) {
		String schar="";
		for(int i=0; i<=str.length()-1; i++) {
			char ch=str.charAt(i);
			if(!((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9'))) {
				schar=schar+ch;
			}
		}
		return schar;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		
		System.out.println("Special characters in string are: "+specialcharacter(str));
	}

}
