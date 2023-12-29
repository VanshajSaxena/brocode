package brocode;

/**
 * Arrays
 */
public class Arrays {

	public static void main(String[] args) {

		String[] fruits = {"banana", "mango", "apple"};

		fruits[2] = "grapes";

		System.out.println(fruits[2]);

		String[] names = new String[10];

		names[0] = "Vanshaj";
		names[1] = "Arastu";
		names[2] = "Siraj";
		names[3] = "Dhairya";
		names[4] = "Anmol";
		names[5] = "Deepak";
		names[5] = "Kunal";
		names[6] = "Deepanshu";
		names[7] = "Yash";
		names[8] = "Prashant";
		names[9] = "";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		
	}
}
