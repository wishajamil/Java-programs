/**
 * Name: Wisha Jamil
 * Lab time: Friday @ 10:00AM - 11:40AM
 *  
 */
import java.util.*;

public class Reverse
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      String word1, word2;          
      
      System.out.println("Enter two words: ");
      word1 = console.nextLine();
      word2 = console.nextLine();
      
      System.out.println(isReverse(word1,word2));
   }
    
   public static boolean isReverse(String s1, String s2) 
   {
      if (s1.length() == 0 && s2.length() == 0)   //if both words length are same return true 
      {
         return true;
      } else if (s1.length() == s2.length()) {   //if length are equal
         int length = s2.length();
         char first = Character.toUpperCase(s1.charAt(0));   //first word first letter to uppercase
         char last = Character.toUpperCase(s2.charAt(length - 1));   //second word last letter to uppercase (ignoring capitalization)
         if (first == last)   //first word first letter to uppercase = second word last letter to uppercase
         {
            return isReverse(s1.substring(1), s2.substring(0, length - 1));   //recursive case
         } else {
            return false;
         }
      }
      return false;
   }
}