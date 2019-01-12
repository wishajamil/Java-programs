/** 
 * Class Count
 * 
 */
import java.util.*;

class Count
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      int score;
      int high = 0; 
      int mid = 0;
      int low = 0;
      int n = 1;    
      double avg = 0;
      double sum = 0;
      int i = 1;
      do
      {
         System.out.print("Enter a score ( negaive to exit ): ");
         score = console.nextInt();
         if (score < 0 || score >150) { 
            break;
         } 
         else
            if (score >= 0 && score <= 60) {
               low = low + 1;                        //i = i + 1
            } 
            else 
               if (score >= 60 && score <= 100) {
                  mid = mid + 1;
               } 
               else 
                  if (score >= 100 && score <= 150) {       
                     high = high + 1;
                  }
         sum = sum + score;
         avg = sum / i;
      
         i = i + 1;
      
      } while (score >= 0 || score <= 150);
              // display average (NOTE VARIABLE NAMES USED BELOW)
      System.out.printf("\nThere were %d HIGH scores, %d MIDDLE scores, and %d LOW scores.\n",high, mid, low);
      System.out.printf("\nThe average of the %d scores is %.1f\n",i, avg);
      System.out.println();
      
      System.out.println("HISTOGRAM:\n");
      
      System.out.print("\nlow: |"); 
      n=1;
      while (n <= low) {
         System.out.print("X");
         n +=1;
      }
      System.out.print("\nmid: |");
      n=1;
      while (n <= mid) {
         System.out.print("X");
         n +=1;
      }
      System.out.print("\nhigh: |");
      n=1;
      while (n <= high) {
         System.out.print("X");
         n +=1;
      }   
     
      // ADD CODE HERE
   }  
}


