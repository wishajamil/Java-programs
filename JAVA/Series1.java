/**
 * Class Series1 
 * 
 */
import java.util.*;

public class Series1
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      
      int n = 0;
      double term = 1;
      double sum = 0;
      //series s1:  1+(1/2)+(1/4)+...
      System.out.print("Series S1: ");
      while (n < 10){ 
         term = term * 1.0/2;
         n = n + 1;
         sum = sum + term;
      }
      System.out.printf("The sum s1 = %.6f\n", sum);
   
      int k;
      double sum2 = 0;
      int N;
      //series s2:  1+(3+(2*1))+(3+(2*2))+...
      System.out.print("Series S2: ");
      for ( k=1 ; k <= 20; k++) {
         N = 3 + 2 * k;
         sum2 = sum2 + N;
      }   
      System.out.printf("The sum s2 = %.6f\n", sum2);
   
   }
}







