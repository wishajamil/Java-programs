////////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Homeowork 8                                                                 //
//Name: Wisha Jamil                                                                                   //
//Lab time: Friday 1:00PM to 2:40PM                                                                   //
//Project description: plays a game in which the program picks a secret number and the user tries to  //
//guess it.                                                                                           //
//1) The program first asks the user to enter the maximum value for the secret number.                //
//2)	Next, it chooses a random number that is >= 1 and<= the maximum number.                         //
//3)	Then the user must try to guess the number.                                                     //
//4)	When the user succeeds, the program asks the user whether or not to play another game.          //
////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Guess_A_Number 
{
   public static void main(String[] args) 
   {
      int secretNumber;
      String guess,maxNumber;
      int guessNumber;
      int maxSecretNumber;
       
      Scanner console = new Scanner(System.in);
      while(true)
      {
         int count = 0;
         System.out.print("Enter maximum value for secret number: ");
         maxNumber = console.next(); 
           
         maxSecretNumber = Integer.parseInt(maxNumber.trim());
         secretNumber = (int) (Math.random() * maxSecretNumber + 1);
         System.out.println("A new secret number has been chosen");
          
         while(true){
            count++;
            System.out.print("Enter Guess: ");
            guess = console.next();
            guessNumber = Integer.parseInt(guess.trim());
              
            if (guessNumber == secretNumber)
            {
               System.out.println("You won in "+count+" guesses");
               System.out.print("Play Again ?(Y/N):");
               String a = console.next();
               if(a.equalsIgnoreCase("y"))
               {
                  break;
               }
               else
               {
                  System.exit(0);
               }
            }
               
            else if (guessNumber < secretNumber)
               System.out.println("Too low; try again");
            else if (guessNumber > secretNumber)
               System.out.println("Too high; try again");
         }
      }      
   }
}