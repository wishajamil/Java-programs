/**
 * Name: Wisha Jamil
 * Lab time: Friday @ 10:00AM - 11:40AM
 *  
 */

import java.util.Arrays;

public class SortingElements
{
   public static void main(String[] args)
   {
      String[] x = new String[] {"a","w","f","c","b" };
      
      System.out.println("Before sorting: " + Arrays.toString(x));
      selectionSort(x);
      System.out.println("After sorting: " + Arrays.toString(x) + "\n");
      
      String[] y = new String[] {"b", "g", "a", "e", "d" };
   
      System.out.println("Before sorting: " + Arrays.toString(y));
      insertionSort(y);
      System.out.println("After sorting: " + Arrays.toString(y) + "\n");
      
      String[] z = new String[] {"s", "y", "t", "v", "q", "h", "i"};
   
      System.out.println("Before sorting: " + Arrays.toString(z));
      bubbleSort(z);
      System.out.println("After sorting: " + Arrays.toString(z)); 
   }
   
   public static void selectionSort( String[] x )
   {
      for(int i = 0; i < x.length - 1; ++i)
      {
         int minIndex = i;
         
         for(int j = i + 1; j < x.length; ++j)
         {
            if(x[j].compareTo(x[minIndex]) < 0 )
            {
               minIndex = j;
            }
         }
         String temp = x[i];
         x[i] = x[minIndex];
         x[minIndex] = temp;
      }
   }
   public static void insertionSort(String[] x)
   {
      String temp;
      for(int i = 1; i < x.length; i++) 
      {
         temp = x[i];
         int j = 0;
         for(j = i; j > 0; j--)
            if(temp.compareTo(x[j - 1]) < 0)
               x[j] = x[j - 1];
            else
               break;
         x[j] = temp;
      }
   }
   public static void bubbleSort(String[] x) 
   { 
      for (int i = 0; i < x.length-1; i++)
      { 
         for (int j = 0; j < x.length-i-1; j++)
         {
            if (x[j].compareTo(x[j+1]) < 0) 
            { 
               String temp = x[j]; 
               x[j] = x[j+1]; 
               x[j+1] = temp; 
            } 
         }
      }
   }    
}