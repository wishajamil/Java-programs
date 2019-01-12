//////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Lab 13 bonus 3                                                            //
//Name: Wisha Jamil                                                                                 //
//Lab time: Friday 1:00PM to 2:40PM                                                                 //
//Project description: outputs the string such that the first half is all lowercase and the second  //
//                     half is all uppercase. If, for instance, the string "HelloWorld" is given,   //
//                     the output will be "HELLOworld".                                             // 
//////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class Lower_Uppercase
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        String word;
        String UpperCase, lowerCase;
        
        System.out.print("Please enter a word: ");
        word = console.nextLine();
        
        int size = word.length();
        
        String first = word.substring(0,size/2);
        String last = word.substring(size/2);
        
        System.out.println();
        System.out.print(first.toUpperCase() + last.toLowerCase() );
        
       
    }
 }
 