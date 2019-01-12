import java.util.*;

public class CircleClient 
{
   public static void main(String[] args) 
   {
      Circle c1 = new Circle(2,8,6);
      Circle c2 = new Circle(2,4,6);
      Circle c3 = new Circle(1,4,10);
   
      Circle [] c = new Circle[] {c1,c2,c3}; 
      System.out.println("Before sorting: " + Arrays.toString(c));
      insertionSort(c);
      System.out.println("After sorting: " + Arrays.toString(c) + "\n"); 
      
      for (int i = 1; i <= 4; i++)
      {
         SequentialIncrementer a = new SequentialIncrementer();
         System.out.println("Before sequential incrementation: " + a.getValue());
         a.increment();
         System.out.println("After sequential incrementation: " + a.getValue()+ "\n");
      }
      for (int i = 1; i <= 4; i++)
      {      
         RandomIncrementer b = new RandomIncrementer();
         System.out.println("Before Random incrementation: " + b.getValue());
         b.increment();
         System.out.println("After Random incrementation: " + b.getValue()+ "\n");
      }
   }
   public static void insertionSort(Circle[] c)
   {
      for (int i =1; i < c.length; i++)
      {
         Circle temp = c[i];
         int j = i-1;
         while(j >= 0 && c[j].compareTo (temp)>0) 
         {
            c[j+1] = c[j];
            j = j-1;
         }
         c[j+1] = temp;
      }
   }
}