package playingcard;

import java.util.Random;

/**
 *
 * @author Marios Christodoulou
 */
public class Pack {

    PlayingCard[] cards = new PlayingCard[52];
    public int counter = 0;

    /**
     * Constructs a pack of 52 cards. Sorted by suit Clubs, Diamonds, Hearts,
     * Spades. Sorted ascending.
     */
    public Pack() {
        for (PlayingCard.Suit st : PlayingCard.Suit.values()) {
            for (PlayingCard.Rank rk : PlayingCard.Rank.values()) {
                cards[counter++] = new PlayingCard(st, rk);
            }
        }
    }

    /**
     * Shuffles cards in pack.
     */
    public void shuffle() {
        Random random = new Random();
        int n = cards.length;
        for (int i = 0; i < cards.length; i++) {
            int randomValue = i + random.nextInt(n - i);
            PlayingCard randomElement = cards[randomValue];
            cards[randomValue] = cards[i];
            cards[i] = randomElement;

        }
    }

    /**
     * @return string representation of 52 card pack.
     */
    @Override
    public String toString() {
        String toReturn = "Deck of Cards[";
        for (PlayingCard c : cards) {
            toReturn = toReturn + " (" + c.getRank() + " of " + c.getSuit() + ")";
        }

        return toReturn + "cards = " + cards.length + "]";

    }

}
