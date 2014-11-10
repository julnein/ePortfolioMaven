package palindrom;

public class Palindrom {

	public static boolean isPalindrom(String input){
		String a = input.toLowerCase();
		String b = new StringBuilder(a).reverse().toString();
		return a.equals(b);
	}
}
