/**
 * class JoinArrays - using ArrayLists
 * 
 */

import java.util.*;

public class JoinArrays
{
   public static void main(String[] args)
   {
      ArrayList<Integer> x = new ArrayList<Integer>();
        
      ArrayList<Integer> y = new ArrayList<Integer>();
      ArrayList<Integer> z;
      int   i;
        
      for( i=5; i > 0; i--)
         x.add(i);
      for( i=8; i >=6; i--)
         y.add(i);
            
      System.out.println("Original arrays:");
      display(x);
      display(y);
   
      z = joinArrays(x, y);
        
      System.out.println("Result of join(x,y).");
      display(z);
   }
   
   private static void display( ArrayList<Integer> x )
   {
      int i;
       
      System.out.print("Array: ");
      for(i=0; i < x.size(); i++)
      {
         if( i < x.size()-1 )
            System.out.printf("%3d, ", x.get(i) );
         else
            System.out.printf("%3d\n", x.get(i) );
      }
   }
  
      // Write the joinArrays Method below
   public static ArrayList<Integer> joinArrays( ArrayList<Integer> x,ArrayList<Integer> y)
   {
      ArrayList<Integer> z=new ArrayList<Integer>();
      for(int i=0;i<x.size();i++)
      {
         z.add(x.get(i));
      }
       
      for(int i=0;i<y.size();i++)
      {
         z.add(y.get(i));
      }
      return z;
   }
}