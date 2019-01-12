
/**
 * class CycleElements - using built-in arrays
 * 
 */
import java.util.*;

public class CycleElements
{
   public static void main(String[] args)
   {
      int[] x = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
      int   i;
        
      System.out.println("Original Array:");
      display(x);
   
      System.out.println("Array after cycling once:");
      cycleElements( x );
      display(x);
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
  
      // Write cycleElements method below
   public static void cycleElements( int [] x )
   {
      int last = x[x.length-1];  
      if(x.length >1){ 
        
         for( int index = x.length-2; index >= 0 ; index-- )
         {
            x[index+1] = x [index];
         }
      }
      x[0] = last;
      System.out.println(Arrays.toString(x));
   }  
}

