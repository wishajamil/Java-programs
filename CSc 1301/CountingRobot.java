import java.util.*;

public class CountingRobot
{
   public static void main(String[] args) 
   {
      Scanner input=new Scanner(System.in);
      
      System.out.println("Please enter your starting integer");
      int a=input.nextInt();
      System.out.println("Please enter your ending integer");
      int b=input.nextInt();
   		
      System.out.println("Please enter your step size");
      int c=input.nextInt();
      while (c<0){
         System.out.println("having a negative step size will result in an infinite loop, please re-enter");
         c=input.nextInt();
      }
      if(a>b){System.out.println("infinite loop...");}
   			
      int d=1;
      for(int i=a; i<=b;i+=c){
      			
         System.out.println("iteration "+d);					
      }
   			
   			
   }
}