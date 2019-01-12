/**
 * Class Rounding
 * PROGRAMMING ASSIGNMENT #7
 * 
 */
import java.util.*;


public class Rounding
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      double  x, r;
      int     places;
      
      System.out.printf("Enter a decimal number: ");
      x = console.nextDouble();
      System.out.printf("Round to how many decimal places: ");
      places = console.nextInt();
      
      // Call the rounding method and place result in variable r.
      r = round( x, places );
   
   
      System.out.printf("The number %f rounded to %d places is %f\n", x, places,r);
   }
   
   public static double round (double x, int n)
   {
      double num;
      double a;
      
      a = Math.pow(10,n);
      num = Math.floor(x * a + 0.5) / a;
      
      return num; 
   }      
}