package brocode.OOP;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * NewClass
 */
public class NewClass {

	public static void main(String[] args) {
		ArrayList<Character> alphabets = new ArrayList<>();
		ArrayList<Character> stringInput = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();

		// add alphabets to alphabets arraylist
		for (char i = 'a'; i <= 'z'; i++) {
			alphabets.add(i);
		}
		System.out.println(alphabets);

		// prompt user to enter a string
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a string: ");

			String string = scanner.nextLine();

			// convert string to arraylist
			for (Character i : string.toCharArray()) {
				stringInput.add(i);
			}
		}

		// store the index of each character in an arraylist
		for (Character i : stringInput) {
			result.add(alphabets.indexOf(i));
		}
		// print the result arraylist
		System.out.println(result);

	}
}
