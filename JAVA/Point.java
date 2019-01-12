/**
 * class Point Solution.
 * 
 */


public class Point
{
    //instance variable
    public double x;
    public double y;
    public double p;
    public double q;
    public double r;
    
    public void setX(double x)
    {
         this.x=x;         
    }

    public void setY(double y)
    {
         this.y=y;
    }

    public Point (double x, double y) 
    {
         this.setX(x);
         this.setY(y);
    }

    public double getX()
    {
         return x;
    }

    public double getY()
    {
         return y;
    }

    public double distance()  
    {
         return Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));
    }

    public double distance (Point q)   
    {
         return Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));
    }

    public boolean equals(Point q)    
    {
         if(this.getX()==q.getX() && this.getY()==q.getY ())
            return true;
         return false;
    }

    public int compareTo (Point p)   
    {
         if(this.getX()==p.getX()&&this.getY()==p.getY () )
            return 1;
         return -1;
    }
}