package playingcard;

/**
 *
 * @author Marios Christodoulou
 */
public class PlayingCardTester {

    public static void main(String[] args) {
        /**
         * Create a few test cards and output cards
         */

        /**
         * create a few cards
         */
        PlayingCard card1 = new PlayingCard(PlayingCard.Suit.Clubs, PlayingCard.Rank.Ace);
        PlayingCard card2 = new PlayingCard(PlayingCard.Suit.Hearts, PlayingCard.Rank.Seven);
        PlayingCard card3 = new PlayingCard(PlayingCard.Suit.Diamonds, PlayingCard.Rank.Nine);
        PlayingCard card4 = new PlayingCard(PlayingCard.Suit.Spades, PlayingCard.Rank.Five);
        /**
         * Prints out each card
         */
        System.out.println(card1.format());
        System.out.println(card2.format());
        System.out.println(card3.format());
        System.out.println(card4.format());

    }

}
