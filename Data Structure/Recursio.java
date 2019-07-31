
public class Recursio {

	
   public static void main(String[] args){
      int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
      System.out.println(factorial(3));
      System.out.println(sum(3));
      System.out.println(reverse("Hello"));
      System.out.println(fibonacci(4));
      System.out.println(findMax(arr,0,arr.length-1));
      printFun(5);
      System.out.println();
      System.out.println("Element is at index  "+binarySearch(arr, 0, arr.length-1, 5));
   	
   }
	
   public static int factorial(int n){
   	// Base Case
      if(n==0)
         return 1;
   
   	// Recursive Case
      return n*factorial(n-1);
   		
   }	
	
   public static int sum(int n){
   	// Base Case
      if(n==0)
         return 0;
   
   	// Recursive Case
      return n+sum(n-1);
   		
   }	
	
   public static String reverse(String str) {
   	// Base Case
      if ((null == str) || (str.length() <= 1))
         return str;
       // Recursive Case
      return reverse(str.substring(1,str.length())) + str.charAt(0);
   }
	
   public static int fibonacci(int n)  {
   	// Base Case
      if (n < 2) 
         return n;
   
   	// Recursive Case
      return fibonacci(n - 1) + fibonacci(n - 2);
   }
	
   public static int findMax(int[] data, int a, int b) {
      if (b - a <= 1) {
         return Math.max(data[a], data[b]);
      } 
      else {
         int mid = (a+b) /2;  
         int leftMax =  findMax(data,a, mid);
         int rightMax = findMax(data,mid +1, b);
         return Math.max(leftMax, rightMax);
      }
   }
	
   static void printFun(int test){ 
      if (test < 1) 
         return; 
      else{ 
           
         System.out.print(test+" "); 
         printFun(test-1); // statement 2 
         System.out.print(test+" "); 
         return; 
      } 
   } 
   public static int binarySearch(int arr[], int left, int right, int searchKey){ 
      if (right >= left) { 
         int mid = left + (right - left) / 2; 
               // Base Case	
         if (arr[mid] == searchKey) 
            return mid; 
               
               // Recursive Cases	   
         if (arr[mid] > searchKey) 
            return binarySearch(arr, left, mid - 1, searchKey); 
         return binarySearch(arr, mid + 1, right, searchKey); 
      } 
      return -1; 
   } 
	  
	
	
}