/**
 * Name: Wisha Jamil
 * Lab time: Friday @ 10:00AM - 11:40AM
 *  
 */
import java.util.*;

public class Repeat
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      String word;      
      int number;     
      
      System.out.print("Enter a word: ");
      word = console.nextLine();
      System.out.print("Enter a number: ");
      number = console.nextInt();
      
      System.out.println(repeat(word,number));  //calls repeat method
   }
    
   public static String repeat(String s, int n)  //recursion method
   {
      if(n == 0)     //base case
      {
         return "";  //return empty string
      } else {
         return s + repeat(s,n-1);   //recursive case - return the word nth number of times
      }
      
   }
}