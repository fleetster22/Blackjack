package fleetster.blackjack;

public class Card {
//    variables
    private Suit suit;
    private Rank rank;
    private static int handValue;

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public int getValue() {
        if (this.rank == Rank.ACE) {
            if (handValue <= 10) {
                return 11;
            };
        }
        return this.rank.getValue();
    }


    public static void main(String[] args) {
//        TODO Needs method to draw random cards and loop for hit/stay

        Card card1 = new Card(Suit.SPADES, Rank.NINE);
        Card card2 = new Card(Suit.HEARTS, Rank.THREE);
        Card card3 = new Card(Suit.SPADES, Rank.ACE);
        handValue = card1.getValue() + card2.getValue();
        System.out.printf("Your current hand totals %d", handValue);
        handValue = handValue + card3.getValue();
        System.out.printf("Your current hand totals %d", handValue);

        System.out.println("Your hand is: " + card1.getRank() + " of " + card1.getSuit() + " , " + card2.getRank() +
                " of " + card2.getSuit()  + " and " + card3.getRank() + " of " + card3.getSuit());
        System.out.printf("Your current hand totals %d", handValue);
    }
}
