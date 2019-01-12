import java.util.Random;

public class RandomIncrementer implements incrementable 
{
   Random rand = new Random();   
   int val = rand.nextInt(10);
   int inc = rand.nextInt(100);
   public void increment()
   {
      val = val + inc;
   }
   public int getValue() 
   {
      return val;
   }
}