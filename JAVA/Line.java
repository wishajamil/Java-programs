/**
 * class Line Solution
 * 
 */


public class Line
{
   //instance variable
    private double b;
    private double m;
    
    public Line (double m, double b)
    {
         this.m = m;
         this.b = b;
    }
    
    public Line (Point p, Point q)
    {
         m=(q.getX()-p.getX()/q.getY()-p.getY());
         b=(p.getY()-b*p.getX());
    }
    
    public double getSlope()
    {
         return m;
    }
    
    public void setSlope(double m)
    {
         this.m = m;
    }

    public double getB()
    {
         return b;
    }

    public void setB(double b)
    {
         this.b=b;         
    }
    
    public boolean equals(Line l)
    {
         if (this.getSlope() == l.getSlope() && this.getB() == l.getB() )
             return true;
         return false;
    }

    public boolean onLine (double x, double y)
    {
         if (y == x * getSlope() + getB() )
            return true;
         return false;
    }
         
     public boolean onLine(Point p)
    {
        if(p.getY()==this.getSlope()*p.getX()+this.getB())
            return true;
        return false;
    }
    
    public boolean intersects ( Line L)
    {
         if (this.getSlope()!= L.getSlope() )
            return true;
         return false;
    }
    
    public Point findIntersection(Line n)
    {
         if (this.intersects(n)==false)
            return null;
         double x = (n.getB() - this.getB() ) / (this.getSlope() - n.getSlope() );
         double y = this.getSlope() * x+this.getB();
         return new Point(x,y);
    }   
}
