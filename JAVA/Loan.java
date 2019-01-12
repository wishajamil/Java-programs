/**
 * Class Loan
 * 
 * @author (your name) 
 */
import java.util.*;

public class Loan
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        double amount;                               // loan amount
        double r, i;                                 // annual interest rate
        int    y;                                    // term of loan in years
        int    n;                                    // number of payments
        double totalInt;                             // total interest
        double totalPay;                             // total payback
        double Mpayment;                             //monthly payment
        double Balance, Payment, PartInt, PartPrin;  //part 2 
        
        System.out.println("Duluth High School's Loan Calculator\n\n");
            
        System.out.print("What is the loan amount (in dollars)? ");
        amount = console.nextDouble();
        
        System.out.print("What is the annual interest rate (in percent)? ");
        r = console.nextDouble();
        
        System.out.print("What is the term of the loan (in years)? ");
        y = console.nextInt();
        
        r = r/100;
        i = r/12;
        
        n = y*12;
        
        System.out.println("Part 1 - Loan Information:\n");
        
        Mpayment = (amount * i)/(1-Math.pow(1 + i, -n));
        totalPay = Mpayment * n;
        totalInt = totalPay - amount;
        
        System.out.printf("You will make %d payements.\n", n);
        System.out.printf("Your monthly payment will be $%.2f\n", Mpayment);
        System.out.printf("Your total payback will be $%.2f\n", totalPay);
        System.out.printf("The total interest is $%.2f\n", totalInt);
        
        System.out.println("Part 2 - Loan amortication:");
        //Balance = amount + amount * 1;
        //Payment = Mpayment;
        //double balancePRIN = amount;
        //PartInt = amount * i;
        //PartPrin = Payment - PartInt;
        //int a = 1;
        System.out.print("# \t Balance \t Payment \t part INT \t Part PRIN\n");
    
    }
}


