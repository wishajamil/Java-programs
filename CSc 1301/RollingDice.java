import java.util.*;

public class RollingDice
{
   public static void main(String[] args)
   {
      int sides = 6;
         
      Scanner console = new Scanner(System.in);;
      
      int roll1 = (int)(sides * Math.random()) + 1;
      int roll2 = (int)(sides * Math.random()) + 1;
      int total = roll1 + roll2;
      
      System.out.println("The first die comes up: " + roll1);
      System.out.println("The second die comes up: " + roll2);
      System.out.println("Your total roll is: " + total);
   
   }  
}


