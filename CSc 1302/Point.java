import java.util.*; 

public class Point 
{
   private int x; 
   private int y;
   
   public Point (int initialX, int initialY) 
   {
      x = initialX;
      y = initialY;
   }
   public int getX ()
   {
      return x; 
   }
   public int getY ()
   {
      return y;
   }
   public void setX (int point1)
   {
      x = point1;
   }
   public void setY (int point2)
   {
      y = point2;
   }
   public String toString()
   {
      return "(" + x + "," + y + ")";
   }
   public boolean isVertical(Point other)
   {
      return this.x == other.x;
   }
   public int quadrant() 
   {
      if(this.x > 0 && this.y > 0) {
         return 1;
      } else if(this.x < 0 && this.y > 0) {
         return 2;
      } else if(this.x < 0 && this.y < 0) {
         return 3;
      } else if(this.x > 0 && this.y < 0) {
         return 4;
      } else {
         return 0;
      }
   } 
   public double distance(Point p2) 
   {
      int dx = x - p2.x;
      int dy = y - p2.y;
      return Math.sqrt(dx * dx + dy * dy);
  }  
}  
