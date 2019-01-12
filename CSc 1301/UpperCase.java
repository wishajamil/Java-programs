///////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Lab 13 bonus 1                                                         //
//Name: Wisha Jamil                                                                              //
//Lab time: Friday 1:00PM to 2:40PM                                                              //
//Project description: translates it to all uppercase letters and outputs it on the display      //
//                     If, for instance, the string "HeLLo" is given, the output will be "HELLO".//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class UpperCase
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String word;
        
        System.out.print("Please enter a word: ");
        word = console.nextLine();

        System.out.println();
        System.out.println(word.toUpperCase());  
    }
 }