/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//Deck to test
		String[] ranks = {"Two", "Three", "King", "Queen"};
		String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		int[] values = {2, 3, 13, 12};
		Deck deck = new Deck(ranks, suits, values);

		System.out.println("testDeckEmpty: " + testDeckEmpty(deck));
		System.out.println("testDeckSize: " + testDeckSize(deck));
		System.out.println("testDeckDeal: " + testDeckDeal(deck));
	}

	public static boolean testDeckEmpty(Deck deck){
		return !deck.isEmpty();
	}

	public static boolean testDeckDeal(Deck deck){
		Card card1 = new Card("Queen", "Diamonds", 12);
		Card card2 = new Card("Queen", "Hearts", 12);
		return( deck.deal().matches(card1) && 
				deck.deal().matches(card2)
		);
	}

	public static boolean testDeckSize(Deck deck){
		return( deck.size() == 16 &&
				!(deck.size() == 2)
		);
	}
}
