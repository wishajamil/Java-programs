import java.util.*;

public class AcademicStatus
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      // Variable declarations
      double GPA;
      
      // Ask user for input values.
      System.out.print("Enter your GPA:");
      GPA = console.nextDouble();
      
      //Output 
      if ( GPA < 0.0) 
          System.out.printf("Invalid Entry");
      if ( GPA >= 0.0 && GPA < 1.0) 
         System.out.printf("Failed semester-registration suspended"); 
      if ( GPA >= 1.0 && GPA < 2.0)
         System.out.printf("On probation next semester");
      if ( GPA >= 2.0 && GPA < 3.0) 
         System.out.printf("NO MESSAGE");
      if ( GPA >= 3.0 && GPA < 3.5)
         System.out.printf("Dean's list for semester");
      if ( GPA >= 3.5 && GPA < 4.0)
         System.out.printf("Highest honors for semester"); 
      if ( GPA > 4.0)
         System.out.printf("Invalid Entry");
      
   }
}
