import java.util.Scanner;

class Convert_Date
{
   public static void main(String args[])
   {
       Scanner console = new Scanner(System.in);
      
       int MaxCap, pun;       // space, punctuation(comma)
       String date, d, m, y;  //day, month, year
      
       System.out.print("Enter date to be converted(month day, year): ");
       date = console.nextLine();
       date = date.trim();
       MaxCap = date.indexOf(' ');
       pun = date.indexOf(',');
       
       d = date.substring(MaxCap + 1, pun);
       d = d.trim();
     
       m = date.substring(0, MaxCap);
       m = m.toLowerCase();
       m = m.substring(0, 1).toUpperCase() + m.substring(1);
       m = m.trim();
      
       y = date.substring(pun + 2);
       y = y.trim();
      
       String converted = d + " " + m + " " + y;
      
       System.out.println();
       System.out.println("Converted date: " + converted);
   }
}