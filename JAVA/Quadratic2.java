/**
 * Write a description of class Quadratic2 here.
 * PROGRAMMING ASSIGNMENT #7
 * 
 * Chris de Castro
 * 
 */
import java.util.*;


public class Quadratic2
{
    public static void main(String[] args)
    {
        double a, b, c;     // coefficients
        double discr;       // discriminant
        double x1, x2;      // solutions
        int    n;           // number of decimal places
        
        Scanner console = new Scanner(System.in);
        System.out.println("Quadratic equation solver:  a*x^2 + b*x + c = 0");
        System.out.print("a=? ");
        a = console.nextDouble();
        System.out.print("b=? ");
        b = console.nextDouble();
        System.out.print("c=? ");
        c = console.nextDouble();
        System.out.print("Round to how many decimal places? ");
        n = console.nextInt();
        
        // compute the discriminant
        discr = b*b - 4 * a * c;
   
        System.out.printf("The discriminant is %.2f\n", discr);
        
        if (discr < 0)
            {
                System.out.printf( "The equation has NO real solutions!\n");
            }
        else if (discr == 0)
            {
                x1 = Rounding.round((-b + Sqrt2.sqrt2(discr)) / (2 * a), n);
                System.out.println( "The equation has 1 real solution, x = " + x1 );
            }
        else 
            {          
                x1 = Rounding.round((-b + Sqrt2.sqrt2(discr)) / (2 * a), n);
                x2 = Rounding.round((-b - Sqrt2.sqrt2(discr)) / (2 * a), n);
                System.out.println( "The equation has 2 real solutions, x = " + x1 + " and x = " + x2 );
            }
    }
}













