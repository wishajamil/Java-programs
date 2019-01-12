/**
 * Class SentenceStats
 * 
 */
import java.util.*;

public class SentenceStats
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int i,x;
        // Declaring a String
      String sentence;
      int    len;         // The length of the sentence
      int    words;       // numer of words in sentence
      int    vowels;      // number of vowels in sentence
        
               
      System.out.print("Enter a sentence: ");
      sentence = console.nextLine();
      System.out.printf(" Sentence Statistics:\n");
      System.out.printf("   Characters = %d\n", sentence.length() );
      System.out.printf("   Words      = %d\n", countWords(sentence) );
      System.out.printf("   Vowels     = %d\n", countVowels(sentence) );
   }
    
    // Add countWords method here.    
   public static int countWords (String s ) 
   {
      return s.split("\\s+").length;
   }

   public static boolean isVowel ( String C) 
   {
      int v;
      String s; 
      v = C.length();
      s = C.substring (v-1,v);
      if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") || s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("U"))
         return true; 
      else 
         return false;
   }
    
    // Add countVowels method here.
   public static int countVowels ( String S) 
   {
      int CountVowels=0,i;
      String s;    
              
      for (i = S.length(); i>0; i-- ) 
      {
         s = S.substring (i-1,i);
         if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") || s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("U"))
            CountVowels++; 
      }
      return CountVowels;   
   }
              
}
