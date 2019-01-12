/**
 * Name: Wisha Jamil
 * Lab time: Friday @ 10:00AM - 11:40AM
 *  
 */
 
import java.util.*;

public class SelectionSort2
{
   public static void main(String[] args)
   {
      int[] x = {1, 3, -2, 10, 5, 4, 7, 9};
      
      duel(x);
      printList(x);
   }
   public static void duel( int[] x )
   {
      for( int i = x.length-1; i >= 0; i--)
      {
         int max = x[i];
         int maxIndex = i;
         int min = x[i];
         int minIndex = i;
         
         for( int j = 0; j < i; j++)
         {
            if( x[j] > max )
            {
               max = x[j];
               maxIndex = j;
            }
         }
         for( int k = i+1; k < x.length; k++)
         {
            if( x[k] < min )
            {
               min = x[k];
               minIndex = k;
            }
         }
         if(max > x[i]) 
         {
            int temp = x[i];
            x[i] = x[maxIndex];
            x[maxIndex] = temp;
         }
         if (min < x[i])
         {
            int temp = x[i];
            x[i] = x[minIndex];
            x[minIndex] = temp;
         }
      }
   }
   public static void printList( int[] x)
   {
      for(int i = 0; i < x.length; i++)
         System.out.printf( "%3d ", x[i]);
      System.out.println();
   }
}