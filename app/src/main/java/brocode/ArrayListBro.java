package brocode;

import java.util.ArrayList;

/**
 * ArrayLists
 */
public class ArrayListBro {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();

		food.add("Dal");
		food.add("Roti");
		food.add("Rice");
		
		food.set(2, "Aloo");
		food.remove(1);
		//food.clear();

		for (int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
	}
}
