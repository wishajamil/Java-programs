public class Circle {
   private int x;
   private int y; 
   private int radius; 
   
   public Circle()
   {
      this(0,0,0);
   }
   public Circle(int x, int y, int radius)
   {
      this.x = x;
      this.y = y;
      this.radius = radius; 
   }
   public int getX()
   {
      return x;
   }
   public int getY()
   {
      return y;
   }
   public int getRadius()
   {
      return radius;
   }
   public String toString()
   {
      return "Center: (" + x + "," + y + ") Radius: " + radius;
   }
   public int compareTo(Circle other)
   {
      if (radius < other.radius) { 
         return -1;
      } else if (radius > other.radius){
         return 1;
      } else if (x != other.x) {
         return x - other.x; 
      } else {
         return y - other.y; 
      }
   }
}