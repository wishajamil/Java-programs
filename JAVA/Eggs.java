
import java.util.*;

public class Eggs
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        // Variables
        int eggs;   //Number of eggs purchased
        double oneBill;   //dozen >= 0 && dozen < 4
        double twoBill;   //dozen >= 4 && dozen < 6
        double threeBill;   //dozen >= 6 && dozen < 11
        double fourBill;   //dozen >= 11
        
        //Ask User
        System.out.print("\nHow many eggs are you purchasing? ");
        eggs = console.nextInt();
        
        //Computation
        oneBill = (eggs%12)*(0.5*(double)1/12)+((int)(eggs/12))*0.5;
        twoBill = (eggs%12)*(0.45*(double)1/12)+((int)(eggs/12))*0.45;
        threeBill = (eggs%12)*(0.4*(double)1/12)+((int)(eggs/12))*0.4;
        fourBill = (eggs%12)*(0.35*(double)1/12)+((int)(eggs/12))*0.35;
        if (eggs<48){
            System.out.printf("The bill is equal to: $%.2f", oneBill);
        }
        else if(eggs<72){
            System.out.printf("The bill is equal to: $%.2f", twoBill);
            }
        else if(eggs<132){
            System.out.printf("The bill is equal to: $%.2f", threeBill);
            }
        else if(eggs>=132){
            System.out.printf("The bill is equal to: $%.2f", fourBill);
            }
        
        
        
    }
}