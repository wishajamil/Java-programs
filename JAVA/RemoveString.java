/**
 * Write a description of class RemoveString here.
 * 
 */
import java.util.*;

public class RemoveString
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int i,x;
      // Declaring a String
      String sentence, remove;
      
      System.out.print("Enter a sentence: ");
      sentence = console.nextLine();
      System.out.print("Enter a string to remove: ");
      remove = console.nextLine();
      
      sentence = removeString(sentence + " ", remove);
      System.out.print("After removing the first occurence: ");
      System.out.printf("%s \n", sentence);
   
      // use removeString method to display result.
      
      sentence = removeAll(sentence + " ", remove);
      System.out.print("After removing all occurences:      ");
      System.out.printf("%s \n", sentence);
   
      // use removeAll method to dispay result.
   }
   
    // Add removeString method here    
   public static String removeString( String sentence, String word) 
   {
      int SL = sentence.length();
      int SI = sentence.indexOf( word );          
      String s = sentence.substring( 0,SI ); 
      SI = sentence.indexOf ( " " , SI );
      s = s + sentence.substring( SI , SL ); 
      
      return s; 
   }
   
   //Add removeAll method here
   
   public static String removeAll (String sentence, String word)
   {
      while ( sentence.indexOf(word) != -1)
      {
         sentence = removeString( sentence , word );
      
      }
      return sentence;
      
   }        
}