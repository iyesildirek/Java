/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismail Yesildirek
 */

/*
(Game: pick four cards) Write a program that picks four cards from a deck of 52
cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
12, and 11, respectively. Your program should display the number of picks that
yields the sum of 24.
 */
import java.util.Arrays;
import java.util.Scanner;

public class PickFour   //Same as chapter 5 loops pdf pg 41 & pg44 has similar code available.
{

    public static void main(String[] args)
    {
        final int ace = 1;
        final int king = 13;
        final int queen = 12;
        final int jack = 11;
        final int cardDeck = 52;
        int sum = 0;
        int fourCards = 4;
        int[] myDeck = new int[cardDeck];
        int[] myArray = new int[fourCards];
        int[] myValue = new int[fourCards];
        int[] myClass = new int[fourCards];
        String[] newClass =                     //From example pg41 of Chp5 Arrays pdf lecture link.
        {
            "Spades", "Hearts", "Diamonds", "Clubs"
        };
        String[] values =
        {
            "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
        };
        for (int i = 0; i < myDeck.length; i++) // array has cards 1 thru 52 = create deck of cards.
        {
            myDeck[i] = i + 1;
        }
        myArray = cardGenerator(myDeck, fourCards);

        for (int i = 0; i < fourCards; i++)
        {
            myValue[i] = myArray[i] % 13;       //myValue 0-12, where 0 = Ace and 12 = King.
            sum += myValue[i];
        }
        for (int i = 0; i < fourCards; i++)
        {
            myClass[i] = myArray[i] % 4;
        }
        System.out.println("Your Four Cards are: ");
        for (int i = 0; i < fourCards; i++)
        {
            System.out.println("Card number " + myArray[i] + ": " + newClass[myClass[i]] + " of " + values[myValue[i]]);
        }
        // System.out.println("First Card Type: " + myClass[0] +" of "+ myValue[0]);
        // System.out.println("Second Card Type: " + myClass[1] +" of "+ myValue[1]);
        // System.out.println("Third Card Type: " + myClass[2] +" of "+ myValue[2]);
        // System.out.println("Fourth Card Type: " + myClass[3] +" of "+ myValue[3]);
        // System.out.println("Card Sum: " + sum);
        findAnswer(myValue);
    }

    public static int[] cardGenerator(int[] deck, int size)
    {
        for (int i = 0; i < size; i++)
        {
            deck[i] = (int) (Math.round((Math.random() * 51 + 1)));
        }
        return deck;
    }

    public static void findAnswer(int[] selectedCards)
    {
        for (int i = 0; i < selectedCards.length; i++)
        {
            selectedCards[i]++;
            System.out.println("Card numbers are: " + (selectedCards[i]));
        }
        
    } 

}
