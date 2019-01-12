/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Homeowork 8                                                                  //
//Name: Wisha Jamil                                                                                    //
//Lab time: Friday 1:00PM to 2:40PM                                                                    //
//Project description: MUST use (ONLY) for loops to display the output below For example the 1st row   //
//prints 1 star 2nd row prints 2, the 3rd row print 3 stars and so forth... This program is controlled //
//by the user to input for the amount of row.                                                          //
/////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Full_XmasTree
{
   public static void main(String args[])
   {
      Scanner console = new Scanner(System.in);
      
      System.out.println("Pick size of the tree? (put how many rows)");
      int x = console.nextInt();
      
      for(int i = 1; i <= x; i++)
      {
         for(int j = x-1; j >= i; j--)
         {
            System.out.print(" ");
         }
         for(int k = 1; k <= i; k++)
         {
            System.out.print("* ");
         }
         System.out.print("\n");
      }
   }
}