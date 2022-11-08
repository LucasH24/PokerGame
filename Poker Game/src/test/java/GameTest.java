import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Card card1 = new Card();
    Card card2 = new Card();
    Card card3 = new Card();
    Card card4 = new Card();
    Card card5 = new Card();

    @Test
    void isFull() {
        card1.setFace("7"); card1.setSuit("hearts");
        card2.setFace("7"); card2.setSuit("clubs");
        card3.setFace("7"); card3.setSuit("diamonds");
        card4.setFace("jack"); card4.setSuit("hearts");
        card5.setFace("jack"); card5.setSuit("clubs");
        assertEquals(true, Game.isFull(card1, card2, card3, card4, card5));
    }

    @Test
    void isFlush() {
        card1.setFace("4"); card1.setSuit("clubs");
        card2.setFace("6"); card2.setSuit("clubs");
        card3.setFace("8"); card3.setSuit("clubs");
        card4.setFace("jack"); card4.setSuit("clubs");
        card5.setFace("king"); card5.setSuit("clubs");
        assertEquals(true, Game.isFlush(card1, card2, card3, card4, card5));
    }

    @Test
    void isFour() {
        card1.setFace("7"); card1.setSuit("hearts");
        card2.setFace("7"); card2.setSuit("clubs");
        card3.setFace("7"); card3.setSuit("diamonds");
        card4.setFace("7"); card4.setSuit("spades");
        card5.setFace("jack"); card5.setSuit("clubs");
        assertEquals(true, Game.isFour(card1, card2, card3, card4, card5));
    }

    @Test
    void isThree() {
        card1.setFace("4"); card1.setSuit("hearts");
        card2.setFace("7"); card2.setSuit("clubs");
        card3.setFace("7"); card3.setSuit("diamonds");
        card4.setFace("7"); card4.setSuit("hearts");
        card5.setFace("jack"); card5.setSuit("clubs");
        assertEquals(true, Game.isThree(card1, card2, card3, card4, card5));
    }
}