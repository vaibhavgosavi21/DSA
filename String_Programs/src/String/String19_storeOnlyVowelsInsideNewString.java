//WAPT store only vowels inside a new string
package String;

import java.util.Scanner;

public class String19_storeOnlyVowelsInsideNewString {
	public static String vowels(String str) {
		String vowels="";
		for(int i=0; i<=str.length()-1; i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				vowels=vowels+ch;
			}
		}
		return vowels;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		
		System.out.println("Vowels in String are: "+vowels(str));
	}

}
