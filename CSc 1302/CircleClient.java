import java.util.*; 

public class CircleClient 
{
   public static void main(String[] args) 
   {
      Point p1 = new Point (10,5);
      Circle c1 = new Circle (p1, 7);
      c1.getRadius();
      c1.setRadius(7);
      System.out.println(c1.toString());
      
      System.out.println("Circumference: " + c1.getCircumference());
      System.out.println("Area: " + c1.getArea());
      
      Point p2 = new Point (5,7);
      if( c1.contains(p2)) {
         System.out.println("(5,7) lies within the circle"); 
      } else {
         System.out.println("(5,7) does not lie within the circle");   
      }
   }
}
      
