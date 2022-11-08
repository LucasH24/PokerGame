import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        Card card4 = new Card();
        Card card5 = new Card();
        card1.setFace("4"); card1.setSuit("hearts");
        card2.setFace("7"); card2.setSuit("clubs");
        card3.setFace("7"); card3.setSuit("diamonds");
        card4.setFace("7"); card4.setSuit("hearts");
        card5.setFace("jack"); card5.setSuit("clubs");

        boolean full = Game.isFull(card1, card2, card3, card4, card5);
        boolean flush = Game.isFlush(card1, card2, card3, card4, card5);
        boolean four = Game.isFour(card1, card2, card3, card4, card5);
        boolean three = Game.isThree(card1, card2, card3, card4, card5);

        if (full) {
            System.out.println("Full House");
        }

        else if (flush) {
            System.out.println("Flush");
        }

        else if (four) {
            System.out.println("Four of a kind");
        }

        else if (three) {
            System.out.println("Three of a kind");
        }

        else {
            System.out.println("The hand is none of the types");
        }







    }
}
