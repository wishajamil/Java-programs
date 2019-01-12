/** 
 * DivisorPattern 
 *   takes an integer N and uses nested for loops to print
 *   an N-by-N table with an asterisk in row i and column j
 *   if either i divides j or j divides i.
 */
import java.util.*;

public class DivisorPattern
{
    public static void main(String[] args)
    { 
        Scanner console = new Scanner(System.in);
        
        // Print a square that visualizes divisors.
        System.out.print("Size of square? ");
        int N = console.nextInt();
        int i, j;
        
        for( i=1 ; i <= N; i++)
        {
            for ( j=1 ; j <= N ; j++)
            {
                if (i % j == 0 || j % i == 0)
                    System.out.print(" > ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
   }
}
