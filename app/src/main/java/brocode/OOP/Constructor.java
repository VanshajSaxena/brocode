package brocode.OOP;

/**
 * Constructor
 */
public class Constructor {

	public static void main(String[] args) {
		Human human1 = new Human("Vanshaj",20,50);
		Human human2 = new Human("Arastu",18,60);

		System.out.println(human1.name);
		System.out.println(human2.name);

		human1.drink();
		human2.eat();
	}
}
