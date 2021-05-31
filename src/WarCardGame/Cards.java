package WarCardGame;

public class Cards {
	
	private int cardValue;
	private String cardName;
	
	
	public Cards(int wordValue, String suit) {
		
		cardValue = wordValue;
		
		switch(wordValue) {
        	case 2: cardName = "Two";
            	break;
        	case 3: cardName = "Three";
        		break;
        	case 4: cardName = "Four";
            	break;
        	case 5: cardName = "Five";
            	break;
        	case 6: cardName = "Six";
        		break;
        	case 7: cardName = "Seven";
            	break;
        	case 8: cardName = "Eight";
            	break;
        	case 9: cardName = "Nine";
            	break;
        	case 10: cardName = "Ten";
            	break;
        	case 11: cardName = "Jack";
            	break;
        	case 12: cardName = "Queen";
            	break;
        	case 13: cardName = "King";
            	break;
        	case 14: cardName = "Ace";
            	break;
		}
	 
	
	/*
	 * Name Constructor 
	 */
		
		cardName = cardName + " of " + suit;
		
	}
	


	public void describeCards() {
		System.out.println(cardName);
	}
	
	
	/*
	 * Getters & Setters
	 */
	
	public int getValue() {
		return cardValue;
	}
	public void setValue(int value) {
			this.cardValue = value;	
	}
	public String getName() {
		return cardName;
	}
	public void setName(String cardName) {
		this.cardName = cardName;
	}
		
}
