package WarCardGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Deck {
	
	List<Cards> cards = new ArrayList<Cards>();
	List<String> suits = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
	
	public Deck() {
		for (int d = 2; d < 15; d++) {
			for (String suit : suits) {
				cards.add(new Cards(d, suit));
			}
		}
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Cards draw() {
		return cards.remove(0);
	}
	
}
