package brocode;

/**
 * StringMethods
 */
public class StringMethods {

	public static void main(String[] args) {

		String name = "Vanshaj";

		//boolean result = name.equals("Vanshaj");
		//int result = name.length();
		//char result = name.charAt(6);
		//int result = name.indexOf("j");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.toLowerCase();
		//String result = name.trim();
		String result = name.replace('V', 'A');

		System.out.println(result);
	}
}
