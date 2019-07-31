//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Project description: Write a function called backspaceCompare that takes two strings s1 and s2 and evaluate   //
//                     them when both are typed into empty text editors. backspaceCompare should return true if // 
//                     the evaluated strings are equal or false if they are not equal.                          //
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Stack;

public class CompareBackspace{
   public static void main (String[] args)
   {
      String s1 = "DataStructuresIssss###Fun";
      String s2 = "DataStructuresIszwp###Fun";
      boolean ans = backspaceCompare(s1,s2);
      System.out.println(ans); // Should be True
      
   }
   public static boolean backspaceCompare(String s1, String s2)
   {
      Stack<Character> s1_stack = new Stack<Character>();
      Stack<Character> s2_stack = new Stack<Character>();
      int countBackspaces = 0;
      
      for(int i = 0; i < s1.length(); i++){
         if(s1.charAt(i) == '#'){
            countBackspaces++;
            s1_stack.pop();
         } else {
            s1_stack.push(s1.charAt(i));
         }
      }
      for(int i = 0; i < s2.length(); i++){
         if(s2.charAt(i)=='#'){
            s2_stack.pop();
         } else {                   
            s2_stack.push(s2.charAt(i));
         }
      }
        
      for(int i = 0; i < s1.length()-2 * countBackspaces; i++){
         if(s1_stack.pop() != s2_stack.pop()) 
            return false;
      }
      return true;
   }
}
