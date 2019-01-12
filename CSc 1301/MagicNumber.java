///////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Project 3 homework #7                                                      //
//Name: Wisha Jamil                                                                                  //
//Lab time: Friday 1:00PM to 2:40PM                                                                  //
//Project description: user will enters the number to guess and computer will tell the user if the   //
//                     number matches the Magic number and then determine if the number is smaller or//
//                     greater than the initial number.                                              //
///////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


public class MagicNumber {

   public static void main(String[] args)
   {
      int guess;
      
      Scanner console = new Scanner(System.in); 
      
      System.out.print("Enter a guess:");
      guess = console.nextInt();
      
      int secret = (int)(100 * Math.random()) + 1;
      System.out.println("Secret number is " + secret );
      
      System.out.println("Your guess is " + guess);
      
      if (secret == guess) {
         System.out.println("Your guess is correct. Congratulations!");
      } 
      else if (secret > guess) {
         System.out.println("Your guess is smaller than the secret number.");
      }
      else { 
         System.out.println("Your guess is greater than the secret number.");
      } 
      
   }
}