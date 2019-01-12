import java.util.*;
public class Order
{
   public static void main(String[] args) 
   {
      Scanner console = new Scanner(System.in);
      
      // Variable declarations
      int burgers;  
      int fries;    
      int sodas;    
      double cost;     
      double tax; 
      double total;
      double cash;
      double change; 
      double burgerscost = 1.69;
      double friescost = 1.09;
      double sodascost = 0.99;
      double taxrate;
      
      
      taxrate = 0.065;    //6.5 / 100
      
      // Ask user for input values.
      System.out.print( "how many busgers would you like to order? ");
      burgers = console.nextInt();
      System.out.print( "how many fries would you like to order? ");
      fries = console.nextInt();
      System.out.print( "how many sodas would you like to order? ");
      sodas = console.nextInt();
      
      cost = (burgerscost*burgers)+(friescost*fries)+(sodascost*sodas);
      tax = (taxrate*cost);
      total = (cost+tax);
      
      
      //output total and tax
      System.out.printf( "total before tax is $%.2f \n", cost);
      System.out.printf("tax is $%.2f \n", tax);
      System.out.printf("total including the tax is $%.2f \n", total);
      
      
      // Ask user for input values.
      System.out.print( "Enter the cash: ");
      cash = console.nextInt();
      
      change = (cash - total);
      
      //output change
      System.out.printf("change is $%.2f \n", change);
   }    
}
 