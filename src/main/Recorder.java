package main;

import player.Player;

public class Recorder {

	public void printWinner(String winner) {
		
		System.out.println("승자를 기록합니다.");
		System.out.println(winner+"이(가) 승리했습니다.!");
	}
	
	public void getRoundResult(Player playerA, Player playerB) {
		
		System.out.print(playerA.getName()+":"+playerA.getTotal()+"["+playerA.getState()+"]\t");
		System.out.println(playerB.getName()+":"+playerB.getTotal());
	}
	
}
