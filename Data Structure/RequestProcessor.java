/*
      Assume a printer that process requests every 3000 milliseconds. Write a class RequestProcessor has
      only one method: processRequests(Queue<Integer> q_t), where q_t represents a queue of times
      in millisecond. Assume that it is guaranteed that every call to ping uses a strictly larger value of t than
      before.
*/


import java.util.LinkedList;
import java.util.Queue;
public class RequestProcessor {
   public static void main(String[] args){
   
   //requests_time = 0,1,100,3001,3002
   // This is how we create a queue object
      Queue<Integer> q_t = new LinkedList<Integer>();
      q_t.add(0); // q.add is an enqueue operation
      q_t.add(1);
      q_t.add(100);
      q_t.add(3001);
      q_t.add(3002);
   
      System.out.println(processRequests(q_t));
   
   }
   public static int processRequests(Queue<Integer> q_t){
      int count =0;
      while (q_t.peek() < 3000){
         System.out.print("PROCESSING Request at time....");
         System.out.println(q_t.peek());
         q_t.poll(); // q.poll is an dequeue operation
         count++;
      }
      return count;
   }
}