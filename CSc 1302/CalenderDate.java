public class CalenderDate implements Comparable<CalenderDate>
{
   private int year;
   private int month;
   private int day;
   
   public CalenderDate (int year, int month, int day) 
   {
      this.year = year;
      this.month = month;
      this.day = day;
   }
   public int getYear()
   {
      return this.year;
   }
   public int getMonth()
   {
      return this.month;
   }
   public int getDay()
   {
      return this.day;
   }
   public void setYear (int year)
   {
      this.year = year;
   }
   public void setMonth (int month)
   {
      this.month = month;
   }
   public void setDay (int day)
   {
      this.day = day;
   }
   public String toString()
   {
      return month + "/" + day + "/" + year;
   }
   public int compareTo(CalenderDate date) 
   {
      if (year == date.year && month == date.month && day == date.day) {
         return 0;
      } 
      else if (year == date.year && month == date.month && day > date.day) {
         return 1;
      } 
      else if (year == date.year && month > date.month) {
         return 1;
      } 
      else if (year > date.year) {
         return 1;
      } 
      else {
         return -1;
      }
   }
}