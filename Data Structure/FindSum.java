import java.util.HashSet;
public class FindSum {
   public static void main(String args[]){
      int[] arr = { 1, 5, 4, 6, 7, 9 };
      HashSet<Integer> res = findSums(arr);
      System.out.println(res.toString()); 
   }

/*
      1. Creates a hashtable called “hashT” and inserts all the elements of the input array in the hashtable.
      2. Finds pairs of elements in the hashtable whose sum is another element (sum) in the hashtable and print the
         pairs in the console.
      3. Returns another hashtable names “sums” of those sum elements.
*/
   public static HashSet<Integer> findSums(int elements[]){
      HashSet<Integer> sums = new HashSet<Integer>();
      HashSet<Integer> hashT = new HashSet<Integer>();
      
      for(int i = 0; i < elements.length; i++){
         hashT.add(elements[i]); 
      }
      for(int i = 0; i < elements.length; i++){
         for(int j = i; j < elements.length; j++){ 
            if(hashT.contains(elements[i] + elements[j])){ 
               sums.add(elements[i] + elements[j]);
            }
         }
      }
      return sums; 
   }

}