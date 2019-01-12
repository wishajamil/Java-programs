import java.util.*;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] x = {1, 3, -2, 10, 5, 4, 7, 9 };
        
        //sort the list
        selectionSort(x);
        
        //display the list
        printList(x);
    }
    
    // ADD SELECTION SORT METHOD HERE
    public static void selectionSort( int[] x )
    {
        for( int j = 0; j < x.length; j++)
        {
            int min = x[j];
            int minIndex = j;
            
            for( int i = j+1; i < x.length; i++)
            {
                if( x[i] < min )
                {
                    min = x[i];
                    minIndex = i;
                }
            }
            //swap x[j] with the x[minIndex]
            int temp = x[j];
            x[j] = x[minIndex];
            x[minIndex] = temp;
        }
    }

    
    // Method to print an array.
    public static void printList( int[] x)
    {
        //display the list
        for(int i = 0; i < x.length; i++)
            System.out.printf( "%3d ", x[i]);
        System.out.println();
    }
    
}

