package brocode.OOP;

/**
 * Desktop
 */
public class Desktop extends Computer {

	String size = "20 inches";

	@Override
	void shutdown() {
		System.out.println("The Desktop is shutting down.");
	}

	@Override
	void startup() {
		System.out.println("The desktop is starting up.");
	}

}
