//WAPT print digits from string
package String;

public class String8_PrintDigitsfromString {
	public static void main(String[] args) {
		String str="Vai3bhav20237";
		
		System.out.println("Digit in String are:");
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9') {
				System.out.println(ch);
			}
			
		}
		
	}

}
