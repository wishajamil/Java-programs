/** TimeConversion
 
  */

import java.util.*;

public class TimeConversion
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      
      // Variable declarations
      int hour;          //time in hours and minutes
      int minutevalue;   //time in minutes 
      int minutes;
      
      // Ask user for input values.
      System.out.println( "what is the time in minutes? ");
      minutevalue = console.nextInt();
      
      hour = (minutevalue / 60);
      minutes = (minutevalue % 60);
      
      //output
      System.out.printf("The time in hours is %d:%02d \n", hour, minutes );
      
   }
}
