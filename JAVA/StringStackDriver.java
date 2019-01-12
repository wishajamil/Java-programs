/**
 *   Class StringStackDriver
 *     Demonstrate the use of all StringStack methods
 */

import java.util.*;

public class StringStackDriver
{
    public static void main(String[] args)
    {
        BuiltInArrayStack s = new BuiltInArrayStack();      // Create an empty Stack
        
        // Verify the stack is empty (using depth method)
        if( s.depth() == 0 )
            System.out.printf("The Stack is EMPTY. depth = 0.\n");
        else
            System.out.printf("The Stack is NOT EMPTY. depth = %d.\n", s.depth() );
            
        // Verify the stack is empty (using pop() method)
        String top;
        top = s.pop();
        if( top == null )
            System.out.printf("The Stack is EMPTY. top = null.\n");
        else
            System.out.printf("The Stack is NOT EMPTY. top = %s.\n", top );
            
        s.push("Donuts");
        s.push("Stack");
        s.push("Computer Science");
        s.push("Wildcat");
        s.push("Duluth");
      
        System.out.printf("Stack depth is presently %d. top item is \"%s\".\n",
          s.depth(), s.peek() );
        s.pop();        // pop the top element and throw away.
        top = s.pop();  // get the second element from stack and remove
        System.out.printf("The second element is \"%s\".\n", top );
        System.out.printf("Now the top element is \"%s\".\n", s.peek() );
      
        while( s.depth() > 0 )
        {
          top = s.pop();
          System.out.printf("popped: %s\n", top );
        }
        
    }
}

