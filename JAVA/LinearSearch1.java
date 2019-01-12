/** 
 * Demonstrate the linear search process using built-in java
 * arrays
 * 
 * @author A.P. Computer Science
 * @version 01/05/07
 */
import java.util.*;

class LinearSearch1
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int[]  n = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        int location;
        int seekValue;

        System.out.println("Element\t\tValue");

         // Display the current list
         //
         for( int i=0; i < 10; i++ )
                  System.out.println( i + "\t\t" + n[i] );

         System.out.print("Enter a value to seek: ");
         seekValue = console.nextInt();
        
         location = linearSearch( n, seekValue);
         
         if( location >= 0 )
             System.out.println("Element found at location " + location);
         else
             System.out.println("Element not found in list");
    }
    
    /**
     * Perform a linear search of the array of integers
     * @param n the array of int's
     * @param value the value being sought in the array
     * @return returns the index of the element or -1 if not found.
     */ 

    // ADD METHOD HERE
    public static int linearSearch( int[] x, int a)
    {
        for (int i = 0; i<x.length; i++)
        {
            if(x [i] == a) return 1;
        }
        return -1;
    }
}

