/**
 *Introduction to ArrayList
 * 
 */
import java.util.*;

public class Arrays_List
{
    public static void main(String[] args)
    {
        ArrayList<Integer> x;
        x = new ArrayList<Integer>();
        
        Integer a = new Integer ( 3 );
        x.add( a );
        a= new Integer ( -2 );
        x.add( a );
        a= new Integer ( 5 );
        x.add (2, a);          //add 'a' to index 2
        a= new Integer ( 20 );    //boxing operation
        x.add (1, a); 
        //x.remove( 2 );
        
        System.out.println( x );
        
        a = new Integer( 50 );    //duplicate the Array
        x.set ( 1, a );
        
        System.out.println( x );
        
        System.out.println( x.get(3) );
        
        int d =  (x.get(3)).intValue();          //unboxing operation
        
        System.out.println( d );
        
        //autoboxing and unboxing...
        
        x.add(27);
        int e = x.get( 1 );
        System.out.printf("sum =  %d\n", sum( x ) );
        //Int size() = length 
        
        // 1) Passing arrays to methods
        
        // 2) Returning arrays from methods
        
        // 3) Pros and Cons of built-in arrays.
        
    }
    
    public static int sum(ArrayList<Integer> x)
    {
        int sum = 0;
        for ( int i = 0; i < x.size(); i++)
        {
            sum = sum + x.get(1);
        }
         return sum;
    }
    
}
//y = x.get(:)      
//y = x.set(:, 3)  //s.set)i, new Integer(3))


