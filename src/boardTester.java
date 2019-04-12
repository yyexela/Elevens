public class boardTester{
    public static void main(String[] args) {
        System.out.println("start program");
        String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
        String[] suits = {"spades", "hearts", "diamonds", "clubs"};
        int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
        ElevensBoard board = new ElevensBoard(9, ranks, suits, pointValues);
        
    }
}