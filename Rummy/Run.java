/**
 * The class Run provides a main method for the application.
 *
 * @author Marcel Turcotte@uottawa.ca
 */


public class Run {

    public static void main(String[] args) {

        Game game;
        boolean play, changeSize;
        int ranks;

        StudentInfo.display();

        System.out.println("Welcome to Single Player Rummy with Dice and strange deck.");
        System.out.println();

        System.out.println("The standard deck  has 52 cards: 13 ranks times 4 suits");
        changeSize = Utils.readYesOrNo("Would you like to change the number of cards by changing the number of ranks? ");

        if (changeSize) {
            ranks = Utils.readNumber("Enter a value for the number of ranks: ", 3, 99);
        } else {
            ranks = 13;
        }

        play = true;

        while (play) {
            game = new Game(ranks);
            game.play();
            play = Utils.readYesOrNo("Do you want to again? ");
        }

    }

}