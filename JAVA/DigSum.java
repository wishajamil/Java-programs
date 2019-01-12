import java.util.*;

/**
 * Class DigSum 
 */

public class DigSum
{
   public static void main(String[] args)
   {	    
      Scanner console = new Scanner(System.in);
     
      int d;    //onedigits
      int sum = 0;
      int n;
      int originaln; 
      
      System.out.print("Please enter an integers: ");
      n = originaln = console.nextInt();
      while (n > 0) { 
         d = n % 10;
         sum = sum + d;
         n = n / 10;
      }
      System.out.printf("The sum of the digits in %d is %d.\n", originaln, sum ); 
   }
}


