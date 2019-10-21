package playingcard;

/**
 *
 * @author Marios Christodoulou
 */
import java.util.Scanner;

public class PackTester {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Pack newpack = new Pack();
        /**
         * Prints of the shuffled card the first time.
         */
//
        String option;
        Scanner in = new Scanner(System.in);
        do {
            String menu = "\n Please select an option to perform"
                    + "\n (1) Show Deck."
                    + "\n (2) Shuffle Deck & show."
                    + "\n (q) Exit Program";
            System.out.println(menu);
            option = in.next();
            switch (option) {
                case "q":
                    System.out.println("Exitting the program!");

                    break;
                case "1":
                    System.out.println(newpack);
                    break;
                case "2":
                    System.out.println("Shuffling Deck.....");
                    newpack.shuffle();
                    System.out.println(newpack);
                    break;

                default:
                    System.out.println("Wrong option try again my card ");
                    PlayingCard p1 = new PlayingCard(PlayingCard.Suit.Hearts, PlayingCard.Rank.Ace);

                    System.out.println(p1.format());

                    break; //I always use this break, even when not needed.
            }
        } while (!option.equals("q"));
    }

}
