///////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Project 3 homework #7                                                      //
//Name: Wisha Jamil                                                                                  //
//Lab time: Friday 1:00PM to 2:40PM                                                                  //
//Project description: prints "ONE", "TWO",... , "FIVE" UP to TEN if the int variable "number" is 1, //
//                     2,... , 5, 10. Also check to see if the user input is divisible by 2.         //
///////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


public class PrintNumberToWordie {

   public static void main(String[] args)
   {
      int number;
      
      Scanner input = new Scanner(System.in);     
   
      System.out.print("Type a number:");
      number = input.nextInt();
      
      if (number == 1) {
         System.out.println("Number is: One");
      } 
      else if (number == 2) {
         System.out.println("Number is: Two");
      } 
      else if (number == 3) {
         System.out.println("Number is: Three");
      } 
      else if (number == 4) {
         System.out.println("Number is: Four");
      } 
      else if (number == 5) {
         System.out.println("Number is: Five");
      } 
      else if (number == 6) {
         System.out.println("Number is: Six");
      } 
      else if (number == 7) {
         System.out.println("Number is: Seven");
      } 
      else if (number == 8) {
         System.out.println("Number is: Eight");
      } 
      else if (number == 9) {
         System.out.println("Number is: Nine");
      } 
      else if (number == 10) {
         System.out.println("Number is: Ten");
      } 
      else {
         System.out.println("Number is: " + number);
      }
   
      if (number % 2 == 0) {
         System.out.println("The number is divisble by 2");
      } 
      else 
         System.out.println("The number is not divisble by 2");  
   }
}