//WAPT store only Uppercase inside new String object
package String;

import java.util.Scanner;

public class String16_storeOnlyUppercaseInsideNewObject {
	
	public static String Uppercase(String str) {
		String rev="";
		for(int i=0; i<=str.length()-1; i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				rev=rev+ch;
			}	
		}
		return rev;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		System.out.println("Uppercase Character:"+Uppercase(str));
		
		
	}

}
