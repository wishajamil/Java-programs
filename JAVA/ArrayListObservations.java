/**
 * Class ArrayListObservations
 * 
 */

import java.util.*;

public class ArrayListObservations
{
    public static void main(String[] args)
    {
        // We will work with the following objects.
        
        int     a    = 5;
        Integer b    = new Integer( 2 );
        Double  pi   = new Double( 3.1415926 );
        String  name = "Duluth High";
                
        // (1) Creates and ArrayList of Objects so that when items are added
        //     to the ArrayList they lose their identity as Java now thinks
        //     every item in the ArrayList is an Object.
        
        ArrayList x = new ArrayList();
        
        // a) We can add all these items to the ArrayList x. Lets add the String.
        x.add( name );
        // b) Now try to extract it from the ArrayList and print its length()
        //    ( Strings have a length() method! )
        // System.out.println( x.get(0).length() );   // Fails - String lost identity
        // 
        // c) We can give the reference its propery identity using a cast.
        System.out.println( ( (String)x.get(0) ).length() );   // Works! using cast.
        
        // d) Why permit ArrayList to work this way? This permits arrays of mixed types!
        x.clear();
        x.add( a );
        x.add( b );
        x.add( pi );
        x.add( name );
        
        // If you have such a list, how can you determine what type of object
        // you have accessed? using the instanceof operator
        for( int i=0; i< x.size(); i++)
        {
            Object z;
            z = x.get(i);
            if( z instanceof Integer )
                System.out.printf("Item is Integer: %d\n", ( (Integer)z ).intValue() );
            else if( z instanceof Double)
                System.out.printf("Item is Double:  %f\n", ( (Double)z ).doubleValue() );
            else if( z instanceof String)
                System.out.printf("Item is String:  %s\n", (String)z );
            else
                System.out.printf("I don't know what this is!\n");
        }
        
        /* (2) ArrayLists of Generic Type
         *       when you remove things from this ArrayList, Java knows
         *       their type and the cast is unnecessary.
         */
        ArrayList<String> y = new ArrayList<String>();
        y.add( "Cat" ); y.add("Dog"); y.add( "Mouse" ); y.add("Yak");
        
        for( int i=0 ; i < x.size() ; i++)
        {
            System.out.printf("%s ", x.get(i) );
        }
        System.out.println();
        
        /* (3) Beware of changing ArrayList length in a loop
         */
        for( int i=0 ; i < y.size() ; i++)
        {
            name = y.remove(i);
            System.out.printf("%s ", name );
        }
        System.out.println();
        
        /* (4) You can't set past the length of an arrayList 
         */
        System.out.println( y );
        //y.set(2, "More Cats");
        
        /* (5) You can add one element beyond the current length only
         */
        
        y.add( y.size(), "More Dogs");
        y.add( y.size()+1, "More Yaks");
    }
}

