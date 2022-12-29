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

    public Card(String suit, String rank){
        this.suit = Suit.valueOf(suit.toUpperCase());
        this.rank = Rank.valueOf(rank.toUpperCase());

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

    @Override
    public String toString() {
        return this.rank.toString() + " " + this.suit.toString();
    }

    public static void main(String[] args) {
//        TODO Needs method to draw random cards and loop for hit/stay

        Card card1 = new Card(Suit.SPADES, Rank.NINE);
        Card card2 = new Card(Suit.HEARTS, Rank.THREE);
        Card card3 = new Card("spades", "ace");


        handValue = card1.getValue() + card2.getValue();
        System.out.printf("Your current hand totals %d%n", handValue );
        System.out.println("You have now drawn card: " + card3);
        handValue = handValue + card3.getValue();
        System.out.printf("Your current hand totals %d%n", handValue);

        System.out.println("Your cards are: " + card1 + ", " + card2  + ", " + "and " + card3);
    }
}
