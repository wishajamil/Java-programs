/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Homeowork 8                                                                  //
//Name: Wisha Jamil                                                                                    //
//Lab time: Friday 1:00PM to 2:40PM                                                                    //
//Project description: MUST use (ONLY) for loops to display the output below from 1 to 10...1st row    //
//prints 10 star 2nd row prints 9… 3rd print 8 stars and so forth... This program is controlled by the //
//user to input the amount of row.                                                                     //
/////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Half_XmasTree
{
   public static void main(String args[])
   {
      Scanner console = new Scanner(System.in);
      
      System.out.println("Pick size of the tree? (put how many rows)");
      int x = console.nextInt();
      for(int i = 1; i <= x; i++)
      {
         for(int j = i; j <= x; j++)
         {
            System.out.print("*");
         }
         System.out.print("\n");
      }
   }
}
      