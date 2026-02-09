// WAPT check string started with consonent or not
//Consonent means character other than vowels

package String;

public class String3_startedwithConsonent {
	public static void main(String[] args) {
		String str="Vaibhav";
		char ch=str.charAt(0);
		
		if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
			System.out.println("String is started with Consonent");
		}else {
			System.out.println("String is not started with Consonent");
		}
	}

}
