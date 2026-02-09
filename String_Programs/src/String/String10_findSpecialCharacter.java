//WAPT print Special character and their count
package String;

public class String10_findSpecialCharacter {
	public static void main(String[] args) {
		
		
		String str="Vaib!~hav@21$dk#78";
		
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
		char ch=str.charAt(i);
		if(!(ch>='a' && ch<='z'|| ch>='A' && ch<='Z' || ch>='0' && ch<='9')) {
			System.out.println(ch);
			count++;
		}
		
	}
		System.out.println("Count of special character: "+count);
		
}

}
