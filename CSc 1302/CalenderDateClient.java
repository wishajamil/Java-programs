import java.util.ArrayList;
import java.util.Collections;

public class CalenderDateClient
{
   public static void main(String[] args) 
   {
      ArrayList<CalenderDate> dates = new ArrayList<CalenderDate>();
      dates.add(new CalenderDate(2010,02,15));
      dates.add(new CalenderDate(1977,10,22));
      dates.add(new CalenderDate(2010,01,22));
      dates.add(new CalenderDate(1996,04,07));
      dates.add(new CalenderDate(1999,06,01));
      
      System.out.println("Before: " + dates.toString());
    
      Collections.sort(dates);
      System.out.println("After:  " + dates.toString());

   }
}