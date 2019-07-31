//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Project description: Write a function called checkPalindrome that takes a string s1 and evaluate if the string// 
//                     is a palindrome or not using only a stack and a queue data structures.                   //
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Check_Palindrome   
{
   public static void main(String[]args)
   {
      String s1 = "radar";
      boolean ans = checkPalindrome(s1);
      System.out.println(ans); // Should be True
   }
   public static boolean checkPalindrome(String s1)
   {
      Stack<Character> s = new Stack<Character>();
      Queue<Character> q = new LinkedList<Character>();       
      
      for (int i = 0; i < s1.length(); i++) 
      {
         s.push(s1.charAt(i));
         q.add(s1.charAt(i));
      }

      while (!q.isEmpty()) 
      {
         if (!q.remove().equals(s.pop()))
            return false;
      }
      return true;
   }
}