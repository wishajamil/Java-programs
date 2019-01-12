import java.util.*; 

public class PointClient 
{
   public static void main(String[] args) 
   { 
      Point p1 = new Point (9,10);
      System.out.println("P1: " + p1.toString());
      p1.getX();
      p1.setX(-3);
      p1.setY(5);
      System.out.println("P1 new point: " + p1.toString());
         
      Point p2 = new Point (1,-2);
      System.out.println("P2: " + p2.toString());
      p2.getX();
      p2.setX(-5);
      p2.setY(-4);
      System.out.println("P2 new point: " + p2.toString());
      
      System.out.println("Is the points vertical: " + p1.isVertical(p2));
      System.out.println("New p1 is in quardrant: " + p1.quadrant());
      System.out.println("New p2 is in quardrant: " + p2.quadrant());
   
   }
}