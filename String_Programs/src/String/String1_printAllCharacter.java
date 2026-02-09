//WAPT print all characters line by line in a given string

package String;

public class String1_printAllCharacter {

	public static void main(String[] args) {
		String str= "Hello";
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			System.out.println(ch);
		}

	}

}
