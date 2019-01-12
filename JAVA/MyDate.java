/**
 * class MyDate
 * 
 */
public class MyDate
{
    // instance variables - replace the example below with your own
   private int m;
   private int d;
   private int y;
    
    // (1) Constructors or objects of class MyDate
    //
   public MyDate ()
   {
      this.m = 1;
      this.d = 1;
      this.y = 1600;       
   }    
   public MyDate (int m, int d, int y)
   {
      if (m > 12 || d > 31)
      {
         this.m = 1;
         this.d = 1;
         this.y = 1600;
      }
      else 
      {
         this.m = m;
         this.d = d;
         this.y = y;
      }
   }
    
    // (2) Accessor/Mutator Methods
    //
   public int getMonth()
   {
      return m;
   } 
    
   public int getDay()
   {
      return d;
   }
    
   public int getYear()
   {
      return y;
   }
    
   public void setMonth(int m)
   {
      if(m > 0 && m <= 12)
         this.m=m;   
   }
   public void setDay(int d)
   {
      if (d > 0 && d < Calendar1.dayInMonth(m,y))
      {
         this.d = d;
      }
      this.d = d;
   }
   public void setYear(int y)
   {
      this.y=y;         
   }
   public void setData (int m, int d, int y)
   {
      if (m < 0 && m <= 12)
      {
         this.setMonth(m);
         if (d <= this.daysInMonth (this.getMonth(), this.getYear() ) )
         {
            this.setDay(d);
            if ( y > 0 )
               this.setYear(y);
         }
      }
      else
      {
         this.setMonth(this.getMonth() );
         this.setDay(this.getDay() );
         this.setYear(this.getYear() );
      }
   }
       
   public static int daysInMonth( int month, int year)
   {
      int day = 0;
      
      switch ( month )
      {
         case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
            day = 31;
            break;
         case 2:
            if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
               day = 29;
               break;
            }
            else 
            {
               day = 28;
               break;
            }
      }
      return day;
   }

    // (3) Comparison operations
    //
   public boolean equals ( MyDate l)
   {
      if (this.m == l.m || this.d == l.d || this.y == l.y)
         return true;
      return false;
   }
   public int compareTo (MyDate d)
   {
      if (this.m == d.m && this.d == d.d && y == d.y)
         return 0;
      if (d.y > y || (d.y ==this.y && d.m > this.m) || (d.y == this.y && d.m == this.m && d.d > this.d))
         return -1;
      return 1;
   }
      
    // (5) Other utility methods.
    //
   public void display()
   {
      System.out.printf("%2d/%02d/%4d, ",m, d, y);
   }

   public int DOW()
   { 
      return Calendar1.dow (getMonth (), getDay (), getYear ());
   }
        
    // advances date to next day.
    //
   public void nextDay()
   {
      d++;
   }
    
    // returns number of days between to dates
    //
   public double daysBetween (MyDate d)
   {
      if (this.d > d.d)
         return (Math.abs(d.d - this.d));
      else 
         return (Math.abs(d.d - this.d));       
   }     
}