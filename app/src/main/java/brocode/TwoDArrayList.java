package brocode;

import java.util.ArrayList;

/**
 * TwoDArrayList
 */
public class TwoDArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> vegetableList = new ArrayList<>();
		vegetableList.add("potato");
		vegetableList.add("tomato");
		vegetableList.add("Garlic");

		ArrayList<String> productList = new ArrayList<>();
		productList.add("Soap");
		productList.add("Shampoo");
		productList.add("Detergent");

		ArrayList<String> bakeryList = new ArrayList<>();
		bakeryList.add("Buns");
		bakeryList.add("Bread");
		bakeryList.add("Pastries");

		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

		groceryList.add(vegetableList);
		groceryList.add(productList);
		groceryList.add(bakeryList);

		System.out.println(groceryList.get(2).get(2));
	}
}
