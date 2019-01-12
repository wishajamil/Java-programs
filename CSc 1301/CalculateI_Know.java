import java.util.*;

public class CalculateI_Know 
{
   public static void main(String[] args)
   {
         
      Scanner console = new Scanner(System.in);
      
      System.out.println("Enter three numbers");
      int a = console.nextInt();
      int b = console.nextInt();
      int c = console.nextInt();
        
      System.out.println("The Sum of two largest number is " + calcLargestSum(a,b,c));
      System.out.println("The middle number is " + calcMiddleNumber(a,b,c));
   
   } 
   
   public static int calcLargestSum(int a, int b, int c)       
   { 
      int max = 0;
      for(int i=0;i<3;i++)
         if ( a < b || a < c){
            return b+c;
         }
         else if ( a > b || b > c){
            return a+b;
         }
         else if (a > c || c > b){
            return a+c;
         }
    
         
      return max;
   }
   
   public static int calcMiddleNumber (int a, int b, int c)
   {
      for(int i=0;i<3;i++)
         if ( a > b || a < c){
            return b;
         }
         else if ( a > b || b < c){
            return c;
         }
         else if (a > c || c < b){
            return a;
         }
         
      return a;
   
   }
   
}