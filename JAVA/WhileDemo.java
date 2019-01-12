/**
 * Class WhileDemo
 * 
 */
import java.util.*;

public class WhileDemo
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
        
      int n = 0;
      int originaln;
      int sum=0;
      System.out.print("Part 1: Multiples of 5 between 0 and 100\n");
      while (n <= 20 ) {
         System.out.printf("%d\t", sum);
         n = n + 1;
         sum = n * 5;
      }
        
      System.out.print("\nPart 2: Sum of first 100 integers\n");
      int x = 0;
      int sum2 = 0;
      while (x<100) { 
         x = x + 1; 
         sum2 = sum2 + x;
        }
      System.out.println("sum = " + sum2);
        
      System.out.print("Part 3: sequence 2, 5, 8, 11, .. 17\n");
      int i = 2;
      while (i <= 17) {
         System.out.printf("%d\t", i);
         i = i + 3;
      }           
   }
}

