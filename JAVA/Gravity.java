/**
 * Class Gravity
 * 
 */
import java.util.*;

public class Gravity
{

    public static void main(String[] args)
    {
        
       Scanner console = new Scanner(System.in);
       //variable declaration
       double weight;
       int planet;
       double FinalWeight;
        
       // Ask user for input values.
       System.out.print("\nEnter your weight:");
       weight = console.nextDouble();
       System.out.print("Planet numbers:");
       System.out.print("\n1 = Mercury     2 = Venus       3 = Earth");
       System.out.print("\n4 = Mars        5 = Jupiter     6 = Saturn");
       System.out.print("\n7 = Uranus      8 = Neptune     9 = Pluto");
       System.out.print("\nWhich planet?");
       planet = console.nextInt();
       
       //output
       switch (planet) {
         case 1: FinalWeight = (weight * 0.38);
            System.out.printf("Your weight will be " + FinalWeight +" pounds.\n ");
            break;
         case 2: FinalWeight = (weight * 0.78);
            System.out.printf("Your weight will be " + FinalWeight +" pounds.\n ");
            break;
         case 3: FinalWeight = (weight * 1.00);
            System.out.printf("Your weight will be " + FinalWeight +" pounds.\n ");
            break;
         case 4: FinalWeight = (weight * 0.39);
            System.out.printf("Your weight will be " + FinalWeight +" pounds.\n ");
            break;
         case 5: FinalWeight = (weight * 2.65);
            System.out.printf("Your weight will be " + FinalWeight +" pounds.\n ");
            break;
         case 6: FinalWeight = (weight * 1.17);
            System.out.printf("Your weight will be " + FinalWeight +" pounds.\n ");
            break;
         case 7: FinalWeight = (weight * 1.05);
            System.out.printf("Your weight will be " + FinalWeight +" pounds.\n ");
            break;
         case 8: FinalWeight = (weight * 1.23);
            System.out.printf("Your weight will be " + FinalWeight +" pounds.\n ");
            break;
         case 9: FinalWeight = (weight * 0.05);
            System.out.printf("Your weight will be " + FinalWeight +" pounds.\n ");
            break; 
         default: 
            System.out.printf("Unknown planet!");
            break;
        }
    }
}