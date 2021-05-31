package WarCardGame;

public class WarApp {

	public static void main(String[] args) {
		
	Deck deck = new Deck();
	
	/*
	 * Name our players
	 */
	
	Player player1 = new Player("The Allies");
	Player player2 = new Player("The Axis");
	
	/*
	 * Shuffle up the deck
	 */
	
	deck.shuffle();
	
	/*
	 * build player decks
	 */
	
	for (int c = 0; c < 52; c++) {
		if(c % 2 == 0) {
			player1.draw(deck);
		} else {
			player2.draw(deck);
		}
	
	}
	
	/*
	 * Message to the Players
	 */
	
	System.out.println("Welcome to the Game of WAR!");
	System.out.println(" ");
	System.out.println("Card values start at Two and go the the highest value of ACE.");
	System.out.println(" ");
	System.out.println("Player Decks will appear below so you can verify the outcomes.");
	System.out.println(" ");
	System.out.println("Otherwise sit back a prepare to wage ... WAR!");
	System.out.println(" ");
	
	/*
	 * See Player Hands (shows that each run through changes the players hand
	 */
	
	player1.describePlayer();
	System.out.println(" ");
	player2.describePlayer();
	System.out.println(" ");
	
	/*
	 * play through the game
	 */
	
	for (int cd = 0; cd < 26; cd++) {
		Cards player1Card = player1.flip();
		Cards player2Card = player2.flip();
		if (player1Card.getValue() > player2Card.getValue()) {
			player1.increasePlayerScore();
		} else if (player1Card.getValue() < player2Card.getValue()) {
			player2.increasePlayerScore();
		} else if (player1Card.getValue() == player2Card.getValue()) {
			player1.increaseTieScore();
		}
	}
	
	/*
	 * see final player scores
	 */
	
	System.out.println(player1.getPlayerName() + "'s " + "won " + player1.getPlayerScore() + " battles");
	System.out.println(player2.getPlayerName() + "'s " + "won " + player2.getPlayerScore() + " battles");
	System.out.println("Battles Tied: " + player1.getTieScore());
	System.out.println("Total Battles played is " + (player1.getPlayerScore() + player2.getPlayerScore() + player1.getTieScore())); // shows that it does iterate 26 turns
	System.out.println(" ");
	
	/*
	 * Call the winner
	 */
	
	System.out.println("******************************");
	
	if (player1.getPlayerScore() > player2.getPlayerScore()) {
		System.out.println("The War was WON by " + player1.getPlayerName() + "!");
	} else if (player1.getPlayerScore() < player2.getPlayerScore()) {
		System.out.println("The War was WON by " + player2.getPlayerName() + "!");
	} else {
		System.out.println(player1.getPlayerName() + " " + "&" + " " + player2.getPlayerName() + " DRAW!");
	}
	
	System.out.println("******************************");
	
	}
}