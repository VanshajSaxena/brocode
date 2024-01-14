package brocode.OOP;

/**
 * Galaxies
 */
public class Galaxies implements Constellation, Stars{

	@Override
	public void twinkle() {
		System.out.println("The Sun does not twinkle!");
	}

	@Override
	public void birth() {
		System.out.println("The Orion constellation is born!");
	}

	
}
