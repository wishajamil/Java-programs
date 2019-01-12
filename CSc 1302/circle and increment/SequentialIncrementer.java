public class SequentialIncrementer implements incrementable 
{
   static int val = 0;
   public void increment()
   {
      val++;
   }
   public int getValue() 
   {
      return val;
   }
}