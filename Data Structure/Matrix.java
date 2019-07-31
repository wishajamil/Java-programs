import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Matrix 
{	
   public static void main(String[] args)
   {   	
      boolean cont = true;
      int size;
   	   
      do
      {	
         long startTime = System.currentTimeMillis();
         Random rnd = new Random();
         Scanner sc = new Scanner(System.in);
         
         //prompt the user for the dimensions of the two squares matrices, and user input is greater than or equal to 50
         while (true) 
         {
            System.out.print("Enter size of matrix greater than or equal to 50: ");
            size = sc.nextInt();
            
            //If the above is not met, prompt the user for a new value.
            if(size >= 50) 
               break; 
         }
         int[][] num1 = new int[size][size];
         int[][] num2 = new int[size][size];
         int[][] result = new int[size][size];
      	
         // generate random integer numbers (ranging from 0 to 50) 
         for(int i = 0 ; i < num1.length; i++) {
            for(int j = 0 ; j < num2.length; j++) {
               int val1 =  rnd.nextInt(50);
               num1[i][j] = val1;
               int val2 =  rnd.nextInt(50);
               num2[i][j] = val2;
            }
         }       
         for(int i = 0 ; i < num1.length; i++) {
            for(int j = 0 ; j < num2.length; j++) { 
               int sum = 0; 
               for(int k = 0; k < result.length; k++) {
                  sum += num1[i][k] * num2[k][j];
               }
               result[i][j] = sum;
            }
         }
          
      	// Display these two matrices
         System.out.println("First Matrix: ");
         for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
               System.out.print(num1[i][j] + " , ");
            }
            System.out.println();
         }
         
         System.out.println("Second Matrix: ");
         for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
               System.out.print(num2[i][j] + " , ");
            }
            System.out.println();
         }
      
      	// Printing dot products of 2 matrix result
         System.out.println("Dot products of 2 matrix");
         for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
               System.out.print(result[i][j] + " , ");
            }
            System.out.println();
         }
      	
         //display the time 
         long elapsed = System.currentTimeMillis() -  startTime;
         System.out.println("\nTotal Execution time "+ elapsed+" Milliseconds");
      	
         //Prompt the user asking if they want to repeat the program
         System.out.println("Would you like to continue? ");
         String r = sc.next();
         if(r.equals("yes")) cont= true;
         else cont=false;
      
      }while(cont);    
   }
}