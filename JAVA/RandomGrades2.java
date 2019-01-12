/**
 * RandomGrades - using BUILT-IN arrays
 * 
 */

import java.util.*;

public class RandomGrades2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int     numGrades;
        int[]   grade;  
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        System.out.printf("How many grades would you like? ");
        numGrades = console.nextInt();
        
        System.out.printf("PART (A): Construct a random array.\n");
        
        for( int i = 0; i < numGrades; i++ )
        {
            int r = (int)(101 * Math.random() );
            /**
            Integer s = new Integer( r );
            x.add(i, a)
            */
            x.add( r );
        }
        
        printGrades( x );
        
        System.out.printf("PART (B): Reverse the array.\n");
        
        reverse(x);
        printGrades( x );
        
        System.out.printf("PART (C): Display SUM, AVG, MIN, and MAX.\n");

        //Complete part (C) here
       
    }
    
    public static void printGrades( ArrayList<Integer> x ) 
    {
        System.out.printf("Grade: ");
        for (int i = 0; i < x.size(); i++)
        {
            if ( i == x.size()-1 )
                System.out.printf("%d\n", x.get(i).intValue() );
            else 
                System.out.printf("%d,", x.get(i) );
        }
    }
    
     public static void reverse (ArrayList<Integer> grade)
    {
        ArrayList<Integer> y = new ArrayList<Integer>( );  //telling java to reserve enough space to for me to do certain thing
        int z = 0;
        for( int i = grade.size()-1; i >= 0; i-- )
        {
            y.add( z, grade.get(i) );       // y[z] = grade[i];
            z++;
        }
        
        for (int i = 0; i < grade.size(); i++ )  //copy them back to reverse order
        {
            grade.set(i, y.get(i) );  //grade[i] = y[i];
        }
    }  
    
}




