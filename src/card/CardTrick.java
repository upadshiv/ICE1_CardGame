/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**new code
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Shiv Upadhyay - 991704676 - 19/09/2025
 */
public class CardTrick 
{
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        System.out.println("Magic Hand:");
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            
            magicHand[i] = c;
            
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        
        System.out.println();
        
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        System.out.println("Lucky card is: " + luckyCard.getSuit() + " " + luckyCard.getValue());
        
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) 
        {
            if (magicHand[i].getValue() == luckyCard.getValue() && 
                magicHand[i].getSuit().equals(luckyCard.getSuit())) 
            {
                found = true;
                break;
            }
        }
        
        if (found) 
        {
            System.out.println("Your card is in the magic hand");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }    
        input.close();
    }
}
