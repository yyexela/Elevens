/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		System.out.println("testCardGetters: " + testCardGetters());
		System.out.println("testCardMatch: " + testCardMatch());
		System.out.println("testCardToString: " + testCardToString());
	}

	public static boolean testCardMatch(){
		Card twoHearts1 = new Card("Two", "Hearts", 2);
		Card twoHearts2 = new Card("Two", "Hearts", 2);
		Card oneHearts = new Card("One", "Hearts", 1);

		if(twoHearts1.matches(twoHearts2) &&
			!twoHearts1.matches(oneHearts)) return true;
		else return false;
	}

	public static boolean testCardToString(){
		Card oneHearts = new Card("One", "Hearts", 1);
		if(oneHearts.toString().equals("One of Hearts (point value = 1)") &&
			!(oneHearts.toString().equals("One of Hearts (point value = 2)"))) return true;
		
			else return false;
	}

	public static boolean testCardGetters(){
		Card twoHearts = new Card("Two", "Hearts", 2);
		Card twoHearts1 = new Card("Two", "Hearts", 2);
		Card twoHearts2 = new Card("Two", "Hearts", 2);
		Card oneHearts = new Card("One", "Hearts", 1);

		if(twoHearts.rank().equals("Two") &&
			twoHearts.pointValue() == 2 && 
			twoHearts.suit().equals("Hearts") &&
			!twoHearts.rank().equals("Three") &&
			!(twoHearts.pointValue() == 6) && 
			!twoHearts.suit().equals("Spades")) return true;
		else return false;
	}
}
