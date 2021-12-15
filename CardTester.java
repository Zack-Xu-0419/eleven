/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     * 
     * @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card card1 = new Card("ace", "clubs", 1);
        Card card2 = new Card("jack", "hearts", 11);
        Card card3 = new Card("9", "diamonds", 9);
        Card anotherCard3 = new Card("9", "diamonds", 9);

        // Test accesor Methods
        System.out.print(card1.rank()); // ace
        System.out.print(card2.rank()); // jack
        System.out.println(card3.rank()); // 9
        System.out.print(card1.suit()); // clubs
        System.out.print(card2.suit()); // hears
        System.out.println(card3.suit()); // diamonds
        System.out.print(card1.pointValue()); // 1
        System.out.print(card2.pointValue()); // 11
        System.out.println(card3.pointValue()); // 9

        System.out.println(card3.matches(anotherCard3)); // True
        System.out.println(card3.matches(card1)); // False
        System.out.println(card3); // False

    }
}
