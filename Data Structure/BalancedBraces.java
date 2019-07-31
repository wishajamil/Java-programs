import java.util.Stack;

public class BalancedBraces {
   public static void main (String[] args)
   {
      String str = "{}{{{{}}";
      boolean ans = isbalanced(str);
      System.out.println("Answer "+ ans); // Should be False
   
   }
   public static boolean isbalanced(String str){
      Stack<Character> stack = new Stack<Character>();
      for(int i = 0; i < str.length(); i++)
      {
         if(str.charAt(i) == '{')
            stack.push(str.charAt(i));
         if(str.charAt(i) == '}'){
            if(stack.isEmpty())
               return false;
            else
               stack.pop();
         }
      }
      if(stack.isEmpty())
         return true;
      else
         return false;
   }
}
