/**
 * Class Euclid
 * PROGRAMMING ASSIGNMENT #6
 * 
 */
import java.util.*;

public class Euclid
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int a;
        int b;
        int GCD1 = 0;
        System.out.print("Enter two integers separated by spaces (ex. 10 20): ");
        a = console.nextInt();
        b = console.nextInt();
        
        System.out.printf("GCD (%d , %d) = ", a, b);
        while (b > 0)
        {
            int pervA = a;
            a = b;
            b = pervA % b;      
        }
        
        System.out.printf("%d\n",a);
    }
}

