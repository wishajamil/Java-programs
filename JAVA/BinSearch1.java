// program: BinSearch1.java
//
import java.util.*;

class BinSearch1
{
    public static void main(String[] args)
    {
        final int size = 50;
        Scanner console = new Scanner(System.in);
        
        // declaring arrays
        int[]  item = new int[size];    // The list of numbers
        int    items=0;     // number of values in list
        int location;
        int seekValue;

        // method returns number of items entered by user.
        // user enters -1 to end entry process.
        //
        items = createInOrder( item );
         
        System.out.println("Element\t\tValue");

        // Display the current list
        //
        for( int i=0; i < items; i++ )
            System.out.println( i + "\t\t" + item[i] );
         
        System.out.print("Enter a value to seek: ");
        seekValue = console.nextInt();
        
        location = binSearch( item, items, seekValue);
         
        if( location >= 0 )
          System.out.println("Element found at location " + location);
        else
          System.out.println("Element not found in list");
    }

    
    
   
    public static int binSearch( int[] n, int items,  int seekValue )
    {           
        int start = 0; 
        int end  = items - 1;
        int answer = 0; 
        boolean run = true;
        while(run)
        { 
            int mid = (start + end) / 2;
            if(n[mid] > seekValue){end = mid - 1;}
                else if (n[mid] < seekValue){start = mid + 1;}
                else if (n[mid] == seekValue){answer = mid; run = false; break;}
            }
            return answer;
    }
    
    // method: createInOrder
    //   This method will fill in a previously created array with values
    // in increasing order. When complete the method will return the number
    // of values inserted into the list.
    //
    public static int createInOrder( int[] n )
    {
        int    i;
        int    value=0;
        int    items=0;
        Scanner console = new Scanner(System.in);
        
        while( items < n.length && value >= 0 ) 
        {
            System.out.print("Enter a positive number to insert (negative to quit): ");
            value = console.nextInt();
            if( value >= 0 )
            {
                // insert into array
                
                // step 1- locate the proper space for the item.
                i=0;
                while( i < items && n[i] < value)
                    i++;
                    
                // step 2- shift others down
                for( int j=items-1; j >=i; j--)
                    n[j+1] = n[j];
                
                // step 3- insert new item
                n[i] = value;
                items++;
                
            }
        }
        // return number of values entered
        return items;   
    }

}

