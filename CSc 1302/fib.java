import java.util.*;

public class fib
{ 
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int number;          
      
      System.out.println("Enter a number: ");
      number = console.nextInt();
            
      System.out.println(fib(number));
   }
   
   public static int fib(int n)
   {
      if(n == 1 || n == 2){
         return 1;
      }
      return fib(n-1) + fib(n-2); 
   }
}