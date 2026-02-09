//WAPT print only one uppercase character in given string

package String;

public class String6_onlyOneUppercaseCharacter {
	public static void main(String[] args) {
		String str="GoldMaN";
		System.out.println("Uppercase letter in the strinf are: ");

		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				System.out.println(ch);
			}
		}
	}

}
