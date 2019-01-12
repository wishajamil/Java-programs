/**
 * Class PostfixEvaluate
 * 
 */
import java.util.*;

public class PostfixEvaluate
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      StringStack s = new StringStack();
        
      String expr;
      String item = " "; 
      int    sp = 0; 
      double y;
        
      System.out.printf("Enter a space-separated postfix expression: ");
      expr = console.nextLine();
        
        // ADD A CODE SEGMENT
      for (int i = 0; i < expr.length(); i++)
      {
         if (expr.substring(i, i+1).equals(" ")) {
            if(!item.equals("")) {
               s.push(item);
               item = "";
            }
         }
         else if (expr.substring(i, i+1).equals("+")) {
            double a = Double.parseDouble( s.pop() );
            double b = Double.parseDouble( s.pop() );
            y = b + a;
            s.push(" " + y);
         }
         else if (expr.substring(i, i+1).equals("-")) {
            double a = Double.parseDouble( s.pop() );
            double b = Double.parseDouble( s.pop() );
            y = b - a;
            s.push(" " + y);
         }
         else if (expr.substring(i, i+1).equals("*")) {
            double a = Double.parseDouble( s.pop() );
            double b = Double.parseDouble( s.pop() );
            y = a * b;
            s.push(" " + y);
         }
         else if (expr.substring(i, i+1).equals("/")) {
            double a = Double.parseDouble( s.pop() );
            double b = Double.parseDouble( s.pop() );
            y = b / a;
            s.push(" " + y);
         }
         else {
            item = item + expr.substring(i, i+1);
         }
      }
      
      System.out.printf("The result of the evaluation is %f\n", Double.parseDouble( s.pop() ) );
            
   }
}