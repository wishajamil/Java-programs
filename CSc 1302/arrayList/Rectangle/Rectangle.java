public class Rectangle implements Comparable<Rectangle>{

   private int width;
   private int height;
   private Point topCorner;

   public Rectangle(int width, int height, Point topCorner){
   
      this.width=width;
      this.height=height;
      this.topCorner=topCorner;
   }
   public int getWidth(){
      return width;
   }
   public void setWidth(int width){
      this.width=width;
   }
   public int getHeight(){
      return height;
   }
   public void setHeight(int height){
      this.height=height;
   }
   public Point getTopCorner(){
      return topCorner;
   }
   public void setTopCorner(Point topCorner){
      this.topCorner=topCorner;
   }
   public String toString() {
      return "Width: " +width+" "+"Height: "+height+" "+topCorner;
   }
   public int compareTo(Rectangle date) 
   {
      if (width == date.width && height == date.height && topCorner.compareTo(date.topCorner) == topCorner.compareTo(date.topCorner)) {
         return 0;
      } 
      else if (width == date.width && height == date.height && topCorner.compareTo(date.topCorner) > date.topCorner.compareTo(date.topCorner)) {
         return 1;
      } 
      else if (width == date.width && height > date.height) {
         return 1;
      } 
      else if (width > date.width) {
         return 1;
      } 
      else {
         return -1;
      }
   }
}

