/**
 * RandomGrades - using BUILT-IN arrays
 * 
 */
import java.util.*;

public class RandomGrades
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int     numGrade;
        int[]   grade;  //it makes a object that can hold ARRAY. No array EXIST right now
        
        System.out.printf("How many grades would you like? ");
        numGrade = console.nextInt();
        
        grade =  new int[ numGrade ]; //return the address of the array
        // now it assigns the items in the array list 
        
        printGrades( grade );
        
        System.out.printf("PART (A): Construct a random array.\n");
        
        // Complete part (A) here
        for( int i = 0; i < grade.length; i++ )
        {
        grade[i] = (int)(101 * Math.random());
        }
        
        printGrades( grade );
        
        System.out.printf("PART (B): Reverse the array.\n");
        
        // Complete part (B) here (you must call the method you wrote here)
        reverse( grade );
        printGrades( grade );
        
        System.out.printf("PART (C): Display SUM, AVG, MIN, and MAX.\n");

        // Complete part (C) here
        System.out.printf("Sum = %d\n", sum( grade ) );
        System.out.printf("Average = %d\n", average( grade ) );
        System.out.printf("Max = %d\n", max( grade ) );
        System.out.printf("Min = %d\n", min( grade ) );
    }
    
    
    public static int sum(int [] x )
    {
        int sum = 0;
        for (int i = 0; i< x.length; i++)
        {
            sum = sum + x[i];
        }
        
        return sum;
    }
    
    public static int max ( int[] x )
    {
        int max1 = x[0];
        for (int i = 0; i< x.length; i++)
        {
            if (x[i] > max1 )
                max1 = x[i];
             
        }
        return max1;
    } 
    
    public static int min ( int[] x )
    {
        int min1 = x[0];
        for (int i = 0; i< x.length; i++)
        {
            if (x[i] < min1 )
                min1 = x[i];
             
        }
        return min1;
    }
    
    public static double average (int [] x)
    {
        return (double)sum (x)/x.length;
    }
    
    public static void reverse (int[] grade)
    {
        int[] y = new int[ grade.length ];     //print the image of indicated # of ZEROs
        int z = 0;
        for( int i = grade.length-1; i >= 0; i-- )
        {
            y[z] = grade[i];
            z++;
        }
        
        for (int i = 0; i < grade.length; i++ )  //copy them back to reverse order
        {
            grade[i] = y[i];
        }
                      //OR
        /*grade = y ;          //this didn'e move any elements 
        printGrades( grade );
         */
    }  
    
    public static void printGrades( int[] x ) //this print indicated # of ZEROs(makes a array)
    {
        System.out.printf("Grade: ");
        for (int i = 0; i < x.length; i++)
        {
            if ( i == x.length-1 )
                System.out.printf("%d\n", x[i] );
            else 
                System.out.printf("%d,", x[i] );
        }
    }
    
    // Add requested methods here
    
}

