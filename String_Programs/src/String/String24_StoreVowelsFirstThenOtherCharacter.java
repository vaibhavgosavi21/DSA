//WAPT store vowels first then store other charcters in new String
package String;

import java.util.Scanner;

public class String24_StoreVowelsFirstThenOtherCharacter {
	public static String vowels(String str) {
		String vowel="";
		String other="";
		
		for(int i=0; i<=str.length()-1; i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O' || ch=='U' ) {
				vowel=vowel+ch;
			}else {
				other=other+ch;
			}
		}
		return vowel+other;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		
		System.out.println("Printing vowels first and other character after from string: "+vowels(str));
	}


}
