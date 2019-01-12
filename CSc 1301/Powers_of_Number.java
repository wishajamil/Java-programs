/////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Lab 12                                                       //
//Name: Wisha Jamil                                                                    //
//Lab time: Friday 1:00PM to 2:40PM                                                    //
//Project description: that generates the second, third, and fourth powers of a list of//
//                     whole numbers from 1 to n where n is input by the user.         //
/////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Powers_of_Number
{
   public static void main(String[] args)
   {  
      Scanner console = new Scanner(System.in);
      
      System.out.print("Enter the largest of the whole numbers to use: ");
      int n = console.nextInt();
      
      for (int k = 1; k < n; k++)
      {
         System.out.print("n^" + k + "\t");
      }
      
      for (int i = 1; i <= n; i++) 
      {
         System.out.println();    
            
         for (int j = 1; j <= 4; j++)
            System.out.print((int)Math.pow(i,j)+"\t\t"); 
      }
   }
}
            
