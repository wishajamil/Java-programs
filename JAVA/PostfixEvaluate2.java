/**
 * Class PostfixEvaluate2
 * 
 */
import java.util.*;

public class PostfixEvaluate2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        StringStack s = new StringStack();
        
        String expr;
        String item; 
        int    sp = 0; 
        double y;
        
        System.out.printf("Enter a space-separated postfix expression: ");
        expr = console.nextLine();
        
        // ADD A CODE SEGMENT
        while (sp < expr.length()) 
        {
            item = expr.substring(sp, sp+1);
            
            switch (item) {
                  case "+": y = Double.parseDouble( s.pop() );
                            y = Double.parseDouble( s.pop() ) + y;
                            s.push(" " + y);
                            break; 
                  case "-": y = Double.parseDouble( s.pop() );
                            y = Double.parseDouble( s.pop() ) - y;
                            s.push(" " + y);
                            break;
                  case "*": y = Double.parseDouble( s.pop() );
                            y = Double.parseDouble( s.pop() ) * y;
                            s.push(" " + y);
                            break;
                  case "/": y = Double.parseDouble( s.pop() );
                            y = Double.parseDouble( s.pop() ) / y;
                            s.push(" " + y);
                            break;
                  case "0": s.push(item);
                            break;
                  case "1": s.push(item);
                            break;
                  case "2": s.push(item);
                            break;
                  case "3": s.push(item);
                            break;
                  case "4": s.push(item);
                            break;
                  case "5": s.push(item);
                            break;
                  case "6": s.push(item);
                            break;
                  case "7": s.push(item);
                            break;
                  case "8": s.push(item);
                            break;
                  case "9": s.push(item);
                            break;
                  }
            sp++;
        }
        
        // Display the result
        //
        System.out.printf("The result of the evaluation is %f\n", Double.parseDouble( s.pop() ) );
        
    }
}