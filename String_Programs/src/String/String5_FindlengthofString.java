//WAPT find length of String without using length()

package String;

public class String5_FindlengthofString {
	public static void main(String[] args) {
		
		String str="Vaibhav";
		char ch[]=str.toCharArray();
		
		System.out.println(str+" length is: "+ch.length);
		
							//OR
		
		int count=0;
		for(char c:ch) {
			count++;
		}
		System.out.println("String length is:"+count );
		}
	
						
	
	
}
