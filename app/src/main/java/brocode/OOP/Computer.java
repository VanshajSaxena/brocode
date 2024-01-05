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
		Desktop desktop = new Desktop();

		desktop.startup();
		desktop.shutdown();
		System.out.println(phone.price);
		System.out.println(phone.size);
		phone.startup();
		phone.shutdown();
		System.out.println(desktop.price);
		System.out.println(desktop.size);
	}
}
