package fleetster.blackjack;

public class Card {
//    variables
    private Suit suit;
    private Rank rank;

    private int handValue;


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
        if (this.rank == Rank.ACE && handValue <= 10) {
            return 11;
        }
        return this.rank.getValue();
    }

    @Override
    public String toString() {
        return this.rank.toString() + " " + this.suit.toString();
    }


}
