////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Lab 13                                                                          //
//Name: Wisha Jamil                                                                                       //
//Lab time: Friday 1:00PM to 2:40PM                                                                       //
//Project description: Read the user's response using Scanner. find the chacacters the first and last name//
//                     also print the initials of a name.                                                 //
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class FancyMyName
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String name;
        String firstName, lastName, initial1, initial2;
        int space;
        
        System.out.print("Please enter your first name and last name, separated by a space: ");
        name = console.nextLine();
        
        space = name.indexOf(" ");
        firstName = name.substring(0, space);
        lastName = name.substring(space + 1, name.length());
        initial1 = name.substring(0,1);
        initial2 = name.substring(space+1, space+2);
        
        System.out.print("You entered the name: " + name + "\n");
        System.out.print("Your first name is " + firstName + ": has " + firstName.length() + " characters\n");
        System.out.print("Your last name is " + lastName + ": has " + lastName.length() + " characters\n");
        System.out.print("Your initials are: " + initial1 + initial2 + "\n");
        
    }
 }
    
