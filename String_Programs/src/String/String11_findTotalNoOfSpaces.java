//WAPT find total no of spaces  in string
package String;

public class String11_findTotalNoOfSpaces {
	public static void main(String[] args) {
		String str="Vaibhav adn sdkg dsjl";
		
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println("Total no of spaces in spaces in string are: "+count);
	}

}
