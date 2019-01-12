/**
 * Tax1
 * 
 */
import java.util.*;

public class Tax1
{

    public static void main(String[] args)
    {
       Scanner console = new Scanner(System.in);
       // Variable declarations
       double salary;
       double BaseTax;
       double less;
       double TaxPercentage;
       double ExcessSalary;
       double ExcessStax;
       double totalTax;
       
       // Ask user for input values.
       System.out.print("Enter the salary in dollars:");
       salary = console.nextDouble();
       
       // Output 
       if (salary <= 1499.99) {
         BaseTax = 0.00;
         less = 0.00;
         TaxPercentage = 15;
         ExcessSalary = salary - less;
         ExcessStax = (ExcessSalary * TaxPercentage )/100;
         totalTax = (ExcessStax + BaseTax);
         System.out.printf(" The total tax due is: $%.2f \n", totalTax);
         }
       else if (salary <= 2999.99) {
         BaseTax = 225.00; 
         less = 1500.00;
         TaxPercentage = 16;
         ExcessSalary = salary - less;
         ExcessStax = (ExcessSalary * TaxPercentage )/100;
         totalTax = (ExcessStax + BaseTax);
         System.out.printf(" The total tax due is: $%.2f \n", totalTax);
         }
       else if (salary <= 4999.99) {
         BaseTax = 465.00; 
         less = 3000.00;
         TaxPercentage = 18;
         ExcessSalary = salary - less;
         ExcessStax = (ExcessSalary * TaxPercentage )/100;
         totalTax = (ExcessStax + BaseTax);
         System.out.printf(" The total tax due is: $%.2f \n", totalTax);
         }
       else if (salary <= 7999.99) {
         BaseTax = 825.00; 
         less = 5000.00;
         TaxPercentage = 20;
         ExcessSalary = salary - less;
         ExcessStax = (ExcessSalary * TaxPercentage )/100;
         totalTax = (ExcessStax + BaseTax);
         System.out.printf(" The total tax due is: $%.2f \n", totalTax);
         }
       else if (salary <= 15000.00) {
         BaseTax = 1425.00; 
         less = 8000.00;
         TaxPercentage = 25;
         ExcessSalary = salary - less;
         ExcessStax = (ExcessSalary * TaxPercentage )/100;
         totalTax = (ExcessStax + BaseTax);
         System.out.printf(" The total tax due is: $%.2f \n", totalTax);
         }
    }
}