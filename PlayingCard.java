package playingcard;

/**
 *
 * @author Marios Cristodoulou
 */
public class PlayingCard {
    
    
    private final Suit suit;
    private final Rank rank;
     /**
     * suits of the playing cards. Hearts, Spades, Diamonds and Clubs
     */
    public enum Suit {
        Spades, Hearts, Diamonds, Clubs;

        /**
         * check each switch return as symbols.
         *
         * @return
         */
        @Override
        public String toString() {
            switch (this) {
                case Spades:
                    return "\u2660";
                case Hearts:
                    return "\u2665";
                case Diamonds:
                    return "\u25C6";
                case Clubs:
                    return "\u2663";
                default:
                    return null;
            }
        }
    }

    /**
     * Rank 2,3,4,5,6,7,8,9,10 Jack , Queen, King, Ace
     */
    public enum Rank {
        Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8),
        Nine(9), Ten(10), Jack(11), Queen(12), King(13), Ace(14);

        private final int value;
        
          /**
         * return rank value
         *
         * @param value
         */
        Rank(int value) {
            this.value = value;
        }

        /**
         * return value
         *
         * @return
         */
        public int getValue() {
            return value;
        }

        /**
         * check each card and return the rank value as int
         *
         * @return
         */
        
       
        
        
        @Override
        public String toString() {
            
            
            
            switch (this) {
                case Two:
                    return "2";
                case Three:
                    return "3";
                case Four:
                    return "4";
                case Five:
                    return "5";
                case Six:
                    return "6";
                case Seven:
                    return "7";
                case Eight:
                    return "8";
                case Nine:
                    return "9";
                case Ten:
                    return "10";
                case Jack:
                    return "Jack";
                case Queen:
                    return "Queen";
                case King:
                    return "King";
                case Ace:
                    return "Ace";
            }
            return null;
        }
    }

    /**
     *
     * @param suit
     * @param rank
     */
    public PlayingCard(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Generates string representation of an object. return the value as a
     * string
     *
     * @return
     */
    @Override
    public String toString() {
        return "PlayingCard{" + "suit=" + suit + ", rank=" + rank.getValue() + '}';
    }

    /**
     * Formats the string rank,suit
     *
     * @return
     */
    public String format() {
        return String.format("%s of %s", rank, suit);
    }

    /**
     * Tests whether a card is equal to some other card that has been chosen.
     *
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlayingCard other = (PlayingCard) obj;
        return (this.suit == other.getSuit() && this.rank == other.getRank());
    }
    
    
    
   
        
    public Rank getRank() {
        return rank;
    }
    
    public Suit getSuit() {
        return suit;
    }
    
  
    
    
}
