/**
 * Name: Wisha Jamil
 * Lab time: Friday @ 10:00AM - 11:40AM
 *  
 */
import java.util.*;

public class PrintStars
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int number;          
      
      System.out.println("Enter a number: ");
      number = console.nextInt();
            
      System.out.println(starString(number));
   }
    
   public static String starString(int n) 
   {
      if(n == 0) {   //base case - just print one star
         return "*";
      } else {
         return starString(n - 1) + starString(n - 1);   //recursive case
      }
   }
}