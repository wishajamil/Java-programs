import java.util.*; 

public class Client
{
   public static void main(String[] args) 
   {
      ColoredCircle c1 = new ColoredCircle(4,8,12,"yellow");
      ColoredCircle c2 = new ColoredCircle(4,8,12,"yellow");
      
      System.out.println(c1.toString());
      System.out.println(c2.toString());
      if(c1.equals(c2))
         System.out.println("The two circle are equal");
      else
         System.out.println("The two circle are not equal");
   }
}