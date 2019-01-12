/**
 * Name: Wisha Jamil
 * Lab time: Friday @ 10:00AM - 11:40AM
 *  
 */
 
import java.util.*;

public class SelectionSort
{
   public static void main(String[] args)
   {
      int[] x = {1, 3, -2, 10, -5, 4, 7, -9 };
      
      selectionSort(x);
      printList(x);
   }
   public static void selectionSort( int[] x )
   {
      for( int i = x.length-1; i >= 0; i--)
      {
         int max = x[i];
         int maxIndex = i;
         
         for( int j = 0; j < i; j++)
         {
            if( x[j] > max )
            {
               max = x[j];
               maxIndex = j;
            }
         }
         int temp = x[i];
         x[i] = x[maxIndex];
         x[maxIndex] = temp;
      }
   }
   public static void printList( int[] x)
   {
      for(int i = 0; i < x.length; i++)
         System.out.printf( "%3d ", x[i]);
      System.out.println();
   }
   
}