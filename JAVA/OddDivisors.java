/**
 * class Odd Divisors
 *
 */

import java.util.*;

public class OddDivisors
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.printf("Find all numbers having an odd number of divisors less than what number? ");
        int n = console.nextInt();
        int divisors;
        int trial; 
        int i;
        
        System.out.printf("Numbers less than %d having an odd number of divisors.\n", n);
        for (i = 1; i < n; i++)
        {
            divisors = 0;
            trial = 1;
        while (trial <= i)
        {
            if (i % trial == 0)
            divisors++;
            
            trial++;
        }
        if  (divisors % 2 == i)
            System.out.printf( "%d", i);
        }
        System.out.println();
   }
}

