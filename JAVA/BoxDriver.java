/**
 * Class BoxDriver - Demonstrate use of Box class
 * 
 */
import java.util.*;


public class BoxDriver
{
    public static void main(String[] args)
    {
       Scanner console = new Scanner(System.in);
       //scanner is a class
       //console is a name of the varible that gonna hold the address of a scanner object
       //new scanner tells it to go make a box and give me the address
       
       Box b;              // b is a variable that can hold a REFERENCE
                           // to a box
                           // what goes in b is a ADDRESS for the box (e.g tell me where is the box)
                            
       int a;              // a IS a variable that is an integer.
      
       b = new Box();      // creates a Box and places the reference in b;
       System.out.println( b );    // display the address (reference) for box
       
       b.setL(-5);            // set box b's length and width (e.g. this belongs to the box)
       b.setW(7); 
       
       System.out.printf(" box b's width is %f\n", b.getW() );
       
       Box c = new Box(8.0, 10.0);
       System.out.printf("box c's area is %f\n", c.getArea() );
       
       Box d;             // d and c will refers to the same box.
       d = c;
       
       Box e = new Box( 8.0, 10.0);
       
       if (e == c)
       System.out.println("Box b and c ARE equal."); 
       else 
       System.out.println("Box b and c ARE NOT equal.");
       
       if ( e.equals( c ) )
       System.out.println("Box b and c ARE equal."); 
       else 
       System.out.println("Box b and c ARE NOT equal.");
       
       System.out.println( c.compareTo(b) );
    }
}
//recipe 




