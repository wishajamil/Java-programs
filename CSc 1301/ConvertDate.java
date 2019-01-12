///////////////////////////////////////////////////////////////////////////////////////////////////////////
//Solution to Programming Homeowork 9                                                                    //
//Name: Wisha Jamil                                                                                      //
//Lab time: Friday 1:00PM to 2:40PM                                                                      //
//Project description: convert the date in day month year form. the letter in the month may be lowercase,//
//uppercase or mixture of lower and upper. The day is a 1 or 2 digit number. The year is any number of   //
//digits. and there can be any number of spaces                                                          //
///////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ConvertDate
{
   public static void main(String args[])
   {
       Scanner console = new Scanner(System.in);
      
       int MaxCap, pun;       // space, punctuation(comma)
       String date, d, m, y;  //day, month, year
      
       System.out.print("Enter date to be converted(month day, year): ");
       date = console.nextLine();
       date = date.trim();
       MaxCap = date.indexOf(' ');
       pun = date.indexOf(',');
       
       d = date.substring(MaxCap + 1, pun);
       d = d.trim();
     
       m = date.substring(0, MaxCap);
       m = m.toLowerCase();
       m = m.substring(0, 1).toUpperCase() + m.substring(1);
       m = m.trim();
      
       y = date.substring(pun + 2);
       y = y.trim();
      
       String converted = d + " " + m + " " + y;
      
       System.out.println();
       System.out.println("Converted date: " + converted);
   }
}