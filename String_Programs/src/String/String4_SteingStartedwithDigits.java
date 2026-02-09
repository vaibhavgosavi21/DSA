//WAPT check whether string is started with digits or not

package String;

public class String4_SteingStartedwithDigits {
	public static void main(String[] args) {
		String str="5gdfg345";
		char ch=str.charAt(0);
		
		if(ch>='0' && ch<='9') {
			System.out.println(str+" String is started with number");
		}else {
			System.out.println(str+" String is not started with number");
		}
	}

}
