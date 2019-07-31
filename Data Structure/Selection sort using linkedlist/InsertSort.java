public class InsertSort {

   public static void main(String[] args){
   
      Node head = initializeList("ilovedata");
      System.out.println("\n List Before selectionSort_asc");
      printList(head);
      head = selectionSort_asc(head);
      System.out.println("\n List After selectionSort_asc");
      printList(head);
      // Expected answer: -> a -> a -> d -> e -> i -> l -> o -> t -> v
   
      head = initializeList("ilovedata");
      System.out.println("\n List Before selectionSort_desc");
      printList(head);
      head = selectionSort_desc(head);
      System.out.println("\n List After selectionSort_desc");
      printList(head);
      // Expected answer: -> v -> t -> o -> l -> i -> e -> d -> a -> a
   }
   /*
      (selectionSort_asc function)
         a. Find the node with the minimum value in the linked list of length n
         b. Append the min node in a new result linked list
         c. Delete min from original linked list
         d. Repeat steps a-c until the original linked list is empty
         e. Return the result linked list
   */
   public static Node selectionSort_asc(Node head) {
      Node result = null;
      for (Node node1 = head; node1 != null; node1 = node1.next) {       
         Node min = node1;                                               
         for (Node node2 = node1; node2 != null; node2 = node2.next) {   
            if (min.item > node2.item) {                               
               min = node2;
            }
         }
         result = new Node(min.item);                                  
         min.item = node1.item;
         node1.item = result.item;
      }
      return head;                                                     
   }
   
   /*
      (selectionSort_desc function)
         a. Find the node with the maximum value in the linked list of length n
         b. Append the max node in a new result linked list
         c. Delete max from original linked list
         d. Repeat steps a-c until the original linked list is empty
         e. Return the result linked list
   */
   public static Node selectionSort_desc(Node head) {
      Node result = null;
      for (Node node1 = head; node1 != null; node1 = node1.next) {       
         Node min = node1;                                       
         for (Node node2 = node1; node2 != null; node2 = node2.next) {       
            if (min.item < node2.item) {                       
               min = node2;
            }
         }
         result = new Node(min.item);                       
         min.item = node1.item;
         node1.item = result.item;
      }
      return head;                                           
   }  
    
// Method that takes a string and insert its characters into a linked list
   public static Node initializeList(String str){
      Node head= new Node(str.charAt(0)),cur;
      int i;
      
      for(cur= head,i=1;i<str.length();i++,cur=cur.next){
         cur.next = new Node(str.charAt(i));
      }
      return head;
   }
   
// Method for printing linked list
   public static void printList(Node head){
      Node cur = head;
      if(head==null) System.out.print("<EMPTY>");
      for(;cur!=null;cur=cur.next){
         System.out.print("-> "+cur.item+" ");
      }
   }
}