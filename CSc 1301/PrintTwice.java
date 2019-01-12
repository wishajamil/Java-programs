//////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Lab 13 bonus 2                                                            //
//Name: Wisha Jamil                                                                                 //
//Lab time: Friday 1:00PM to 2:40PM                                                                 //
//Project description: outputs the string twice in a row, first all uppercase and next all lowercase//
//                     If, for instance, the string "Ciao" is given, the output will be "CIAOciao". //
//////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class PrintTwice
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        String word;
        String UpperCase, lowerCase;
        
        System.out.print("Please enter a word: ");
        word = console.nextLine();
        
        UpperCase = word.toUpperCase();
        lowerCase = word.toLowerCase();
        
        System.out.println();
        System.out.println(UpperCase + lowerCase);  
    }
 }