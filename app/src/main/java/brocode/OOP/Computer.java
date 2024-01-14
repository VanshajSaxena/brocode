package brocode.OOP;

/**
 * Computer
 * The classes associated with this superclass are used to demonstrate
 * inheritance and method overriding
 * in classes brocode.OOP.Smartphone and brocode.OOP.Desktop
 */
public abstract class Computer {

	String processor;
	int generation;
	double price;
	String name;
	String type;

	abstract void shutdown();

	abstract void startup();

	public static void main(String[] args) {

		Smartphone phone = new Smartphone();
		Smartphone phoneTwo = new Smartphone("Medium","Sanpdragon",20000,"Android");
		Desktop desktop = new Desktop();

		desktop.startup();
		desktop.shutdown();
		//System.out.println(phone.price);
		//System.out.println(phone.size);
		System.out.println(phone.getSize());
		System.out.println(phone.getPrice());
		phone.startup();
		phone.shutdown();
		System.out.println(desktop.price);
		System.out.println(desktop.size);

		System.out.println();
		System.out.println(phoneTwo.getSize());
		phoneTwo.setSize("Large");
		System.out.println(phoneTwo.getSize());
		System.out.println(phoneTwo.getPrice());
	}
}
