import java.util.*;

public class hourglass
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
   
      int i,j,k;
               
      for (i=5; i>=1; i-=2)
      {
         for(k=4; k>=i; k--)
         {
            System.out.print(" ");
         }
         for (j=i; j>=1; j--)
         {
            System.out.print("* ");
         } 
         System.out.println("");
      }      
      for(i=3; i<=5; i+=2)
      {
         for(k=4; k>=i; k--)
         {
            System.out.print(" ");
         }
         for(j=1; j<=i; j++)
         {
            System.out.print("* ");
         }
         System.out.println("");
      } 
       
      System.out.println();
      System.out.print( "enter three numbers (seperated by space):");
      int num1 = console.nextInt();
      int num2 = console.nextInt();
      int num3 = console.nextInt();
      
      median(num1,num2,num3);
      
      System.out.println();
      System.out.print( "enter two numbers (seperated by space):");
      int num4 = console.nextInt();
      int num5 = console.nextInt();
      
      count(num4,num5);   
   }
   public static void median(int num1, int num2, int num3)
   {
      int one=num1, two=num2, three=num3;
      if(two>one && one>three || three>one && one>two)
      {
         System.out.println(num1);
      }
      if(one>two && two>three || three>two && two>one)
      {
         System.out.println(num2);
      }
      if(one>three && three>two || two>three && three>one)
      {
         System.out.println(num3);
      }
   }
   public static void count(int num4, int num5)
   {
      int i = num4;
      
      while(i < num5) 
      {
         System.out.print(i + ",");
         i++;
      } 
      while(i > num5)
      {
         System.out.print(i + ",");
         i--;
      }
      System.out.print(num5);     
   }
}