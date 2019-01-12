import java.util.*; 

public class TriangleClient 
{
   public static void main(String[] args) 
   {  
      Scanner console = new Scanner(System.in);
        
      System.out.print("three triangle side (seperate with space): ");
      int side1 = console.nextInt();
      int side2 = console.nextInt();
      int side3 = console.nextInt();
      
      Triangle sides = new Triangle (side1, side2, side3);
      
      sides.getSide1();
      sides.getSide2();
      sides.getSide3();
      
      sides.setSide1(side1);
      sides.setSide2(side2);
      sides.setSide3(side3);
   
      System.out.println("triangle: " + sides.toString());
      if(sides.isEquilateral())
         System.out.println("It is an equilateral triangle");
      else if (sides.isIsoceles())
         System.out.println("It is an isoceles triangle");
      else
         System.out.println("It is a scalene triangle");   
   }
}