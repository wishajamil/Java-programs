///////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Project 3 homework #7                                                      //
//Name: Wisha Jamil                                                                                  //
//Lab time: Friday 1:00PM to 2:40PM                                                                  //
//Project description: using switch statment prints "ONE", "TWO",... , "FIVE" UP to TEN if the int   //
//                     variable "number" is 1, 2,... , 5, 10. Also check to see if the user input is //
//                     divisible by 2.                                                               //
///////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


public class PrintNumberToWordie2 {

   public static void main(String[] args)
   {
      int number;
            
      Scanner input = new Scanner(System.in);     
   
      System.out.print("Type a number:");
      number = input.nextInt();
      
      switch (number){
      
         case 1:
            System.out.println("Number is: One");
            break; 
         case 2:
            System.out.println("Number is: Two");
            break;
         case 3:
            System.out.println("Number is: Three");
            break;
         case 4:
            System.out.println("Number is: Four");
            break;
         case 5:
            System.out.println("Number is: Five");
            break;
         case 6:
            System.out.println("Number is: Six");
            break;
         case 7:
            System.out.println("Number is: Seven");
            break;
         case 8:
            System.out.println("Number is: Eight");
            break;
         case 9:
            System.out.println("Number is: Nine");
            break;
         case 10:
            System.out.println("Number is: Ten");
            break;
         default:
            System.out.println("Number is: " + number);
      }
      
      if (number % 2 == 0) {
         System.out.println("The number is divisble by 2");
      } 
      else 
         System.out.println("The number is not divisble by 2");
   }
}