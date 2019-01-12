import java.util.*;

class Amusement
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
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
        int dayNumber;
        
        int ADULTStickets;
        int CHILDtickets;
        double PRECost;          //pre-tax cost
        double TOTALcost;        //total cost
      
        // Ask user for input values
        System.out.print("Enter the date you are planning to visit the park.\n");
        System.out.print("what is the month(1-12): ");
        month = console.nextInt();
        System.out.print("what is the day: ");
        day = console.nextInt();
        System.out.print("what is the year (4 digits): ");
        year = console.nextInt();
        System.out.print("how many ADULTS tickets are you purchasing? ");
        ADULTStickets = console.nextInt();
        System.out.print("how many CHILD tickets are you purchasing? ");
        CHILDtickets = console.nextInt();

        y = year;
        wy = (3 + y + (y/4) - (y/100) + y/400) % 7; 
        m = (month + 9) % 12;
        wm = (int)(2.6*m + 0.50)% 7;
        wd = (day-1);
        w = (wy + wm + wd)% 7;
        
        //price/tickets info
        if ( w == 2) {
        PRECost = (ADULTStickets*10.95+CHILDtickets*6.95);
         } else 
        if (w == 0 || w == 6) {
        PRECost = (ADULTStickets*25.95+CHILDtickets*15.95);
         } else 
        PRECost = (ADULTStickets*15.95+CHILDtickets*8.95);
        
        TOTALcost = PRECost*1.07;
        
        if ( w == 0) {
            System.out.printf("You will be visiting the park on SUNDAY /n");
         } else  
        if ( w == 1) {
            System.out.printf("You will be visiting the park on MONDAY \n");
         } else
        if ( w == 2) {
            System.out.printf("You will be visiting the park on TUESDAY \n");
         } else 
        if ( w == 3) {
            System.out.printf("You will be visiting the park on WEDNESDAY \n");
         } else  
        if ( w == 4) {
            System.out.printf("You will be visiting the park on THURSDAY \n");
         } else
        if ( w == 5) {
            System.out.printf("You will be visiting the park on FRIDAY \n");
         } else {
            System.out.printf("You will be visiting the park on SATURDAY \n");
         }
 
        System.out.printf("The pre-tax cost of %d adult and %d child tickets is $%.02f \n", ADULTStickets, CHILDtickets, PRECost ); 
        System.out.printf("TOTAL COST (including tax) = %.02f ",TOTALcost);
        
        
    }
}


