
/**
 * Class EvenOdd
 * 
 */
import java.util.*;

public class EvenOdd
{
    public static void main(String[] args)
    {
    Scanner console = new Scanner(System.in);
    //variable declaration
    int number;
       
    //Ask user for input values.
    System.out.print("Enter number:");
    number = console.nextInt();
       
    //output (if statement only)
    if (number % 2 == 0) 
         System.out.println("even ");
    if (number % 2 != 0) 
         System.out.println("odd ");
         
      //output (switch statement only) 
       switch (number%2) {
         case 0:
            System.out.printf("even ");
            break;
         default:
            System.out.printf("odd ");
            break;

    }
  }
}


