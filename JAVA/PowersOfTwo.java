/**
 * EXAMPLE 2 - PowersOf2
 * 
 */
import java.util.*;

public class PowersOfTwo
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      // Print the first N powers of 2.
      System.out.print("Enter N: ");
      int N = console.nextInt();
      int v = 1;
      int i = 0;
      while (i <= N)
      { // Print ith power of 2.
         System.out.printf("%2d\t%d\n", i, v);
         v = 2 * v;
         i = i + 1;
      }
   }
}


