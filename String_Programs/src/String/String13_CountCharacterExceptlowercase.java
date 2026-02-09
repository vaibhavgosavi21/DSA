//WAPT count total no of character except lowercase characters
package String;

public class String13_CountCharacterExceptlowercase {
	public static void main(String[] args) {
		String str="Vaibhav dsgS";
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(!(ch>='a' && ch<='z') ){
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("Total no of charcters except lowercase charcters are:"+count);
	}

}
