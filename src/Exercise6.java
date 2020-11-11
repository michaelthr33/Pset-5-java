import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a playing card: ");
        String PlayingCard = in.next();
        String Rank ="_";
        String Suit="_";
        System.out.println();
        if(PlayingCard.length()==2) {
            Rank = PlayingCard.substring(0, 1);
            Suit = PlayingCard.substring(1,2);
        }

        if (Rank.equals("A") || Rank.equals("a")) {
            Rank = "Ace";
        } else if (Rank.equals("K") || Rank.equals("k")) {
            Rank = "King";
        } else if (Rank.equals("Q") || Rank.equals("q")) {
            Rank = "Queen";
        } else if (Rank.equals("J") || Rank.equals("j")) {
            Rank = "Jack";
        } else if (Rank.equals("1")) {
            Rank = "One";
        } else if (Rank.equals("2")) {
            Rank = "Two";
        } else if (Rank.equals("3")) {
            Rank = "Three";
        } else if (Rank.equals("4")) {
            Rank = "Four";
        } else if (Rank.equals("5")) {
            Rank = "Five";
        } else if (Rank.equals("6")){
            Rank = "Six";
        } else if (Rank.equals("7")){
            Rank = "Seven";
        } else if (Rank.equals("8")){
            Rank = "Eight";
        } else if (Rank.equals("9")){
            Rank = "Nine";
        } else if (Rank.equals("_")){
            Rank = "_";
        } else {
            Rank = "Invalid";
        }

        if (Suit.equals("C") || Suit.equals("c")){
            Suit = "Clubs";
        } else if(Suit.equals("D") || Suit.equals("d")){
            Suit = "Diamonds";
        } else if (Suit.equals("H") || Suit.equals("h")){
            Suit = "Hearts";
        } else if (Suit.equals("S") || Suit.equals("s")){
            Suit = "Spades";
        } else if (Suit.equals("_")) {
            Suit = "_";
        } else {
            Suit = "Invalid";
        }

        if (Suit.equals("_") || Rank.equals("_")){
            System.out.println("That's not a valid card.");
        } else if (Suit.equals("Invalid")){
            System.out.println("That's not a valid suit.");
        } else if (Rank.equals("Invalid")){
            System.out.println("That's not a valid rank.");
        } else {
            System.out.println(Rank + " of " + Suit +".");
        }
        
    }
}