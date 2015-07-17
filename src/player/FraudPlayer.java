package player;

import dice.FraudDice;

public class FraudPlayer extends Player {

	private FraudDice fraudDice;
	
	public FraudPlayer() {
		
	}

	public FraudPlayer(String name) {
		this.name = name;
		this.state = "fraud";
		
		this.fraudDice = new FraudDice();
	}
	
	public void play(String mode) {
		
		if(mode.equals("STRONG")) {
			total += fraudDice.rollStrong();
		} else if(mode.equals("WEAK")) {
			total += fraudDice.rollWeak();
		} else {
			total += fraudDice.roll();
		}
		
		this.state = mode;
	}
	
}
