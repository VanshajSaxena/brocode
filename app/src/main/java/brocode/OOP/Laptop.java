package brocode.OOP;

/**
 * Laptop
 * toString() Overloading
 */
public class Laptop {

	String name;
	String size;
	String price;
	int gen;

	public Laptop(String name, String size, String price, int gen) {
		this.name = name;
		this.size = size;
		this.price = price;
		this.gen = gen;
	}

	public Laptop(String name, String size, String price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public Laptop(String name, String size) {
		this.name = name;
		this.size = size;
	}

	public Laptop(String name) {
		this.name = name;
	}

	public Laptop() {
	}

	public String toString() {
		return name + "\n" + size + "\n" + price + "\n" + gen;
	}

	public static void main(String[] args) {
		Laptop LapOne = new Laptop("HP", "14''", "98000", 10);
		// explicit call
		System.out.println(LapOne.toString());
		System.out.println();
		// implicit call
		System.out.println(LapOne);
	}
}
