import java.util.ArrayList;

public class Game {

    // ASSUMING CARDS IN HAND ARE IN ORDER BY FACE FOR TEST (not sure how to test for each hand otherwise)

    static boolean isFull(Card card1, Card card2, Card card3, Card card4, Card card5) {
        if (card1.getFace().equals(card2.getFace()) && card2.getFace().equals(card3.getFace())) {
            if (card4.getFace().equals(card5.getFace())) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (card1.getFace().equals(card2.getFace())) {
            if (card3.getFace().equals(card4.getFace()) && card4.getFace().equals(card5.getFace())) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }



    static boolean isFlush(Card card1, Card card2, Card card3, Card card4, Card card5) {
        if (card1.getSuit().equals(card2.getSuit()) && card2.getSuit().equals(card3.getSuit()) && card3.getSuit().equals(card4.getSuit()) && card4.getSuit().equals(card5.getSuit())) {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean isFour(Card card1, Card card2, Card card3, Card card4, Card card5) {
        if (card1.getFace().equals(card2.getFace()) && card2.getFace().equals(card3.getFace()) && card3.getFace().equals(card4.getFace())) {
            return true;
        }
        else if (card2.getFace().equals(card3.getFace()) && card3.getFace().equals(card4.getFace()) && card4.getFace().equals(card5.getFace())) {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean isThree(Card card1, Card card2, Card card3, Card card4, Card card5) {
        if (card1.getFace().equals(card2.getFace()) && card2.getFace().equals(card3.getFace())) {
            return true;
        }
        else if (card2.getFace().equals(card3.getFace()) && card3.getFace().equals(card4.getFace())) {
            return true;
        }
        else if (card3.getFace().equals(card4.getFace()) && card4.getFace().equals(card5.getFace())) {
            return true;
        }
        else {
            return false;
        }
    }


}
