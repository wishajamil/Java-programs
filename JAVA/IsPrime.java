/**
 * class IsPrime
 *
 */

import java.util.*;

public class IsPrime
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter an integer to test for primality: ");
        int n = console.nextInt();
        int trial;
        int divisors = 0;  // number or divisors of number
        
        trial = 1;
        while (trial <= n)
        {
            if (n % trial == 0)
              divisors++;
            
            trial++;
        }
        if (divisors == 2)
            System.out.printf("the number %d is prime!\n" , n );
        else
           System.out.printf("the number %d is composite!\n" , n);
    } 
  }

