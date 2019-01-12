/* BMI - Calculates a persons body mass index.
 * 
 */
import java.util.*;

public class BMI
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        // Variable declarations
        double weight;      
        double heightInches;
        double heightFeet;
        double hinches;
        double hmeters;
        double BMI;
        double wmass;
       
        // Ask user for input values.
        System.out.print("Enter your weight in pounds:");
        weight = console.nextDouble();
        
        System.out.println("Enter your height: ");
        System.out.print("Feet: ");
        heightFeet = console.nextDouble();

        System.out.print("Inches: ");
        heightInches = console.nextDouble();
        
        hinches = (heightFeet * 12) + heightInches;           
        hmeters = (hinches * 0.0254);                         
        wmass = (weight / 2.2);                               
        BMI = (wmass)/(hmeters*hmeters);
        
        // Output BMI
        System.out.printf("A " + heightFeet + " foot " + heightInches + " inch adult of " + weight + " pounds has a Body Mass Index (BMI) of %.1f \n", BMI);

        if ( BMI < 18.5) {
            System.out.printf("Their weight category is UNDERWEIGHT");
         } else  
        if ( BMI < 24.9) {
            System.out.printf("Their weight category is NORMAL");
         } else
        if ( BMI < 29.9) {
            System.out.printf("Their weight category is OVERWEIGHT");
         } else {
            System.out.printf("Their weight category is OBESE");
         }
    }
}




