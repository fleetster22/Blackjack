package fleetster.blackjack;

public class Deck {
    public Card [] [] deck;
public static final int NUM_SUITS = Suit.values().length;
public static final int NUM_RANKS = Rank.values().length;
    public Deck() {
        deck = new Card[NUM_SUITS][NUM_RANKS];
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();

//        TODO fix instantiation
        for (int suitIndex = 0; suitIndex < NUM_RANKS; suitIndex++){
            for (int rankIndex = 0; rankIndex < NUM_RANKS; rankIndex++){
                deck[suitIndex][rankIndex] = new Card(suit, rank);
            }

        }
    }

}
