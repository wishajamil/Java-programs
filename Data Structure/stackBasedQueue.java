/* 
   Solution to Homework Assigment 2                       
   Project description: Write a new class called stackBasedQueue that implements queue 
                        operations using only 2 stacks               
*/

import java.util.Stack;

public class stackBasedQueue
{
   Stack<Integer> stack1;
   Stack<Integer> stack2;
   
   //This is a stack initialization
   public stackBasedQueue()
   {
      stack1 = new Stack<Integer>();
      stack2 = new Stack<Integer>();
   }
   public boolean isEmpty()
   { 
      if(stack1.empty() && stack2.empty()) 
         return true;
      return false;
   }
   public void enqueue(int newItem)
   {
      stack1.push(newItem);
   }
   public int dequeue() throws QueueException 
   {
      if(isEmpty()) throw new QueueException("You can not DEQUEUE on an EMPTY queue :(( ");
      else {
         while(!stack1.empty())
         {
            stack2.push(stack1.pop());
         }
         int dequeue = stack2.peek();
         stack2.pop();  
         while(!stack2.empty())
         {
            stack1.push(stack2.pop());
         }
         return 0;
      }
   }
   public void dequeueALL()
   {
      while(!stack1.empty()) 
         stack1.pop();
   }   
   public int peek() throws QueueException 
   {
      if (isEmpty()) throw new QueueException("You can not PEEK on an EMPTY queue :(( ");
      else {
         while(!stack1.empty())
         {
            stack2.push(stack1.pop());
         }
         int peek = stack2.peek();
         while(!stack2.empty())
         {
            stack1.push(stack2.pop());
         }
         return peek;
      }
   }
   // Tester code 
   public static void main(String[] args)
   {
      stackBasedQueue q = new stackBasedQueue();
      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      System.out.println("Ans#1 "+q.peek()); // Should be 1
   
      q.dequeue();
      q.dequeue();
      System.out.println("Ans#2 "+q.peek()); // Should be 3
      System.out.println("Ans#3 "+q.isEmpty()); // Should be false
   
      q.dequeueALL();
      System.out.println("Ans#4 "+q.isEmpty()); // Should be true
      System.out.println("Ans#5 "+q.peek());
      //Should throw exception with message: "You can not PEEK on an EMPTY queue :(( “
   }
   public class QueueException extends java.lang.RuntimeException
   {
      public QueueException(String s){
         super(s); 
      }
   }
}