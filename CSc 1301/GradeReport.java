import java.util.*;


public class GradeReport {

   public static void main(String[] args)
   {
      
      int grade, status;
      
      Scanner input = new Scanner(System.in);     
   
            
      do {
         System.out.println("Enter your grade (0 to 100): ");
         grade = input.nextInt();
         if(grade >= 0 && grade <= 100) 
            break;
         System.out.print("Error: You must enter an integer between 0 and 100. Enter the grade again");     
      } while (grade >= 0 && grade <= 100);
   
      
      status = grade / 10;
      System.out.print("Your grade status is ");
      
      switch (status) {
         case 10: 
            System.out.println("(A+) Perfect score. Good job!");
            break;
         case 9:
            System.out.println("(A) well above average. Excellent!");
            break;
         case 8:
            System.out.println("(B) above average. Nice job!");
            break;
         case 7:
            System.out.println("(C) Average!");
            break;
         case 6: 
            System.out.println("(D) below average. Go see the professor!");
            break;
         default:
            System.out.println("(F) drop out!");
            break;
      
      }
           
       
   }
}
