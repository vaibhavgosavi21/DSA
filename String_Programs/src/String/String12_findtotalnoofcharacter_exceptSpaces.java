//WAPT print all characters except spacess 
package String;

public class String12_findtotalnoofcharacter_exceptSpaces {
	public static void main(String[] args) {
		
		String str="My name is vaibhav and i am an Developer";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch!=' '){
				System.err.print(ch);
			}
			count++;
		}
		System.out.println();
		System.out.println("Total not charcters without spaces: "+count);
	}
	
}
