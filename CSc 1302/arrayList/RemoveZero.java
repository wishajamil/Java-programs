import java.util.ArrayList;

public class RemoveZero
{
   public static void main(String[] args)
   {  
      ArrayList<Integer> list1 = new ArrayList <Integer> ();
      list1.add(0);
      list1.add(4);
      list1.add(0);
      list1.add(0);
      list1.add(0);
      list1.add(0);
      list1.add(1);
      
      System.out.println("Before: " + list1 + "\nAfter:  " + removeZeroes(list1) );
   }
   
   public static ArrayList<Integer> removeZeroes(ArrayList<Integer> numbers) 
   {
      for (int i = 0; i < numbers.size(); i++) 
      {
         if (numbers.get(i) == 0) 
         {
            numbers.remove(i);
            i--;
         }
      }
      return numbers;
   }
   
}