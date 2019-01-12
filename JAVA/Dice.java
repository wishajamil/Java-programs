/**
 * Class Dice
 * 
 * @author (your name) 
 */
import java.util.*;

public class Dice
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.printf("How many times should the die will rolled? ");
        
        int N = console.nextInt();
        int[] roll = new int [6];
        for(int i = 0; i < N; i++)
        {
            int r =  (int)(6*Math.random())+1;
           
            if( r == 1 )
                roll[0] = roll[0] + 1;
            if( r == 2)
                roll[1] = roll[1] + 1;
            if( r== 3 )
                roll[2]++;
            if(r==4)
                roll[3]++;
            if(r==5)
                roll[4]++;
            if(r==6)
                roll[5]++;
            if(r==7)
                roll[6]++;
            
        }
       
        System.out.printf("There were %d of the die\n", N);
        
        for( int i=0; i < 6 ; i++)
           System.out.printf("%d's: %d\n", i+1, roll[i]);
    }
}
