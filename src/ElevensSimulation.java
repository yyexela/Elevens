/**
 * This is a class that plays noninteractive games of Elevens.
 * See accompanying documents for a description of how Elevens is played.
 */
import java.text.*;

public class ElevensSimulation {

	/**
	 * The number of games of Elevens to play.
	 */
	private static final int GAMES_TO_PLAY = 1000000;

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		NumberFormat f = new DecimalFormat("##0.000");
		String complete = "";
		int wins = 0;

		for(int i = GAMES_TO_PLAY; i >= 1; i = i/10){
			ElevensBoard board = new ElevensBoard();

			wins = 0;

			for (int k = 0; k < i; k++) {
				if (I_AM_DEBUGGING) {
					System.out.println(board);
				}
				while (board.playIfPossible()) {
					if (I_AM_DEBUGGING) {
						System.out.println(board);
					}
				}
				if (board.gameIsWon()) {
					wins++;
				}
				board.newGame();
			}

			double percentWon = (wins + 0.0)/(i + 0.0) * 100.0;
			System.out.println("Games won:    " + wins);
			System.out.println("Games played: " + i);
			System.out.println("Percent won:  " + percentWon + "%");
			System.out.println("-----------------");
			complete += "" + i + " games: " + f.format(percentWon) + "%, " + '\n';
		}

		System.out.println(complete);
	}
}
