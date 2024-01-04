package brocode.OOP;

/**
 * Laptop
 */
public class Laptop {

	String name;
	String size;
	String price;
	int gen;

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
		return  name + "\n" + size + "\n" + price + "\n" + gen;
	}

	public static void main(String[] args) {
		Laptop LapOne = new Laptop();
		System.out.println(LapOne.toString());
	}
}
