/**
 * Class PointDriver
 */
import java.util.*;


public class PointDriver
{
 public static void main(String[] args)
    {
        // (1) Variables that can refer to a point.
        Point p;
        Point q, r;
        
        // (2) Create three points and let p, q, and r refer to them.
        p = new Point( 1, 2);
        q = new Point( 3, 4);
        r = new Point( 1, 2);
        
        // (3) access instance data for p and q.
        // TRY: System.out.printf("p's y-coordinate is %.2f\n", p.y);
        
        // (4) try the classes instance methods!
        //
        System.out.printf("Point p has coordinate (%.2f, %.2f) and is %.2f units from the origin.\n",
            p.getX(), p.getY(), p.distance() );
        System.out.printf("Point p has coordinate (%.2f, %.2f) and is %.2f units from the origin.\n",
            q.getX(), q.getY(), q.distance() );
        System.out.printf("Point r has coordinate (%.2f, %.2f) and is %.2f units from the origin.\n",
            r.getX(), r.getY(), r.distance() );
        
        // (5) Print the points.  What does this do?
        //
        System.out.println("\nSee what happens when you print a Point:");
        System.out.println(" p = " + p);
        System.out.println(" q = " + q);
        System.out.println(" r = " + r);
        
        // (6) compare the points
        //
        System.out.println("\nComparing points with == ");
        if( p == q )                                // Do you understand this
            System.out.println(" p == q");
        else
            System.out.println(" p != q");
            
        if( p == r )                                // Explain the output!
            System.out.println(" p == r");
        else
            System.out.println(" p != r   DOES THIS SURPRISE YOU?");
            
        System.out.println("\nComparing points with equals method:");
        if( p.equals( q ) == true)
            System.out.println(" Points p and q are the same coordinate same.");
            
        if( !p.equals( q ) )                       // What does the unary operator ! do ?
            System.out.println(" Points p and q are not the same coordinate.");
            
        if( p.equals( r ) )
            System.out.println(" Points p and r are the same coordinate same.");
            
        if( p.equals( r ) == false )              
            System.out.println(" Points p and r are not the same coordinate.");
        
        System.out.println("\nDemonstrate the compareTo method:");
        if( p.compareTo( q ) > 0 )
            System.out.println(" Point p is further than q from the origin.");
        else if( p.compareTo( q ) < 0 )
            System.out.println(" Point q is further than p from the origin.");
        else
            System.out.println(" Points p and q are the same distance from the origin.");
            
        if( p.compareTo( r ) > 0 )
            System.out.println(" Point p is further than r from the origin.");
        else if( p.compareTo( r ) < 0 )
            System.out.println(" Point r is further than p from the origin.");
        else
            System.out.println(" Points p and r are the same distance from the origin.");
    
        System.out.println("\nDemonstrate the distance( q ) method:");
        System.out.printf(" The distance from p(%.2f,%.2f) to (%.2f, %.2f) is %.2f units.\n",
            p.getX(), p.getY(), q.getX(), q.getY(), p.distance(q) );
            
        // change p's x-coordinate    
        p.setX(-10);
    }	
}