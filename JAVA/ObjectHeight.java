/**
 * The height of an object at any given time dropped from a starting height
 * of 100 meters is given by the equation h=100-4.9t^2 where t is in seconds
 * Create an application that prompts the user for a time less than 4.5 seconds
 * and then displays the height of the object at that time.
 */

import java.util.*;

public class ObjectHeight
{
   public static void main(String[] args)
   { 
      Scanner console = new Scanner(System.in);  
      
      // Variable declarations
      double height;         // starting height
      double time;           // time 
      
      // Ask user for input values.
      System.out.print( "At what time do you want to find the height of the object? (use time less that 4.5)");
      time  = console.nextDouble();
      
      height = 100 - 4.9 *(time*time);
      
     // Output height in meters
      System.out.println("The height of the object is " + height + " meters");
   }
}