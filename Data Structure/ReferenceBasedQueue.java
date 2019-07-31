import java.util.ArrayList;

public class ReferenceBasedQueue implements QueueInterface{
   ArrayList<Integer> q;
	
   public ReferenceBasedQueue(){
      q = new ArrayList<Integer>();
   }
	
   public boolean isEmpty() {
   	// TODO Auto-generated method stub
      if(q.isEmpty()) 
         return true;
      return false;
   }
	
   public void enqueue(int newItem) {
   	// TODO Auto-generated method stub
      q.add(q.size(), newItem);	
   }
	
   
   public int dequeue() throws QueueException {
   	// TODO Auto-generated method stub
      int poped;
      if(!isEmpty()){
         poped = q.get(0);
         q.remove(0);
      }
      else{
         throw  new QueueException("Queue is EMPTY !!!!");
      }
      return poped;
   }

   public void dequeueAll() {
   	// TODO Auto-generated method stub
      q = new ArrayList<Integer>();
   }

   public int peek() throws QueueException {
   	// TODO Auto-generated method stub
      if(!isEmpty()){
         return q.get(0);
      }
      else{
         throw  new QueueException("You can not PEEK on empty Queue!!!!");
      }
   	 
   }

}