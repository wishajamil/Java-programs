import java.util.ArrayList;

public class Lab7
{
   public static void main(String[] args)
   {
      ArrayList<String> word = new ArrayList <String> ();
      word.add("how");
      word.add("are");
      word.add("you");
      
      doubleList(word);
      System.out.println(word);
      
      ArrayList<String> wordLength = new ArrayList <String> ();
      wordLength.add("What");
      wordLength.add("is");
      wordLength.add("odd");
      wordLength.add("even");
      
      removeOddLength(wordLength);
      System.out.println(wordLength);
      
      ArrayList<Integer> list1 = new ArrayList <Integer> ();
      list1.add(1);
      list1.add(4);
      list1.add(8);
      list1.add(9);
      list1.add(11);
      list1.add(15);
      list1.add(17);
      list1.add(28);
      list1.add(41);
      list1.add(59);
      
      ArrayList<Integer> list2 = new ArrayList <Integer> ();
      list2.add(4);
      list2.add(7);
      list2.add(11);
      list2.add(17);
      list2.add(19);
      list2.add(20);
      list2.add(23);
      list2.add(28);
      list2.add(37);
      list2.add(59);
      list2.add(81);
      
      ArrayList<Integer> list3 = intersect(list1,list2);
      System.out.println(list3);
   }

   public static void doubleList(ArrayList<String> words) 
   {
      int oldSize = words.size();
      for (int i = 0; i < oldSize; i++) 
      {
         String word = words.get(2 * i);
         words.add(2 * i + 1, word);
      }
   }
   
   public static void removeOddLength(ArrayList<String> numbers) 
   {
      for (int i = 0; i < numbers.size(); i++) 
      {
         String words = numbers.get(i);
         if (words.length() % 2 != 0) 
         {
            numbers.remove(i);
            i--;
         }
      }
   }
   
   public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2)
   {
      int i = 0;
      int j = 0;
      ArrayList<Integer> list3 = new ArrayList<Integer>();
      while(i<list1.size() && j<list2.size())
      {
         if(list1.get(i) < list2.get(j)) {
            i++;
         } else if (list1.get(i) > list2.get(j)) {
            j++;
         } else { 
            list3.add(list1.get(i));
            i++;
            j++;
         }
      }
      return list3;
    
   }
}