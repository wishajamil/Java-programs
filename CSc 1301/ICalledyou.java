//////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Project 5                                                             //
//Name: Wisha Jamil                                                                             //
//Lab time: Friday 1:00PM to 2:40PM                                                             //
//Project description: calculate the product of this two number and print out the greater number//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


public class ICalledyou {

   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);     

      System.out.println("what is first number?");
      double first = input.nextDouble();
      
      System.out.println("What is second number?");
      double second = input.nextDouble();
      
      System.out.println();      
      System.out.println("Product of two numbers: " + (first * second));
      System.out.println("Greatest number: " + Math.max(first, second));
}
}     
      