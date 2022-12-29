package fleetster.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    void canGetHeart(){
        assertEquals("\u2661", Suit.HEARTS.toString());
    }

    @Test
    void canGetSpade() {
        assertEquals("\u2664", Suit.SPADES.toString());
    }
}