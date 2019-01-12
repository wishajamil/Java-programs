/* DayOfWeek - Calculate the day of the week for a given
 *             month/day/year.
 * input:  month, day and year
 * output: a number indicating the day of the week. Specifically,
 *         Sunday   = 0, Monday = 1, Tuesday = 2, Wednesday= 3, 
 *         Thursday = 4, Friday = 5, and Saturday = 6.
/* DayOfWeek - Calculate the day of the week for a given
 *             month/day/year.
 * input:  month, day and year
 * output: a number indicating the day of the week. Specifically,
 *         Sunday   = 0, Monday = 1, Tuesday = 2, Wednesday= 3, 
 *         Thursday = 4, Friday = 5, and Saturday = 6.
 *             
 */
import java.util.*;

class DayOfWeek
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
       
        // Complete this program
        // Variable declarations
        int month;
        int day;
        int year; 
        int y;
        int wy;
        int m;
        double wm;
        int wd;
        double w;
        
        // Ask user for input values
        System.out.print("what is the month(1-12): ");
        month = console.nextInt();
        System.out.print("what is the day: ");
        day = console.nextInt();
        System.out.print("what is the year (4 digits): ");
        year = console.nextInt();
        
        y = year;
        wy = (3 + y + (y/4) - (y/100) + y/400) % 7; 
        m = (month + 9) % 12;
        wm = (int)(2.6*m + 0.50)% 7;
        wd = (day-1);
        w = (wy + wm + wd)% 7;
        
        // Output day of the week
        System.out.printf("Day number is %.0f \n", w);
    }
}


