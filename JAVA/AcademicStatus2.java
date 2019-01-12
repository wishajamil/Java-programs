import java.util.*;

public class AcademicStatus2
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
        if ( GPA < 0.0) {
             System.out.printf("Invalid Entry");
         } else
        if ( GPA >= 0.0 && GPA < 1.0) {
            System.out.printf("Failed semester-registration suspended");
         } else  
        if ( GPA >= 1.0 && GPA < 2.0) {
            System.out.printf("On probation next semester");
         } else   
        if (  GPA >= 2.0 && GPA < 3.0) {
            System.out.printf("(NO MESSAGE)");
         } else 
        if ( GPA >= 3.0 && GPA < 3.5) {
            System.out.printf("Dean's list for semester");
         } else   
        if ( GPA >= 3.5 && GPA < 4.0) {
            System.out.printf("Highest honors for semester");
         } else  
        if ( GPA > 4.0) {
          System.out.printf("Invalid Entry");
        }
    }
}
