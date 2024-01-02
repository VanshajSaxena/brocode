package brocode.OOP;

/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		Car carOne = new Car();
		Car carTwo = new Car();

		System.out.println(carOne.name);
		System.out.println(carOne.model);
		System.out.println();
		System.out.println(carTwo.name);
		System.out.println(carTwo.model);

		carOne.drive();
		carOne.brake();
		carTwo.drive();
		carTwo.brake();


	}
}
