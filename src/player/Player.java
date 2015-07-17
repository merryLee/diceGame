package player;

import dice.Dice;

public class Player {

	public String name;
	public String state;
	public int total;
	
	private Dice dice;
	
	public Player() {

	}
	
	public Player(String name) {
		this.name = name;
		this.state = "NORMAL";
		
		this.dice = new Dice();
	}

	public void play() {
		total += dice.roll();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
}
