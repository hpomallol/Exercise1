package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * 
 * @author Harold Ortiz May 30, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random =  new Random();
            card.setValue(random.nextInt(14) + 1 );
            // 
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i] = card;
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < hand.length; i++){
            System.out.println(hand[i].getValue() + " of " + hand[i].getSuit());
        }
                    
        System.out.print("Please pick a card value (1-13): ");
        int num = input.nextInt();
        System.out.print("\n Please enter the card's suit (Hearts, Diamonds, Spades, Clubs): ");  
        String suit = input.nextLine();
        Card card1 = new Card();
        card1.setValue(num);
        card1.setSuit(suit);
        
        for(int i = 0; i < hand.length; i++){
            if((card1.getValue() == hand[i].getValue()) && (card1.getSuit().equals(hand[i].getSuit())))
                printInfo();
        }
        
        
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Harold May 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Harold, but you can call me Paul, or Howard");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Keep all grades above a B");
        System.out.println("-- Get a good job");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching Manga & Anime");
        System.out.println("-- Gym");

        System.out.println();
        
    
    }

}
