package brocode.OOP;

/**
 * Food
 * Arrays
 */
public class Food {

	String name;

	Food(String name){
		this.name = name;
	}


	public static void main(String[] args) {

		Food[] basket = new Food[4];

		Food food1 = new Food("Paratha");
		Food food2 = new Food("Roti");
		Food food3 = new Food("Chawal");
		
		basket[0] = food1;
		basket[1] = food2;
		basket[2] = food3;

		System.out.println(basket[0].name);
		System.out.println(basket[1].name);
		System.out.println(basket[2].name);
	}
}
