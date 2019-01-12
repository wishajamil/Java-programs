/**
 * Class Sqrt1
 * PROGRAMMING ASSIGNMENT #6
 * 
 *
 */
import java.util.*;


public class Sqrt1
{
    public static void main(String[] args)
    {
        double x;
        double low=0, high;  
        double mid=0;
        int guess=0;         
        
        Scanner console = new Scanner(System.in);
        
        System.out.print("x = ? ");
        x = console.nextDouble();
        
        high = x;
        while ((Math.abs(x-(mid*mid)) > 0.0001))
        {   
            mid = Math.abs(low+high)/2;
            if (mid*mid > x)
            high = mid;
            else 
            low = mid;
            guess++;
        }
    
        System.out.printf("The square root of %.5f is %.5f\n", x, mid);
        System.out.printf("The total number of guesses was %d.\n", guess);
    }
}

