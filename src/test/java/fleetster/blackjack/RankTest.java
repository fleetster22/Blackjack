package fleetster.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    @Test
    void canGetValue2() {
        assertEquals(2, Rank.TWO.getValue());
    }

    @Test
    void canGetValue10() {
        assertEquals(10, Rank.TEN.getValue());
    }

    @Test
    void canGetValueAce() {
        assertEquals(1, Rank.ACE.getValue());
    }

    @Test
    void canGetValueJack() {
        assertEquals(10, Rank.JACK.getValue());
    }

}