/** DivAndMod
 */

import java.util.*;

public class DivAndMod
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        // Variable declarations
        int first; 
        int second;
        int division;
        int modulus;
                
        // Ask user for input values.
        System.out.print( "Enter the integer: ");
        first = console.nextInt();
        System.out.print( "Enter the integer: ");
        second = console.nextInt();
        
        division = first / second;
        modulus = first % second;
                
        //Output division and modulus
        System.out.println("The quoient of " + first + " / " + second + " is " + division );
        System.out.println("The remainder of " + first + " % " + second + " is " + modulus );
    }
}
