import java.util.*;

public class Loop
{

   public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Please enter an integer greater or equal to 1");
      int a=input.nextInt();
      while (a<1){
         System.out.println("Please enter an integer greater or equal to 1");
         a=input.nextInt();
      }
   			
      int sum=0;
      for(int i=1; i<=a;i++){
         sum+=i;					
      }
   			
      System.out.println("the total from 1 to "+a+" is: "+sum);
   }
}