//WAPT print all charcters in reverse order
package String;

public class String14_ReverseString {
	
	public static void main(String[] args) {
		String str="abcdefgh";
		
		for(int i=str.length()-1; i>=0; i--) {
			char ch=str.charAt(i);
			System.out.println(ch);
		}
	}

}
