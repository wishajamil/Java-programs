import java.util.*; 

public class Triangle  
{
   private int side1; 
   private int side2;
   private int side3;
      
   public Triangle (int side1, int side2, int side3) 
   {
      side1 = side1;
      side2 = side2;
      side3 = side3;
   }
   public int getSide1()
   {
      return side1; 
   }
   public int getSide2()
   {
      return side2;
   }
   public int getSide3()
   {
      return side3; 
   }
   public void setSide1 (int s1)
   {
      side1 = s1;
   }
   public void setSide2 (int s2)
   {
      side2 = s2;
   }
   public void setSide3 (int s3)
   {
      side3 = s3;
   }
   public String toString()
   {
      return "{side1: " + side1 + ", side2: " + side2 + ", side3: " + side3 + "}";
   }
   public boolean isEquilateral()
   {
      return ((side1 == side2) && (side1 == side3));
   }
   public boolean isIsoceles()
   {
      return (((side1 == side2) && (side1 != side3)) ||
          ((side1 == side3) && (side1 != side2)) ||
          ((side2 == side3) && (side2 != side1)));
   }
   public boolean isScalene()
   {
      return ((side1 != side2) && (side1 != side3) && (side2 != side3));
   }
}