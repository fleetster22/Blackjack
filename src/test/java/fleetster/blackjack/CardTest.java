package fleetster.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void canGetValueOfTwo() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card1.getValue());
    }
    @Test
    void canGetValueOfTen() {
        Card card2 = new Card(Suit.DIAMONDS, Rank.TEN);
        assertEquals(10, card2.getValue());
    }
    @Test
    void canGetValueOfJack() {
        Card card3 = new Card(Suit.DIAMONDS, Rank.JACK);
        assertEquals(10, card3.getValue());
    }
    @Test
    void canGetValueOfQueen() {
        Card card4 = new Card(Suit.DIAMONDS, Rank.QUEEN);
        assertEquals(10, card4.getValue());
    }

}