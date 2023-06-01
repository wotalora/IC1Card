/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        public void luckyCard(){
        
        // ** Creates an aleatory luckyCard     
            Card c1 = new Card();
            c1.setValue((1));   // @author William Otalora SN 991691907
            c1.setSuit(Card.SUITS[(3)];  // @author William Otalora SN 991691907
         
        }
            
     
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        // @author ** William Otalora SN 991691907
        
            public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int) (Math.random()*13 + 1));   // @author William Otalora SN 991691907
            //c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[(int) (Math.random()*3)]);  // @author William Otalora SN 991691907
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //Scanner input= new Scanner(System.in);
        System.out.print("Magic Hand"+ Arrays.toString(magicHand));
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
