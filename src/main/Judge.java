package main;

import player.*;

public class Judge {

	private FraudPlayer playerA;
	private Player playerB;
	private Recorder recorder;
	private int round;

	public Judge() {

	}

	public Judge(FraudPlayer playerA, Player playerB) {
		this.playerA = playerA;
		this.playerB = playerB;

		this.recorder = new Recorder();
	}

	public void startGame() {

		for (int i = 0; i < round; i++) {
			goRound();
		}

		decideWinner();
	}

	private void goRound() {

		selectPlay();
		playerB.play();

		recorder.getRoundResult(playerA, playerB);
	}

	private void decideWinner() {

		String winner;

		if (playerA.getTotal() > playerB.getTotal()) {
			winner = playerA.getName();
		} else
			winner = playerB.getName();

		recorder.printWinner(winner);
	}

	private void selectPlay() {

		int gap = 6;

		if (playerA.getTotal() < playerB.getTotal() ) {
			playerA.play("STRONG");
		} else if (playerA.getTotal() > playerB.getTotal() + gap) {
			playerA.play("WEAK");
		} else {
			playerA.play("NORMAL");
		}

	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

}
