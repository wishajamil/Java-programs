///////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Project 5                                                                  //
//Name: Wisha Jamil                                                                                  //
//Lab time: Friday 1:00PM to 2:40PM                                                                  //
//Project description: reads worker’s payroll information and computes the amount of pay for a worker//
///////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;


public class payroll {

   public static void main(String[] args)
   {
      String first;
      String last;
      
      Scanner input = new Scanner(System.in);     
   
      System.out.println("What is employee's full name?");
      first = input.next(); 
      last = input.next();
      
      System.out.println("How many hours did the employee worked?");
      double hours = input.nextDouble();
      
      System.out.println("What is your hourly rate of pay?");
      double hourlyRate = input.nextDouble();
      
      System.out.println("What is the federal tax rate?");
      double taxRate = input.nextDouble();
      
      double grossPay = hours * hourlyRate;
      double taxDeducted = grossPay  * (taxRate/100);
      double netPay = grossPay - taxDeducted;
      
      System.out.println();
      System.out.println("Employee name: " + first + " " + last);
      System.out.println("Hours worked:  " + hours);
      System.out.printf("Hourly rate:   $%.2f \n", hourlyRate);
      System.out.printf("Gross pay:     $%.2f \n", grossPay);
      System.out.printf("Tax deducted:  $%.2f \n", taxDeducted);
      System.out.printf("Net pay:       $%.2f \n", netPay);
           
   }
}