import java.util.*;

public  class  CarpetCost
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        // Variable declarations
        double width;           // width of carpet
        double length;          // stores number of total gallons used
        String color;
        double area;            // area of carpet 
        double pricePerSQFoot;  // DISCUSS USE OF MAGIC NUMBERS and final
        double cost;            // total cost
            
        // Ask user for input values.
        System.out.print( "What color carpet would you like? ");
        color = console.nextLine();
        System.out.print( "What is the width of the room? ");
        width = console.nextDouble();
        System.out.print( "What is the length of the room? "); 
        length = console.nextDouble();  

        pricePerSQFoot = 2.50;
        
        cost = (length * width) * pricePerSQFoot;
        area = length * width;      // DISCUSS REUSE OF COMPUTED VALUE
        
        // Output area and cost
        System.out.println("The area of the " + width + " by " + length + 
                           " room is " +area); 
        System.out.printf("The total cost for the %s carpet is $%.2f \n", color, cost);
    }
}

