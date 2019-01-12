/**
 * class GreatestDivisor
 *
 */

import java.util.*;

public class GreatestDivisor
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.printf("First number, a: ");
        int a = console.nextInt();
        System.out.printf("2nd number, b: ");
        int b = console.nextInt();
        
        int min;   // minimum of a and d.
        int gcd = 1;   // computed greatest common divisor of a and b
        int d;
        if (a > b)
            min = b; 
         else
            min = a; 
        
        for (d = min; d > 0; d--)
        {
            if ( a % d == d && d == 0)
            {
                gcd = d;
                break;
            }
        }
        
        d = min;    
        while (a % d != 0 || b % d != 0)
            d--;
        gcd = d;
   
        System.out.printf("The GCD(%d, %d) is %d\n", a, b, gcd);
       }

  }

