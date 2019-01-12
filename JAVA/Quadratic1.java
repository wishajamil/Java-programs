/**
 * Class Quadratic1
 * 
 * @author (your name) 
 */

import java.util.*;

public class Quadratic1
{
   public static void main(String[] args)
   {
      double a, b, c;     // coefficients
      double discr;       // discriminant
      double x1, x2;      // solutions
      
      Scanner console = new Scanner(System.in);
      System.out.printf("Quardratic equation solver: a*x^2 + b*x + c = 0\n");
      System.out.printf("a=? ");
      a = console.nextInt();
      System.out.printf("b=? ");
      b = console.nextInt();
      System.out.printf("c=? ");
      c = console.nextInt();
      
      discr = Math.pow(b,2)-4*a*c;
      x1 = (-b + Math.sqrt(discr)) / (2*a);
      x2 = (-b - Math.sqrt(discr)) / (2*a);
              
      System.out.printf("The discriminant is %.2f\n",discr);
      if (x1 == x2){
         System.out.printf("The equation has 1 real solution, x = %.2f\n",x1);
      }
      else if (discr<0 || a == 0) {
         System.out.printf("The equation has NO real solution!\n");
      }
      else {
         System.out.printf("The equation has 2 real solutions, x = %.2f and  x = %.2f\n", x1, x2);
      }
   }  
}
