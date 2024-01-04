package brocode.OOP;

/**
 * Smartphone
 */
public class Smartphone extends Computer {

	String size = "5.5 inches";

	@Override
	void shutdown() {
		System.out.println("The Smartphone is shutting down.");
	}

	@Override
	void startup() {
		System.out.println("The Smartphone is starting up.");
	}

}
