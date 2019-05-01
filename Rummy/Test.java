/**
* Minimalist set of tests for Die, Card, and Deck.
*
* @author Marcel Turcotte (marcel.turcotte@uottawa.ca)
*/

public class Test {

    /**
    * The method prints "success" on the standard output if <code>result</code> and
    * <code>expected</code> are equals, and error message otherwise.
    *
    * @param result some result
    * @param expected the expected value
    */

    private static void assertEquals(int result, int expected) {

        if (result == expected) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail: expected value = "+expected+", actual value = "+result);
        }

    }

    /**
    * The method prints "success" on the standard output if <code>result</code> and
    * <code>expected</code> are equals, and error message otherwise.
    *
    * @param result some result
    * @param expected the expected value
    */

    private static void assertEquals(boolean result, boolean expected) {

        if (result == expected) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail: expected value = "+expected+", actual value = "+result);
        }

    }

    /**
    * Tests some of the methods of the class <code>Die</code>.
    */

    private static void testDice() {

        System.out.println("testDice():");

        Die d;
        int[] counts;

        d = new Die();
        counts = new int[6];

        for (int i=0; i<120000; i++) {

            int value;
            value = d.getValue();

            if (value < 1 || value > 6) {
                System.err.println("Failed: "+value+" is not a valid value!");
                return;
            }

            counts[value-1] = counts[value-1] + 1;

            d.roll();
        }

        System.out.print("counts: ");

        for (int i=0; i<counts.length; i++) {
            if (i>0) {
                System.out.print(", ");
            }
            System.out.print(counts[i]);
        }

        System.out.println();

        System.out.println();

    }

    /**
    * Tests some of the methods of the class <code>Card</code>.
    */

    private static void testCard() {

        System.out.println("testCard():");

        Card a, b, c;

        a = new Card(2, 7);
        b = new Card(2, 7);
        c = new Card(0, 9);

        System.out.println(c);

        assertEquals(c.getSuit(), 0);
        assertEquals(c.getRank(), 9);

        assertEquals(a.equals(b), true);
        assertEquals(a.equals(c), false);

        System.out.println();
    }

    /**
    * Tests some of the methods of the class <code>Deck</code>.
    */

    private static void testDeck() {

        System.out.println("testDeck():");

        Deck hand, deck;

        hand = new Deck();

        assertEquals(hand.hasCards(), false);

        hand.add(new Card(Card.HEART, 10));
        hand.add(new Card(Card.CLUB, 10));
        hand.add(new Card(Card.SPADE, 10));

        assertEquals(hand.isKind(), true);
        assertEquals(hand.isSeq(), false);

        while (hand.hasCards()) {
            Card c;
            c = hand.removeFirst();
            assertEquals(c.getRank(), 10);
        }


        for (int i=7; i<12; i++) {
            hand.add(new Card(Card.SPADE, i));
        }

        assertEquals(hand.isKind(), false);
        assertEquals(hand.isSeq(), true);

        hand.add(new Card(Card.HEART, 12));

        assertEquals(hand.isSeq(), false);

        deck = new Deck(13);

        assertEquals(deck.size(), 52);

        assertEquals(deck.contains(new Card(Card.SPADE, 2)), true);

        assertEquals(deck.containsAll(hand), true);

        assertEquals(hand.containsAll(deck), false);

        System.out.println();

    }

    /**
    * In Java, an application must have a <code>main</code> method. Its signature must
    * exactly as below. Otherwise, the virtual machinine will fail to find
    * the entry point to your program. On the command line, you can run
    * this program as follows:
    * <pre>
    * $ java Test
    * </pre>
    * See <a href="https://docs.oracle.com/javase/tutorial/getStarted/application/index.html">https://docs.oracle.com/javase/tutorial/getStarted/application/index.html</a>.
    *
    * @param args the parameters passed on the command line when executing the program
    */

    public static void main(String[] args) {

        testDice();

        testCard();

        testDeck();

    }

}