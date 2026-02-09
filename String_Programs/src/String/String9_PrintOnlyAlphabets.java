//WAPT print only Alphabets from string
package String;

public class String9_PrintOnlyAlphabets {
	public static void main(String[] args) {
		String str="35624hksf9SA";
		
		int count =0;
		System.out.println("Alphabets in String are:");
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')) {
				System.err.println(ch);
				count++;
			}
		}
		System.out.println("Total no of aplabaets in string: "+count);
	}

}
