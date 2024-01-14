package brocode.OOP;

/**
 * Thali
 * Overloded Constructors
 */

public class Thali {

	String size;
	String type;
	String name;
	double price;

	Thali() {
	}

	Thali(String name) {
		this.name = name;
	}

	Thali(String name, String type) {
		this.name = name;
		this.type = type;
	}

	Thali(String name, String type, String size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}

	Thali(String name, String type, String size, double price) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.price = price;
	}

	public static void main(String[] args) {
		Thali thaliOne = new Thali();
		Thali thaliTwo = new Thali("IndianDelux");
		Thali thaliThree = new Thali("IndianDelux", "Veg");
		Thali thaliFour = new Thali("IndianDelux", "Veg", "Medium");
		Thali thaliFive = new Thali("IndianDelux", "Veg", "Medium", 400);

		System.out.println("Here is the Thali that you ordered: " + thaliOne.name);
		System.out.println("Thali type: " + thaliOne.type);
		System.out.println("Thali size: " + thaliOne.size);
		System.out.println("Thali price: " + thaliOne.price);
		System.out.println();
		System.out.println("Here is the Thali that you ordered: " + thaliTwo.name);
		System.out.println("Thali type: " + thaliTwo.type);
		System.out.println("Thali size: " + thaliTwo.size);
		System.out.println("Thali price: " + thaliTwo.price);
		System.out.println();
		System.out.println("Here is the Thali that you ordered: " + thaliThree.name);
		System.out.println("Thali type: " + thaliThree.type);
		System.out.println("Thali size: " + thaliThree.size);
		System.out.println("Thali price: " + thaliThree.price);
		System.out.println();
		System.out.println("Here is the Thali that you ordered: " + thaliFour.name);
		System.out.println("Thali type: " + thaliFour.type);
		System.out.println("Thali size: " + thaliFour.size);
		System.out.println("Thali price: " + thaliFour.price);
		System.out.println();
		System.out.println("Here is the Thali that you ordered: " + thaliFive.name);
		System.out.println("Thali type: " + thaliFive.type);
		System.out.println("Thali size: " + thaliFive.size);
		System.out.println("Thali price: " + thaliFive.price);

	}

}
