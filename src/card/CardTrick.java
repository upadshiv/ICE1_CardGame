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
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a card value (1-13): ");
        int userValue = input.nextInt();
        
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        int userSuitIndex = input.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuitIndex]);
        
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) 
        {
            if (magicHand[i].getValue() == userCard.getValue() && 
                magicHand[i].getSuit().equals(userCard.getSuit())) 
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