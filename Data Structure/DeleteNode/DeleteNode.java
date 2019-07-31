////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Project description: Write a function deleteAtIndex that takes a linked list head & an integer index as an argument //
//                     looks for the node in the linked list at index & delete the node from the linked list          //
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class DeleteNode
{
   public static void main(String[] args)
   {
      Node head = new Node(1);
      Node second = new Node(2);
      Node third = new Node(3);
      head.next = second;
      second.next = third;
      
      /* The current linked list is as follows:
           head                 second            third
             |                     |                |
             |                     |                |
        +----+------+       +----+------+       +----+------+
        | 1 | o-------->    | 2 | o-------->    | 3 | null |
        +----+------+       +----+------+       +----+------+ 
     */
   
      System.out.println("List Before Deletion");       
      printLinkedList(head);          
   
      deleteAtIndex(2, head);
      System.out.println("List After Deletion at index 2");
      printLinkedList(head);         
      
      deleteAtIndex(1, head);
      System.out.println("List After Deletion at index 1");
      printLinkedList(head);        
   }
   
   // To pass the linked list to a function, you only need to pass the head
   public static void deleteAtIndex(int value, Node head)
   {
      Node prev, curr;
      int counter = 0; //// increment counter as you traverse the list
      prev = null;   
      curr = head;   
      while(counter < value)
      {
         prev = curr;
         curr = curr.next;
         counter++;
      }
      prev.next = curr.next;
   }
   
   // Node traversal and printing 
   public static void printLinkedList(Node head)
   {
      for(Node cur = head;cur!=null;cur=cur.next)
      {
         System.out.print(cur.item+" ");
      }
      System.out.println();
   }
}