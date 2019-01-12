/**
 * Write a description of class PiEstimate here.
 * 
 * @author (your name) 
 */
import java.util.*;

public class PiEstimate
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int trials;
      double x, y;
      double x2, y2; 
      double d;
      double PI;
      int hits=0;
      int misses=0;
      int attempts;
      double prob;
      
      System.out.printf("Welcome to the Pi Estimation Program\n");
      System.out.printf("How many trials would you like to run? ");
      trials = console.nextInt();
      attempts =  trials; 
      while (trials > 0)
      {
         x = (2*Math.random());
         y = (2*Math.random());
      
         x2 = Math.pow(x-1,2);
         y2 = Math.pow(y-1,2);
      
         d = Math.sqrt(x2+y2);
         
         if (d>1)
            misses++;
         else hits++; 
         trials--;
      }
   
      prob = (double)hits/attempts;
      PI = 4 * prob;
          
      System.out.printf("Pi is estimated to be %.7f\n",PI);
   }
}
     
