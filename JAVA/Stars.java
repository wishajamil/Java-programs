/**
 * class Stars
 *
 */

import java.util.*;

public class Stars
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int pattern, rows;
        int x, y, I;
        int space;
        
        System.out.printf("How many rows? ");
        rows = console.nextInt();
        System.out.print("Which pattern number? ");
        pattern = console.nextInt();
        
        if (pattern == 1)
        {
         x = rows;
         while (x>0)
         {
            y = rows - (x-10);
            while (y>0);
            {
               System.out.print("*");
               y--;
            }
            System.out.println();
         }
        } 
        
        if (pattern == 2)
        {
         x = rows;
         y = rows;
         while (x>0)
         {
            y = x;
            while (y>0)
            {
               System.out.print("*");
               y--;
            }
            System.out.println();
            x--;
         }
        }
        
        if (pattern == 3)
        {
         rows = rows-1;
         I=1;
         while (rows >= 0) 
         {
            y=I;
            x=rows;
         while (x > 0) {
            System.out.print(" ");
            x--;
        } 
         while (y > 0) {
            System.out.print("*");
            y--;
        }
        rows--;
        System.out.println();
        I+=2;
        }
       
      }
        // ADD MISSING CODE HERE
    }
}