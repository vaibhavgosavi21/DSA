//WAPT check whether String is started with vowels or not

package String;

public class String2_StringStartedWithVowels {
	public static void main(String[] args) {
		String str="india";
		
		char ch=str.charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println("String is started with vowels");
		}else {
			System.out.println("String is not started with vowels");
		}
	}

}
