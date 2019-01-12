import java.util.*;

public class TimeConv
{
    public static void main(String[] args)
    {   Scanner console = new Scanner(System.in); 
        
        // Variable declarations
        double fahrenheit;       // temperature in fahrenheit
        double celsius;          // temperature in celsius
        
        // Ask user for input values. 
        System.out.print( "what is the temperature in celsius? ");
        celsius = console.nextDouble();
 
        fahrenheit = (celsius * 9.0/5) + 32;
        
        // Output temperature
        System.out.printf("the temperature of fahrenheit is %.2f ", fahrenheit);
        
    }
}