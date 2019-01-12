////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Lab 12                                                                  //
//Name: Wisha Jamil                                                                               //
//Lab time: Friday 1:00PM to 2:40PM                                                               //
//Project description: loop 1- sum up all of the values from 1 to 10, outputting the sum as you go//
//                     loop 2- sum up all of the values starting at 1 and going until the sum is  //
//                     greater than 100, again outputting results as you go.                      //
////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Adding_Number
{
   public static void main(String[] args)
   {  
      Scanner console = new Scanner(System.in);
      
      int sum = 0;
      int total = 0; 
            
      for (int i = 1; i <= 10; i++)
      {
         sum = sum + i;
         System.out.print(sum);
         for (int j = 1; j<=i; j++)
         {
            System.out.print("(" +j+ "+" +i+ ")");
         }
         System.out.print(",");
      }
      
      System.out.println();
      int k = 1;
      total = 0;
      while (total < 100)
      {
         total = total + k;
         System.out.print(total + "\t");
         k++;
      }
   }
}