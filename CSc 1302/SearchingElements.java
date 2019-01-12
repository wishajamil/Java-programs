/**
 * Name: Wisha Jamil
 * Lab time: Friday @ 10:00AM - 11:40AM
 *  
 */
 
import java.util.*;

public class SearchingElements
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
   
      int[] x = {5, 15, 44, 67, 88, 95, 96};
      int[] y = {1, 2, 7, 13, 23, 32, 65};
      int[] z = {1, 2, 7, 13, 23, 32, 65};
      
      System.out.print("Enter a number for Sequential Search: ");
      int number = console.nextInt();
      
      int index = sequentialSearch(x,number);
      System.out.println("Index: " + index);
   
      System.out.print("Enter a number for Binary Search: ");
      int number2 = console.nextInt();
   
      int index2 = binarySearch(y,number2);
      System.out.println("Index: " + index2);
      
      System.out.print("Enter a number for Binary Search Recursively: ");
      int number3 = console.nextInt();
   
      int index3 = binarySearchRecur(z,number3,0,z.length-1);
      System.out.println("Index: " + index3);
      
   }
   public static int sequentialSearch( int[] x, int value )
   {
      for( int i = 0; i < x.length; i++)
      {
         if( x[i] == value )
         {
            return i;
         }
      }
      return -1;
   }
   
   public static int binarySearch(int[] y, int value) 
   {
      int min = 0;
      int max = y.length -1;
      while (min <= max) 
      {
         int mid = (min + max) / 2;
         if (y[mid] < value) 
         {
            min = mid + 1;
         } else if (y[mid] > value) 
         {
            max = mid - 1;
         } else {
            return mid;  
         }
      }
      return -(min + 1); 
   }
   
   public static int binarySearchRecur(int[] z, int value, int min, int max) 
   {

      if (min > max) 
      {
         return -1;
      } else {
         int mid = (min + max) / 2;
         if (z[mid] < value) 
         {
            return binarySearchRecur(z,value, mid +1, max);
         } else if (z[mid] > value) {
            return binarySearchRecur(z,value, min, mid-1);
         } else {
            return mid;  
         }
      }
   }   
}