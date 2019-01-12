public class ColoredCircle extends Circle implements Colored 
{
   private String color; 

   public ColoredCircle (int x, int y, int radius, String color) 
   {
      super(x,y,radius);
      this.color = color;
   }
   public String getColor()
   {
      return color;
   }
   public boolean equals(Object o)
   {
      if(o instanceof ColoredCircle)
      {
          ColoredCircle other = (ColoredCircle) o;
         return super.equals(other) && color.equals(other.color);
      } else {
         return false;
      }
   }
   public String toString()
   {
      return super.toString() + " Color:" + color;
   }
}
