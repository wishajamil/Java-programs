/**
 * Class DecBin2
 *    - convert a decimal number into its binary representation.
 *    
 */
import java.util.*;

public class DecBin2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int x = 0;      // the entered number
        int result = 0; // the binary number encoded as a decimal number
        // ADD MISSING CODE HERE
        
        StringStack s = new StringStack();  
        String b = "" ; 
        
        System.out.printf("Enter a decimal number: ");
        x = console.nextInt();
        
        int x2 = x;
       
        // ADD MISSING CODE 
        while ( x2 > 0 ) 
        {
            s.push( "" + (x2 % 2)); 
            x2 = x2 / 2; 
        }
        
        while ( s.depth() > 0)
        {
            b = b + s.pop();  
        }
        result = Integer.parseInt( b ) ;
        
        System.out.printf("The integer %d in binary is %d\n", x, result);
        
    }
}
