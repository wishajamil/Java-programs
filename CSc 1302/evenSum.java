//////////////////////////////////////////////////
// Lab 9 Question 1 Output:                     //
//                 2                            //
//                 4 2                          //
//                 6 4 2                        //
//                 8 6 4 2                      //
//                 10 8 6 4 2                   //
//////////////////////////////////////////////////
  
import java.util.*;

public class evenSum
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int number;          
      
      System.out.println("Enter a number: ");
      number = console.nextInt();
      
      System.out.println(evenSum(number));         
   }
   
   public static int evenSum (int n) 
   {
      if (n == 0)
         return 0;
      if(n % 2 == 0)
      {
         return (n+evenSum(n-1));
      }
      else
      {
         return evenSum(n-1);
      }
   }   
}