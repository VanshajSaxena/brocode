package brocode.OOP;

/**
 * Computer
 */
public class Computer {

	String processor;
	int generation;
	double price;
	String name;
	String type;

	void shutdown() {
		System.out.println("The compputer is shutting down.");
	}

	void startup() {
		System.out.println("The compputer is starting up.");
	}

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
