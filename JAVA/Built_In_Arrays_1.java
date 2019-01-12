/**
 * Introduction to "built-in Arrays" - Part 1
 * 
 * Topics: What is an array and organization.
 *    
 */
import java.util.*;

public class Built_In_Arrays_1
{
    public static void main(String[] args)
    {
        // 1) Declare an array of a primitive type.
        int[] x = new int[4];
        
        // 2) What's in an array variable?
        System.out.println( x );
        
        // 3) Elements of an array and accessing them.
        x[0] = 10;
        x[1] = 5;
        x[2] = -2;
        //x[3] = 7;
        x[3] = 2*x[0] + x[2];

        System.out.printf("element 0 is %d.\n", x[0] );
        
        for( int i = 0; i < x.length; i++);
            System.out.printf("elements %d is %d.\n", i, x[i] );

        System.out.printf("element 4 is %d.\n", x[4] );
        // 4) Initializing array values? (and default values)
        
        // 5) Determining how many elements are in an array
        //    and array bounds.
        
        for (int i = 0; i < x.length; i++); 
        {
            x[1] = i+1;
        }
        
        for (int i = 0; i < x.length; i++);
        {
            if (i == x.length - 1)
                System.out.printf( "%d\n," , x[i]);
            else 
                System.out.printf( "%d," , x[i]);
        }

        for (int i = 0; i < x.length; i++);
        {
            if (x[1] % 2 == 0 )
                x[1] = -x[i];
        }
        
        for (int i = 0; i < x.length; i++);
        {
            if (i == x.length - 1)
                System.out.printf( "%d\n," , x[i]);
            else 
                System.out.printf( "%d," , x[i]);
        }
        
        printArray (x);
    }
        
    public static void printArray ( int[] x )
    {
        if (i == x.length - 1)
            System.out.printf( "%d\n," , x[i]);
        else 
            System.out.printf( "%d," , x[i]);
    }

    }


