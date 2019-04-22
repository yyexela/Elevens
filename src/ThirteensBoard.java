import java.util.List;
import java.util.ArrayList;

/**
 * The ThirteensBoard class represents the board in a game of Thirteens.
 */
public class ThirteensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 10;

	private static final boolean I_AM_DEBUGGING = false;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0};

	/**
	 * Creates a new <code>ThirteensBoard</code> instance.
	 */
	 public ThirteensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Thirteens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 13, and (2) a king.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE MODIFIED IN ACTIVITY 11 *** */
		if (selectedCards.size() == 1) {
			return containsK(selectedCards);
		} else if (selectedCards.size() == 2) {
			return containsPairSum13(selectedCards);
		} else {
			return false;
		}
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Thirteens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 13, or (2) a king.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE MODIFIED IN ACTIVITY 11 *** */
		return containsPairSum13(cardIndexes()) || containsK(cardIndexes());
	}

	private boolean containsPairSum13(List<Integer> selectedCards){
		return findPairSum13(cardIndexes()).size() == 2;
	}

	private boolean containsK(List<Integer> selectedCards){
		return findK(cardIndexes()).size() == 1;
	}

	/**
	 * Look for an 13-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 13-pair.
	 * @return a list of the indexes of an 13-pair, if an 13-pair was found;
	 *         an empty list, if an 13-pair was not found.
	 */
	private List<Integer> findPairSum13(List<Integer> selectedCards) {
		/* *** TO BE CHANGED INTO findPairSum13 IN ACTIVITY 11 *** */
		List<Integer> cardsFound = new ArrayList<Integer>();
		for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) {
			int k1 = selectedCards.get(sk1).intValue();
			for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++) {
				int k2 = selectedCards.get(sk2).intValue();
				if (cardAt(k1).pointValue() + cardAt(k2).pointValue() == 13) {
					cardsFound.add(k1);
					cardsFound.add(k2);
					if(I_AM_DEBUGGING) System.out.println("Pair 13 found: " + k1 + ", " + k2);
					return cardsFound;
				}
			}
		}
		return cardsFound;
	}
	
	/**
	 * Look for a king in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a king.
	 * @return a list of the index of a king, if a king was found;
	 *         an empty list, if a king was not found.
	 */
	private List<Integer> findK(List<Integer> selectedCards) {
		/* *** TO BE CHANGED INTO findKing IN ACTIVITY 11 *** */
		List<Integer> cardsFound = new ArrayList<Integer>();
		boolean kingFound = false;
		for (Integer kObj : selectedCards) {
			int k = kObj.intValue();
			if (!kingFound && cardAt(k).rank().equals("king")) {
				kingFound = !kingFound;
				cardsFound.add(k);
				if(I_AM_DEBUGGING) System.out.println("King found: " + k);
			}
		}
		return cardsFound;
	}

	/**
	 * Looks for a legal play on the board.  If one is found, it plays it.
	 * @return true if a legal play was found (and made); false othewise.
	 */
	public boolean playIfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		if(playPairSum13IfPossible() || playKIfPossible()){
			return true;
		}
		return false;
	}

	/**
	 * Looks for a pair of non-face cards whose values sum to 13.
	 * If found, replace them with the next two cards in the deck.
	 * The simulation of this game uses this method.
	 * @return true if an 13-pair play was found (and made); false othewise.
	 */
	private boolean playPairSum13IfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		List<Integer> cardsFound = findPairSum13(cardIndexes());
		if(cardsFound.size() == 2){
			replaceSelectedCards(cardsFound);
			return true;
		};
		return false;
	}

	/**
	 * Looks for a King.
	 * If found, replace it with the next card in the deck.
	 * The simulation of this game uses this method.
	 * @return true if a king play was found (and made); false othewise.
	 */
	private boolean playKIfPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 11 *** */
		List<Integer> cardsFound = findK(cardIndexes());
		if(cardsFound.size() == 1){
			replaceSelectedCards(cardsFound);
			return true;
		};
		return false;
	}
}
