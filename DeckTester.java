/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     * 
     * @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] ranks = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
        String[] suits = { "hearts", "clubs", "diamonds", "spades", "clubs", "hears", "clubs", "spades", "diamonds",
                "diamonds", "club", "spades", "hearts" };
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        Deck testDeck = new Deck(ranks, suits, values);
        System.out.println(testDeck.deal());
        System.out.println(testDeck.deal());
        System.out.println();
        System.out.println(testDeck.toString());
        System.out.println(testDeck.isEmpty());// False
        System.out.println(testDeck.size()); // 11
    }
}
