package WarCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Cards> hand = new ArrayList<Cards>();
	private int score = 0;
	private String name;
	private int tieScore = 0;
	
	public Player() {
		score = 0;
		tieScore = 0;
	}
	
	public Player(String newName) {
		name = newName;
		score = 0;
		tieScore = 0;
	}
	
	
	public void describePlayer() {
		System.out.println(name + " have the following cards: ");
		for (Cards card : hand) {
			card.describeCards();
		}
	}
	
	public String getPlayerName() {
		return name;
	}

	public Cards flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void increasePlayerScore() {
		score++;
	}
	
	public int getPlayerScore() {
		return score;
	}

	public void increaseTieScore() {
		tieScore++;
	}

	public int getTieScore() {
		return tieScore;
	}
	
}
