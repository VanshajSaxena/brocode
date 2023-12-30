package brocode;

/**
 * Printf
 */
public class Printf {

	public static void main(String[] args) {

		boolean bol = true;
		char character = '.';
		String name = "Arastu";
		int number = 123;
		double pi = 3.14;

		// % [flags] [precision] [width] [conversion-character]

		System.out.printf("%b ", bol);
		System.out.printf("%c ", character);
		System.out.printf("%s ", name);
		System.out.printf("%d ", number);
		System.out.printf("%f ", pi);

		System.out.println();
		System.out.printf("Vanshaj %-30s ", name + ".");
		System.out.printf("%c ", character);
		System.out.printf("%s ", name);
		System.out.printf("%d ", number);

		System.out.println("\r");
		System.out.println("\r");

		System.out.printf("The value of pi is: %f\r", pi);
		System.out.printf("The value of pi is%-20f\r", pi);
		System.out.printf("The value of pi is: %+20f\r", pi);
		System.out.printf("The value of pi is: %1.2f\r", pi);
		System.out.printf("The value of pi is: %20f\r", pi);

	}
}
