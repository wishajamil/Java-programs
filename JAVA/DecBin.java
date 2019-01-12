/** 
 * Class DecBin
 * 
 */
import java.util.*;

class Count
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int integer;
      int b, m = 1, n;                  //binary 
      int sum = 0;
      int originaln;
      
      
      System.out.print("Enter a positive integer:");
      n = originaln = console.nextInt();
      
      while (n > 0){
         b = n % 2;    
         b = b * m;                                         
         n = n / 2;
         sum = sum + b;   
         m = m * 10;                      
      } 
       System.out.printf("The number %d in binary is %d", originaln, sum);   
         
 }  
}

