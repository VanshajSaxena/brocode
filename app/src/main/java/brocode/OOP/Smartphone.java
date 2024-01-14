package brocode.OOP;

/**
 * Smartphone
 */
public class Smartphone extends Computer {

	private String size;
	private String processor;
	private double price;
	private String operatingSystem;

	public void setSize(String size) {
		this.size = size;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOperatingsystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public double getPrice() {
		return price;
	}

	public String getOperatingsystem() {
		return operatingSystem;
	}

	public String getSize() {
		return size;
	}

	Smartphone() {
	}

	Smartphone(String size, String processor, double price, String operatingSystem) {
		this.size = size;
		this.processor = processor;
		this.price = price;
		this.operatingSystem = operatingSystem;
	}

	@Override
	void shutdown() {
		System.out.println("The Smartphone is shutting down.");
	}

	@Override
	void startup() {
		System.out.println("The Smartphone is starting up.");
	}

}
