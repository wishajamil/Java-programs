public class Lab10{

   public static void main(String []args){
   
      Node head = new Node(1);
      head.next = new Node(5);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      head.next.next.next.next = new Node(2);
      
      
      System.out.println("Average is " + findMean(head, head, 5)); // should return 3
   }


   public static int findMean(Node head, Node cur, int n){   // n = length of the list
      // if the list is empty
      if( head == null ){
         return 0;
      }
      // find the sum of all elements of the sublist after the current node
      int sum = (head.item/n) + findMean(head.next, cur, n);
   
      // if the current node is head node, then return average
      if( head == cur ){  
         // calculate the average    
         int average = ( sum + head.item ) / n;
         return average;
      // if the current node is not the head node, then return sum of all elements
      }else{
         return sum + head.item;
      }
   }       
}