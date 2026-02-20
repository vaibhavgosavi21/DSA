//WAPT store only alphabets in new string object
package String;

import java.util.Scanner;

public class String22_storeOnlyAlphabetsInsideNewString {
	public static String alpha(String str) {
		String alpha="";
		for(int i=0; i<=str.length()-1; i++) {
			char ch=str.charAt(i);
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
				alpha=alpha+ch;
			}
		}
		return alpha;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		
		System.out.println("Alphabets in String are: "+alpha(str));
		
	}
}
