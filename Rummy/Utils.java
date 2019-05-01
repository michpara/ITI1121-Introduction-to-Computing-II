/**
* Provides several class methods that can be of use to solve
* assignment 1.
*
* @author Marcel Turcotte (marcel.turcotte@uottawa.ca)
*/

import java.io.Console;

public class Utils {

    private static Console console = System.console();

    /**
    * Displays a message on the console and reads the input from the user.
    * The expected anser is "yes" or "no". It will keep asking the user for
    * an input as long as the not valid.
    *
    * @param message the message displayed on the Console
    * @return true if the answer was yes and false if the answer was no
    */

    public static boolean readYesOrNo(String message) {

        String buffer;
        boolean done, value;

        value = false;
        done = false;

        while (! done) {
            buffer = console.readLine(message).toLowerCase();
            done = true; // assumes the answer is valid
            if (buffer.equals("y") || buffer.equals("yes")) {
                value = true;
            } else if (buffer.equals("n") || buffer.equals("no")) {
                value = false;
            } else {
                System.out.println("Enter [Y]es or [N]o");
                done = false;
            }
        }

        return value;

    }

    /**
    * Displays a message on the console and reads the input from the user.
    * The expected anser is a number in the range <code>low</code> to <code>hight</code>.
    * It will keep asking the user for an input as long as the not valid.
    *
    * @param message the message displayed on the Console
    * @param low is the lowest value of the intervalle
    * @param high is the highest value of the intervalle
    * @return the user input
    */

    public static int readNumber(String message, int low, int high) {

        String buffer;
        boolean done;
        int value;

        value = 0;
        done = false;

        while (! done) {
            buffer = console.readLine(message);
            try {
                value = Integer.parseInt(buffer);
                if (value < low || value > high) {
                    System.err.println("You must enter number in the range "+low+" to "+high);
                } else {
                    done = true;
                }
            } catch (NumberFormatException e) {
                System.err.println("You must enter a number!");
            }
        }

        return value;
    }

    /**
    * Reads the suit and rank. Returns the corresponding <code>Card</code> object.
    *
    * @return an object of the class <code>Card</code>
    */

    public static Card readCard() {

        int suit, rank;

        suit = readNumber("Enter suit: ", 0, 3);
        rank = readNumber("Enter rank: ", 0, 99);

        return new Card(suit, rank);
    }

    /**
    * Displays a message for the user, then reads cards until has no more
    * cards to enter. Returns a deck of cards.
    *
    * @param message a prompt for the user
    * @return a <code>Deck</code> of <code>Card</code>s
    */

    public static Deck readCards(String message) {

        Deck cards;
        boolean hasNext;

        cards = new Deck();
        hasNext = true;

        System.out.println(message);

        while (hasNext) {
            Card card;
            card = readCard();
            cards.add(card);
            hasNext = readYesOrNo("Do you have more cards? ");
        }

        return cards;
    }

}