package brocode.OOP;

import java.util.Random;

/**
 * DiceRoller
 */
public class DiceRoller {

	public DiceRoller() {
		Random random = new Random();
		int number = 0;
		roll(random, number);
	}

	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}

}
