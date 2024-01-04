package brocode.OOP;

import java.util.Random;

/**
 * DiceRoller
 */
public class DiceRoller {
	Random random;
	int number;

	public DiceRoller() {
		random = new Random();
		roll();
	}

	public void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}

}
