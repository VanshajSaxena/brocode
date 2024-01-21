package brocode.OOP;

import java.util.Scanner;

/**
 * DynamicPolymorphism
 */
public class DynamicPolymorphism {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Computer computer;

		System.out.println("do you want a phone(1) or a desktop(2)?");
		int choice = sc.nextInt();

		if (choice == 1) {
			computer = new Smartphone();
			computer.startup();
		} else if (choice == 2) {
			computer = new Desktop();
			computer.startup();
		} else {
			System.out.println("Invalid choice.");
		}

		sc.close();

	}
}
