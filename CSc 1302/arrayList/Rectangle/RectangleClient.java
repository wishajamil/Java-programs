import java.util.ArrayList;
import java.util.Collections;

public class RectangleClient
{
   public static void main(String[] args) 
   {
      ArrayList<Rectangle> list1 = new ArrayList<Rectangle>();
      list1.add(new Rectangle(50,2,new Point(10,2)));
      list1.add(new Rectangle(50,10,new Point(20,10)));
      list1.add(new Rectangle(40,01,new Point(20,1)));
      list1.add(new Rectangle(35,04,new Point(40,4)));
      list1.add(new Rectangle(30,06,new Point(50,6)));
      list1.add(new Rectangle(25,02,new Point(10,2)));
      list1.add(new Rectangle(20,20,new Point(70,20)));
      list1.add(new Rectangle(15,25,new Point(15,25)));
      list1.add(new Rectangle(10,35,new Point(35,35))); 
      list1.add(new Rectangle(5,40,new Point(40,40)));
      
      System.out.println("Before: ");
      for (Rectangle rectangle:list1) {
         System.out.println(rectangle);
      }
    
      System.out.println("After:  ");
      Collections.sort(list1);
      for (Rectangle rectangle:list1) {
         System.out.println(rectangle);
      }


   }
}