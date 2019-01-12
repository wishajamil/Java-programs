import java.util.*;

/**
 * Telephone.java
 * 
 */
public class Telephone
{
    public static void main(String[] args)
    {
       Scanner console = new Scanner(System.in);
       int sTime; 
       int eTime;
       int initialHours; 
       int endHours;
       int MinDif; //minute difference
       double cost;
       int initialMins;
       int endMins;
       double fcost;  //cost including 50 % discount 
       double ecost;  //cost includind 15% discount
       double taxcost;//cost including tax and discount
        
       //Ask User
       System.out.print("\nEnter the time the call begins in 24 hour format: ");
       sTime=console.nextInt();
       System.out.print("Enter the time the call ends in 24 hour format  : ");
       eTime=console.nextInt();
       System.out.print("Call summary : \n");
       
       //Computation
       initialHours=sTime/100;
       initialMins=(initialHours*60)+(sTime%100);
       endHours=eTime/100;
       endMins=(endHours*60)+(eTime%100);
       if(sTime>=0000 && sTime<=2400)
             {
          if(initialMins > endMins) {
              MinDif=(1440-initialMins)+endMins;
          }
          else
          MinDif=endMins-initialMins;
          System.out.printf("Started at %d for %d minutes\n",sTime,MinDif);
          cost=MinDif*0.40;
          System.out.printf("The gross cost of call is $ %.2f\n",cost);
          
          if(sTime>=1800 && sTime <=2400  || sTime>2400 &&  sTime <=800)
          {
            fcost=cost-(cost/2);
            if(MinDif>60){
                  ecost=fcost-(0.15*fcost);
                  taxcost=ecost+(ecost*0.04);
                  System.out.printf("The net cost of call is $ %.2f\n",taxcost);
              }
            else {
                taxcost=fcost+(fcost*0.04);
                System.out.printf("The net cost of call is $ %.2f\n",taxcost);
             }
          }
          else if(sTime>800 && sTime <1800 && MinDif>60){
          ecost=cost-(0.15*cost);     
          taxcost=ecost+(0.04*ecost);
          System.out.printf("The net cost of call is $ %.2f\n",taxcost);
          }
       }
           else {
               System.out.print("Invalid time");
           } 
    }
}
