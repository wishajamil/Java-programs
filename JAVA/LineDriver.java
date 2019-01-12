// Class LineDriver


public class LineDriver
{
    public static void main(String[] args)
    {
        // This main class to test and demonstrate the functionality
        // of the Line class.
        // 
        Line l = new Line( 1.0/2, -2);  // y = 1/2*x-2
        Line m = new Line( 2, 1);       // y = 2*x + 1
        Line n = new Line( 2, 4);       // y = 2*x + 4
        Line k = new Line( 2, 1);       // y = 2*x + 1
        Point p;
        
        System.out.println("Display line information:");
        System.out.printf(" Line l: y = %.2f * x + %.2f\n", 
          l.getSlope(), l.getB() );
        System.out.printf(" Line m: y = %.2f * x + %.2f\n", 
          m.getSlope(), m.getB() );
        System.out.printf(" Line n: y = %.2f * x + %.2f\n", 
          n.getSlope(), n.getB() );
        System.out.printf(" Line k: y = %.2f * x + %.2f\n", 
          k.getSlope(), k.getB() );
        
        System.out.println("\nWhat happens when you print a Line?");
        System.out.println(" l = " + l );
        System.out.println(" m = " + m );
        
        System.out.println("\nSee if a point is on a line n:");
        if( n.onLine( 2, 1 ) )
            System.out.println(" (2, 1) is on line n.");
        else
            System.out.println(" (2, 1) is not on line n.");
            
        if( n.onLine( -1, 2 ) )
            System.out.println(" (-1, 2) is on line n.");
        else
            System.out.println(" (-1, 2) is not on line n.");
        
        p = new Point( 0, 4);
        if( n.onLine( p ) )
            System.out.println(" (0, 4) is on line n.");
        else
            System.out.println(" (0, 4) is not on line n.");
        
        System.out.println("\nTest lines for equality:");
        if( m == k )
            System.out.println(" m == k");
        else
            System.out.println(" m != k");
            
        if( m.equals( k ) )
            System.out.println(" m.equals(k) is true.");
        else
            System.out.println(" m.equals(k) is false.");
            
        System.out.println("\nTest lines for intersections:");
        if( l.intersects( m ) )
            System.out.println(" Lines l and m intersect.");
        else
            System.out.println(" Lines l and m DO NOT intersect.");
            
        if( m.intersects( n ) )
            System.out.println(" Lines m and n intersect.");
        else
            System.out.println(" Lines m and n DO NOT intersect.");
        
        System.out.println("\nFind intersections:");
        p = l.findIntersection( m );
        System.out.printf(" Line l and line m intersect at (%.2f, %.2f).\n",
          p.getX(), p.getY() );
          
        p = l.findIntersection( n );
        System.out.printf(" Line l and line n intersect at (%.2f, %.2f).\n",
          p.getX(), p.getY() );
        
        p = m.findIntersection( n );
        if( p == null)
            System.out.println(" Lines m and n do not intersect!");
        else
            System.out.printf(" Line m and line n intersect at (%.2f, %.2f).\n",
                p.getX(), p.getY() );
        
    }
}
