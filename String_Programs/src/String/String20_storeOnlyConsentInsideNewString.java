//WAPT store only consonents inside a new string
package String;

import java.util.Scanner;

public class String20_storeOnlyConsentInsideNewString {
	public static String consonent(String str) {
		String consonent="";
		for(int i=0; i<=str.length()-1; i++) {
			char ch=str.charAt(i);
			if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) {
				consonent=consonent+ch;
			}
		}
		return consonent;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.next();
		
		System.out.println("consonent in String are: "+consonent(str));
	}


}
