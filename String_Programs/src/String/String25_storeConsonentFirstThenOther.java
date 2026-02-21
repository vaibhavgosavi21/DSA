//WAPT store consonent first then store other characters
package String;

import java.util.Scanner;

public class String25_storeConsonentFirstThenOther {
	public static String consonentfirst(String str) {
		String consonent = "";
		String other = "";

		for (int i = 0; i < str.length(); i++) {

	        char ch = str.charAt(i);

	        // If alphabet
	        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

	            // If vowel
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

	                other = other + ch;   // vowel

	            } else {
	                consonent = consonent + ch;  // consonant
	            }

	        } else {
	            other = other + ch;   // numbers & special characters
	        }
	    }

	    return consonent + other;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();

		System.out.println("Print consonentfirst ther other character from String: " + consonentfirst(str));
	}
}