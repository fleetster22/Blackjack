package fleetster.blackjack;

public enum Suit {
    CLUBS('\u2667'),
    SPADES('\u2664'),
    DIAMONDS('\u2662'),
    HEARTS('\u2661');

    private char symbol;
    Suit(char symbol) {
        this.symbol = symbol;
    }


    @Override
    public String toString() {
        return Character.toString(this.symbol);
    }
}
