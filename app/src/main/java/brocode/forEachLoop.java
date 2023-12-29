package brocode;

import java.util.ArrayList;

/**
 * forEachLoop
 */
public class forEachLoop {

	public static void main(String[] args) {

		//String[] flowers = { "Lily", "Sunflower", "Dandelions", "Daisy" };
		ArrayList<String> flowers = new ArrayList<>();

		flowers.add("Lily");
		flowers.add("Dandelions");
		flowers.add("Sunflower");

		for (String i : flowers) {
			System.out.println(i);
		}
	}
}
