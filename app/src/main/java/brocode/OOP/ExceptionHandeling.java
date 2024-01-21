package brocode.OOP;

import java.util.Scanner;

/**
 * ExceptionHandeling
 */
public class ExceptionHandeling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a number: ");
			int choice1 = sc.nextInt();
			System.out.println("Enter another number: ");
			int choice2 = sc.nextInt();
			int result = choice1 / choice2;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("You cannot divide by zero.");
		} finally {
			System.out.println("This is the finally block.");
			sc.close();
		}
	}
}
