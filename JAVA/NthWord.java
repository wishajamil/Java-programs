 /**
 * Class NthWord 
 */
import java.util.*;

public class NthWord
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String sentence;
        int    n;
        
        System.out.print("Enter a sentence: ");
        sentence = console.nextLine();
        System.out.print("Extract what word number? ");
        n = console.nextInt();
        
        System.out.printf("The %d-th word in \"%s\" is \"%s\"\n", 
                         n, sentence, nthWord( sentence, n) );

    }
    
    // Add nthWord method here
    public static String nthWord( String sentence, int n)
    {
        int d = -1;     
        for(n = n-1 ; n>0; n --)
        {
            d = sentence.indexOf (" ",d+1);
            if (d==-1)
                return "";
            
        }
        int y = sentence.indexOf (" ",d+1);
        if (y == -1)
            return sentence.substring (d+1); 
        return sentence.substring (d+1,y);
        
    }
 }
    
/**
public static void main(String[] args) {
        int nth = 5;
        String s = "This is a sample sentence example to test nth numer, lets say 5th.";
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            // you may omit any word you consider is not a word.
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        System.out.println(words.length);
        if(nth >= 1 && nth <= words.length)
            System.out.println("Nth word is: "+words[nth-1]);


    }
*/
