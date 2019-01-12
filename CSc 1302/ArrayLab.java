import java.util.Arrays;

public class ArrayLab 
{
	public static void main(String[] args) 
	{	
		int [] numbers = {22,34,21,35,12,4,2,3,99,81};
		
		System.out.println("Array: " + Arrays.toString(numbers));
		
		Reverse(numbers);
		for(int i = 0; i <= numbers.length-1; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("The smallest number is " + getmin(numbers));
		
	    computeTwice(numbers);
		for(int i = 0; i <= numbers.length-1; i++)
		{
			numbers[i] = numbers[i] * 2;
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static void Reverse(int [] numbers) 
	{ 
		  for(int i = 0; i < numbers.length / 2; i++)
		  {
			  int temp = numbers[i];
			  numbers[i] = numbers[numbers.length-1 - i];
			  numbers[numbers.length-1 - i] = temp;
		  }
    }
	
	public static int getmin(int[] numbers)
	{ 
		int min = numbers[0];
		for (int i = 0; i < numbers.length-1; i++)   
		{  
		            if(min > numbers[i])
		            	min = numbers[i];
		}  
		       return min;  
    }  
	
	public static int[] computeTwice(int[] numbers)
	{
	    for (int i = 0; i > numbers.length; i++)
	    { 
	        numbers[i] = numbers[i] * 2;
	    }
	    return numbers;
	}
}