import java.util.Random;
import java.util.Scanner;

public class ProductExceptSelf {
	
	public static void main(String[] args){
		
		boolean cont = true;
		   
		do{
				
			long startTime = System.currentTimeMillis();
			Random rnd = new Random();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please enter the array size.....:)");
			int size = sc.nextInt();
			int[] nums = new int[size];
			int[] result = new int[size];
			
			
			int i;
			for(i=0; i< nums.length;i++){
				int val =  rnd.nextInt(10);
				nums[i] = val;
			}
			int j = 0;
			for(i=0; i< nums.length;i++){
				int value = 1;
				for(j=0; j< nums.length;j++){
					if(i!=j) // Except self
						value*= nums[j];
				}
				result[i] = value;
			}
			
			System.out.println("This is my nums array");
			for(i=0; i< nums.length;i++)
				System.out.print(nums[i]+" ,");
			
			System.out.println();
			
			// Printing Product except self reult
			System.out.println("This is my result array");
			for(i=0; i< nums.length;i++)
				System.out.print(result[i]+" ,");
			
			long elapsed = System.currentTimeMillis() -  startTime;
			System.out.println("\nTotal Execution time "+ elapsed+" Milliseconds");
			
			System.out.println(" Would you like to continue? ");
			String r = sc.next();
			if(r.equals("yes")) cont= true;
			else cont=false;
	   
	}while(cont);
	   
	}
}