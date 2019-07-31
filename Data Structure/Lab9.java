import java.util.*;
import java.util.Arrays;
import java.util.HashSet;

public class Lab9 {

   public static void main(String []args){
   
      int[] arr = {1, 5, 3, 4, 2};
      int k = 3;
   
      long start = System.currentTimeMillis();
      System.out.println("Count is "+ solve_with_Hash(arr,k)); // should be 2
      System.out.println("Total execustion time (taken by solve_with_Hash):" + (System.currentTimeMillis()-start));
   
      start = System.currentTimeMillis();
      System.out.println("\n\nCount is "+ solve_with_Sort(arr,k)); // should be 2
      System.out.println("Total execustion time (taken by solve_with_Sort):" + (System.currentTimeMillis()-start));
   
   }
   
   public static int solve_with_Sort(int[] arr, int k){
   /*
      a. Initialize a counter variable to 0:                                      counter = 0
      b. Sort the array using the java library                                    Arrays.sort(array);
      c. Take two pointers, left and right, initially having values:              left = 0, right = 0
      d. While right < arr.length:
            • Get the difference:                                                 diff = array[right] – array[left]
            • If diff == k, increment counter, increment left and increment right.
            • if diff > k, increment left pointer
            • if diff < k, increment right pointer
      e. return counter
   */
      int counter = 0;
      Arrays.sort(arr);
      int left = 0;
      int right = 0;
      
      while (right < arr.length){
         int diff = arr[right] - arr[left];
         
         if(diff == k){
            counter++;
            left++;
            right++;
         }
         else if(diff > k){
            left++;
         }else
            right++;
      }
      return counter;
   }
    
   public static int solve_with_Hash(int[] arr, int k) {
   /*
      a. Initialize a counter variable to 0: counter = 0
      b. Insert all elements of array in a hashtable
      c. For every element in array:
            • Look for array[i] + k in the hash map, if found then increment counter.
            • Look for array[i] - k in the hash map, if found then increment counter.
            • Remove array[i] from hash table.
      d. return counter
   */
      int counter = 0;
      Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
   
      for(int i = 0; i < arr.length; i++){
         hash.put(arr[i], arr[i]);
      }
   
      for(int i = 0; i < arr.length; i++){
         if(hash.contains((arr[i] + k)) || hash.contains((arr[i] - k))) {
            counter++;
         }
         hash.remove(arr[i]);
      }
      return counter;
   } 
}