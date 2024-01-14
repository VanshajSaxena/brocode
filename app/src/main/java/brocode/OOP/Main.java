package brocode.OOP;

/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		Car carOne = new Car("Kia", "Sonet", 2022, 500000);
		// Car carTwo = new Car("Hyundai", "idk", 2021, 49999);
		Car carTwo = new Car(carOne);

		// carTwo.copy(carOne);

		System.out.println(carOne);
		System.out.println(carTwo);
		System.out.println();
		System.out.println(carOne.getName());
		System.out.println(carOne.getYear());
		System.out.println();
		System.out.println(carTwo.getName());
		System.out.println(carTwo.getYear());

		// carOne.drive();
		// carOne.brake();
		// carTwo.drive();
		// carTwo.brake();

	}
}
