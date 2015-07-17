package dice;

public class FraudDice extends Dice {

	private int fraudNumber;
	
	public int rollWeak() {

		int maxNumber = 5;

		do {
			fraudNumber = roll();
		} while (fraudNumber >= maxNumber);

		return fraudNumber;
	}

	public int rollStrong() {

		int minNumber = 2;

		do {
			fraudNumber = roll();
		} while (fraudNumber <= minNumber);

		return fraudNumber;
	}

}
