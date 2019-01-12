/**
 * Hangman - Class Project
 * 
 * String topics:
 *    concatenation, indexOf, substring, nextLine, equals, compareTo
 */
import java.util.*;

public class Hangman
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      String word;
      String template, oldTemplate;
      String guess;
      int    wrong = 0;
        
      word = selectWord();
      template = buildTemplate( word );
        
      System.out.printf("template is %s\n", template);
      while( !template.equals( word) && wrong < 8 )
      {
         display( wrong );
         System.out.printf("Template: %s\n", template);
         System.out.printf("Guess a letter: ");
         guess = console.nextLine();
            
         oldTemplate = template;
         template = uncoverLetters( template, word, guess);
         if( template.equalsIgnoreCase( oldTemplate) )
         {
            wrong++;
            System.out.printf("That's a terrible guess!\n");
         }
         else
            System.out.printf("Good guess!\n");
      }
      if( wrong == 8 )
      {
         System.out.printf("Sorry. You lost! \nThe word is " + word + "\n");
      }
      else
         System.out.printf("Congratuations! You Win!\n");
   }
    
   public static String selectWord()
   {
      return "ComputerScience"; 
   }
    
   public static String buildTemplate( String word )         
   {
      String result = "";
        
      for(int i=0; i < word.length() ; i++)
         result = result + "-";
        
      return result;  
   }
    
   public static String uncoverLetters( String template, String word, String letter)            
   {
      String newTemplate = "";
       
      for( int i=0; i < word.length(); i++)
      {
         String ch = word.substring( i, i+1);
         if( ch.toLowerCase().equals( letter.toLowerCase() ) )
            newTemplate += word.substring(i, i+1);
         else
            newTemplate += template.substring( i, i+1 );
      }
      return newTemplate;
   }
        
    /** display( n )
     *  n - figure number to display. The game ends when 7 attempts have been made to 
     *      guess the word. After the person misses the first time, the first (n=1)
     *      figure should be displayed.
     */
   public static void display( int n )
   {
      switch( n )
      {
         case 0:  System.out.printf(            
                        "  +---+\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
            break;       
         case 1 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
            break;      
         case 2 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
            break;
         case 3 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
            break;
         case 4 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
            break;
         case 5 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========\n" );
            break;
         case 6 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " /    |\n" +
                        "      |\n" +
                        "=========\n" );
            break;
         case 7 : System.out.printf(            
                        "  +---+\n" +
                        "  |   |\n" +
                        "  O   |\n" +
                        " /|\\  |\n" +
                        " / \\  |\n" +
                        "      |\n" +
                        "=========\n" );
            break;
      }
   }
}