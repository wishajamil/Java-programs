public class QuickSort {  // Program that outputs the function trace/log
    
   static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[low];  
        int i = low, j = high;
        int k;
        System.out.println("\tPartition method called with low = "+low+"  and high = "+high);
        System.out.println("\tSubarray of the partition method : ");
        System.out.print("\t"+arr[low]+" ") ;
        for(k =low+1;k<=high;k++)
        	System.out.print(arr[k]+" ");
        System.out.println();
        int count=0;
        while(i<j){
        	System.out.println("\tIteration # "+count++);
		    while(arr[i]<=pivot && i<high)  i++;
		    while(arr[j]>=pivot && j>low)  j--;
		    
		    System.out.println("\ti :"+i);
        	System.out.println("\tj :"+j);  
		    if(i<j){ 
		    	System.out.println("\ti<j TRUE   ("+ i+" < "+j+")");
		    	System.out.println("\tswap arr["+i+"] with "+"arr["+j+"]");
		        int temp = arr[i]; 
		        arr[i] = arr[j]; 
		        arr[j] = temp; 
		    }
		    else{
		    	System.out.println("\ti<j FALSE  ("+ i+" > "+j+")    No need to swap...");
		    	
		    }
        }
        
        int temp = arr[low]; 
        arr[low] = arr[j]; 
        arr[j] = temp;
        System.out.println("\tFinally...swap arr["+low+"] with "+"arr["+j+"]");
        return j; 
    }   
  
    /* The main function that implements QuickSort() 
      low  --> Starting index, 
      high  --> Ending index */
    static void quickSort(int arr[], int low, int high){
        if (low < high){
        	System.out.println("\n\nQuicksort called with low = "+low+" and high = "+high);
            int j = partition(arr, low, high); 
            quickSort(arr, low, j-1); 
            quickSort(arr, j+1, high); 
        } 
    } 
    
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = { 4,14,6,9,7,22,3,8 }; 
        int k, n = arr.length; 
        
        System.out.println("Original Array ");
        for(k =0;k<n;k++)
        	System.out.print(arr[k]+" ");
        System.out.println("\n");
        
        quickSort(arr,0,arr.length-1); 
        System.out.println("\n\nArray After Sorting: "); 
        
        
        for(k =0;k<n;k++)
        	System.out.print(arr[k]+" ");
        
        
        
    }
    
}
    
    