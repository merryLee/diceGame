package dice;

public class Dice {

	public int roll() {

		int number = (int) (1 + Math.random() * 5);

		return number;
	}

}
