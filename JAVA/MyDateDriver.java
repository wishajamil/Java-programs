// Class MyDateDriver 


public class MyDateDriver
{
   public static void main(String[] args)
   {
      // Create three MyDate Objects using  constructors.
      //             
      MyDate d1 = new MyDate( 10, 9, 2006);
      MyDate d2 = new MyDate( 10, 10, 2006);  
      MyDate d3 = new MyDate( 10, 15, 2006);
      
      // Display the dates. Demonstrates the toString method
      // and getDOW() method.
      //
      System.out.print( "Date d1: ");
      d1.display();
      System.out.print( "\nDate d2: ");
      d2.display();
      System.out.print( "\nDate d3: ");
      d3.display();
      
      // Change d2 to an invalid date - the date should remain unchanged
      //
      System.out.println("\n\nChanging d2 to an invalid date: 13/02/2000");
      d2.setDate( 13, 2, 2000);
      System.out.print( " d2 after changing to invalid date: ");
      d2.display();
      System.out.println("[Should be UNCHANGED!]");
   
      // Relational Tests
      //
      System.out.println("\nRelational Tests:");
      System.out.print(" (");
      d1.display();        
      System.out.print( " ).compareTo( ");
      d2.display(); 
      System.out.println(" )= " + d1.compareTo(d2));
      
      System.out.print(" (");
      d2.display();        
      System.out.print( " ).compareTo( ");
      d1.display(); 
      System.out.println(" )= " + d2.compareTo(d1));
      
      System.out.print(" (");
      d1.display();        
      System.out.print( " ).compareTo( ");
      d1.display(); 
      System.out.println(" )= " + d1.compareTo(d1));
      
      System.out.println(" - equals:");
         
      if( d1.equals(d2) )
         System.out.println("  d1 == d2");
      else
         System.out.println("  d1 != d2");
          
      // advance d1 by 4 days!
      //
      System.out.print("\nAdvancing d1 (");
      d1.display();
      System.out.println(") by 4 days.\n");
      
      for( int i=0; i < 4; i++)
      {
         d1.nextDay();
         System.out.print("  advance by " +( i+1) + ": " );
         d1.display();
         System.out.println(" is a " + dow(d1));
      }
      
      System.out.print( "\nDays between ");
      d3.display();
      System.out.print( " and " );
      d2.display();
      System.out.println(" = " + d3.daysBetween( d2) );
      
   }
   
   private static String dow(MyDate d)
   {
      int dayNum = d.getDOW();
      String day = "";
      switch( dayNum)
      {
         case 0: day = "Sunday";
            break;
         case 1: day = "Monday";
            break;
         case 2: day = "Tuesday";
            break;
         case 3: day = "Wednesday";
            break;
         case 4: day = "Thursday";
            break;
         case 5: day =  "Friday";
            break;
         case 6: day = "Saturday";
            break;
      }
      return day;
   }
}
