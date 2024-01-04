package brocode.OOP;

/**
 * StationaryBox
 */
public class StationaryBox {

	void put(Pencils pencil) {
		System.out.println("The " + pencil.name + " is put into the box");
	}

	public static void main(String[] args) {

		StationaryBox box = new StationaryBox();

		Pencils pencil = new Pencils("Apsara", 5);
		Pencils pencil2 = new Pencils("Nataraj", 7);

		box.put(pencil);
		box.put(pencil2);
	}

}
