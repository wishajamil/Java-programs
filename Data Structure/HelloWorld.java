public class HelloWorld {
	
	public static void main(String[] args){
		
		int a = 1 ; // b is defined by value
		int b = a; // b is defined by reference
		
		
		
		int ch = 'a'; // char are considered arithmetic types because they can be casted to an int (their Unicode representation)
		char chpluOne = (char)(ch + 1);
		System.out.println(chpluOne);
		System.out.println("----------");
		System.out.println("Char artithmetic a+1 == "+chpluOne);
		
		// we can use underscore to format a number
		double readableNumber = 100_000_000;
		
		// 1D array of strings
		String[] str_arr = new String[]{"str1","str2"};

		// 2D array of strings
		String[][] str_arr2 = new String[][]{{"str1","str2"},   // 2D array
											{"str3","str4"}};
			
       
        char c = 'a';										    
        SimpleSphere sph = new SimpleSphere();
        sph.radius = 1;
        System.out.println("The original value of c is ..."+c);
        System.out.println("The original value of sphere radius is ..."+sph.radius);
        System.out.println("The original value of str_arr[0] is ..."+str_arr[0]);
        
        
        
        
        System.out.println("\n");
        addOne(str_arr, c, sph);
        System.out.println("The value of c after the function call ..."+c); // The character c was NOT changed by the function call 
        																	                   //because it is a primitive data type
        
        System.out.println("The value of sphere radius after the function call ..."+sph.radius); //The sphere radius was changed to 5 by the function call 
		
        System.out.println("The value of str_arr[0] after the function call ..."+str_arr[0]); //The first element of the str_arr was changed by the
         
		 
		
	
		
	}
	/**
	 * 
	 * @param str_arr an array of Strings
	 * @param c a character
	 * @param sph Sphere instance of the class SimpleSphere
	 */
	public static void addOne(String[] str_arr, char c, SimpleSphere sph){
		str_arr[0] = "str6" ; // originally str_arr[0] == 'str1'
		c = 'b'; // originally c == 'a'
		sph.radius = 5;  // originally sph.radius == 1 
		
	}
	

}