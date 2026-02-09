//WAPT print only Lowercase character in string
package String;

public class String7_onlyLowercaseCharacter {
	public static void main(String[] args) {
		String str="GoldMaN";
		System.out.println("Lowercase letter in the strinf are: ");

		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				System.out.println(ch);
			}
		}
	}

}
