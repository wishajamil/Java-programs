
/**
 * class IncreaseDigits - using ArrayLists
 * 
 */
import java.util.*;

public class IncreaseDigits
{
    public static void main(String[] args)
    {
        ArrayList x = new ArrayList<Integer>();    // Array filled with first 11 digits of Pi.
        ArrayList y; 
        
        double p = Math.PI;
        for(int i=0; i < 11; i++)
        {
            x.add( (int) p );
            p = p - (int)p;
            p *= 10;   
        }
        
        System.out.println("Original Array:");
        display(x);

        // Part (a)
        System.out.println("Part (a): using increaseDigits1");
        //increaseDigits1( x );
        display(x);
        increaseDigits1(x);

        // part (b)
        System.out.println("Part (b): using increaseDigits2");
        increaseDigits2(x);
        //y = increaseDigits2( x );
        //display( y );
   }
   
   private static void display( ArrayList<Integer> x )
   {
       int i;
       
       System.out.print("Array: ");
       for(i=0; i < x.size(); i++)
       {
           if( i < x.size()-1 )
                System.out.printf("%3d, ", x.get(i));
           else
                System.out.printf("%3d\n", x.get(i));
       }
       
    }
  
    // Write nextDigit method
    public static int nextDigit(int a)
    {
        if(a==9)
        a=0;
        else a++;
        return a;
    }
    
    // Write increaseDigits1 method
    public static void increaseDigits1(ArrayList<Integer> x )
    {
        for(int i=0;i<x.size();i++)
        {
            x.set(i,nextDigit(x.get(i)));

        }
        System.out.println(x);
    }
    
    // Write increaseDigits2 method
    public static void increaseDigits2(ArrayList<Integer> x )
    {
        ArrayList y=new ArrayList<Integer>(); 
        int a=0;
        for(int i=0;i<x.size();i++)
        {
            a=nextDigit(x.get(i));
            y.add(a);
        }
        System.out.println(y);
    }
    
}