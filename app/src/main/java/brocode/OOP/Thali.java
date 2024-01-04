package brocode.OOP;

/**
 * Thali
 * Overloded Constructors
 */

public class Thali {

	String size;
	String type;
	String name;
	double prize;

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

	Thali(String name, String type, String size, double prize) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.prize = prize;
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
		System.out.println("Thali prize: " + thaliOne.prize);
		System.out.println();
		System.out.println("Here is the Thali that you ordered: " + thaliTwo.name);
		System.out.println("Thali type: " + thaliTwo.type);
		System.out.println("Thali size: " + thaliTwo.size);
		System.out.println("Thali prize: " + thaliTwo.prize);
		System.out.println();
		System.out.println("Here is the Thali that you ordered: " + thaliThree.name);
		System.out.println("Thali type: " + thaliThree.type);
		System.out.println("Thali size: " + thaliThree.size);
		System.out.println("Thali prize: " + thaliThree.prize);
		System.out.println();
		System.out.println("Here is the Thali that you ordered: " + thaliFour.name);
		System.out.println("Thali type: " + thaliFour.type);
		System.out.println("Thali size: " + thaliFour.size);
		System.out.println("Thali prize: " + thaliFour.prize);
		System.out.println();
		System.out.println("Here is the Thali that you ordered: " + thaliFive.name);
		System.out.println("Thali type: " + thaliFive.type);
		System.out.println("Thali size: " + thaliFive.size);
		System.out.println("Thali prize: " + thaliFive.prize);

	}

}
