/**
 * Class ReverseString
 * 
 */
import java.util.*;

public class ReverseString
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      String  sentence;
      String  reversed = "";
      int     i;
      
      System.out.print("Enter a sentence: ");
      sentence = console.nextLine();
      
      // reverse the string and place the result into a new string named reverved
      reversed = new StringBuffer(sentence).reverse().toString(); 
   
      System.out.printf("Original: %s\n", sentence);
      System.out.printf("Reversed: %s\n", reversed);
      
      // determine if the string is a palindrome or not and display.
      if (sentence.equals( reversed)) 
         System.out.printf ( "The sentence (word) IS a polindrome!\n", sentence);
      else 
         System.out.printf ( "The sentence (word) IS NOT a polindrome\n", sentence);
   }   
}