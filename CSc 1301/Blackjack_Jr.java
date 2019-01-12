import java.util.*;

public class Blackjack_Jr 
{
   public static void main(String[] args)
   {
         
      Scanner console = new Scanner(System.in);
      
      System.out.println("Blackjack Jr!\n"); 
      
      System.out.println("Enter your Card number between 1-10:");
      int playerCard1 = console.nextInt();
      int playerCard2 = console.nextInt();
      
      while (playerCard1 <= 1 || playerCard2 <= 1){
         System.out.println("Please enter an integer greater or equal to 1");
         playerCard1 = console.nextInt();
         playerCard2 = console.nextInt();
      }
            
      int dealerCard1 = (int)(10 * Math.random()) + 1;
      int dealerCard2 = (int)(10 * Math.random()) + 1;
      
      int PlayerTotal = playerCard1 + playerCard2;
      int DealerTotal = dealerCard1 + dealerCard2;
      
      System.out.println("You drew " + playerCard1 + " and " + playerCard2 + ".");
      System.out.println("Your total is " + PlayerTotal + ".\n");
      System.out.println("The dealer has " + dealerCard1 + " and " + dealerCard2);
      System.out.println("Dealer's total is " + DealerTotal + ".\n");
   
      if (PlayerTotal > DealerTotal) {
         System.out.println("You Win!");
      }
      else if (DealerTotal > PlayerTotal) {
         System.out.println("Dealer Wins!");
      }
      else {
         System.out.println("NO ONE WINS. It's a draw"); 
      }  
   }  
}