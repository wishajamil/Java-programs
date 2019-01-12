/**
 * Class Redfrac
 * PROGRAMMING ASSIGNMENT #6
 *  
 */
import java.util.*;

public class Redfrac
{
    public static void main(String[] args)
    {
    
        Scanner console = new Scanner(System.in);
        int n, n1;      // the numerator and simplified numerator
        int d, d1;      // the denominator and simplified numerator
        
        System.out.print("Enter a fraction (e.g. 10/15 as 10 15): ");
        n = console.nextInt();
        d = console.nextInt();
        
                                              
        // reduce fraction
        n1 = n / gcd(n, d);                 
        d1 = d / gcd(n, d);                   //d1 = d/a
        System.out.printf("%d/%d reduced is %d/%d\n", n, d, n1, d1);
    }
    
    public static int gcd( int a, int b)       //method "header"
    {
        while (b > 0)
        {
            int pervA = a;
            a = b;
            b = pervA % b;      
        } 
        
        return a;
    }
}
    
    


