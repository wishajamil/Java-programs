/**
 * FirstOddOccurrence -- using ArrayLists
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class FirstOddOccurrence
{
    public static void main(String[] args)
    {
        int[] x = { 2, 4, 6, 7, 4, 3, 2, 7, 6, 7, 7 };
        int   i;
        
        display(x);

        System.out.printf("# Occurrences of first odd = %3d\n",
                          firstOddCount(x) );
   }
   
   private static void display( int[] x )
   {
       int i;
       
       System.out.print("Array: ");
       for(i=0; i < x.length; i++)
       {
           if( i < x.length-1 )
                System.out.printf("%3d, ", x[i]);
           else
                System.out.printf("%3d\n", x[i]);
       }
    }
  
   public static int odd(int[] x) 
   {
       
       int i;
       int y;
       for (i = 0; i < x.length; i++) 
       {
           y = x[i] % 2;
           if (y == 1) 
           {
               return x[i];
           }
       }
       return 0;
    }

   public static int firstOddCount(int x[]) 
   {
       
       int i;
       int c = 0;
       for (i = 0; i < x.length; i++) 
       {
           if (x[i] == odd(x))
               c++;

       }
       return c;
   }
}

