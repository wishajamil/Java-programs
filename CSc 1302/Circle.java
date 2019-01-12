import java.util.*; 

public class Circle
{
   private double radius; 
   private Point center; 
   
   public Circle (Point p, double radius)
   {
      center = p;
      radius = radius; 
   }
   public void setCenter (Point c)
   {
      center = c; 
   }
   public void setRadius (double r)
   {
      radius = r;
   }
   public Point getCenter ()
   {
      return center; 
   }
   public double getRadius ()
   {
      return radius;
   }
   public double getArea ()
   {
      return Math.PI * radius * radius;
   }
   public double getCircumference ()
   {
      return 2 * Math.PI * radius;
   }
   public String toString()
   {
      return "circle [center =" + center + ", radius =" + this.radius + "]";
   }
   public boolean contains(Point p) 
   {
      if (center.distance(p) <= radius) {
         return true;
      } else { 
         return false;
      }
   }
} 
 

