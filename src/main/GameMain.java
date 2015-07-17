package main;

import player.*;

public class GameMain {

	public static void main(String[] args) {

		int round = 5;

		FraudPlayer playerA = new FraudPlayer("피카츄");
		Player playerB = new Player("이선민");

		Judge judge = new Judge(playerA, playerB);

		judge.setRound(round);

		judge.startGame();
	}

}
