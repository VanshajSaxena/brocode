package brocode.OOP;

/**
 * Cars
 */
public class Car {

	private String name;
	private String model;
	private int year;
	private double price;

	public Car(Car x) {
		this.copy(x);
	}

	public Car(String name, String mode, int year, double price) {
		this.name = name;
		this.model = mode;
		this.year = year;
		this.price = price;
	}

	public void copy(Car x) {
		this.setName(x.getName());
		this.setYear(x.getYear());
		this.setPrice(x.getPrice());
		this.setModel(x.getModel());
	}

	void drive() {
		System.out.println("You drive the Car.");
	}

	void brake() {
		System.out.println("you break the Car.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String mode) {
		this.model = mode;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
