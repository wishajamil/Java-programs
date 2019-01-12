////////////////////////////////////////////////////////////////
//Solution to Lab 8 Excerise 1-4                              //
//Name: Wisha Jamil                                           //
//Lab time: Friday 1:00PM to 2:40PM                           //
////////////////////////////////////////////////////////////////

import java.util.*;


public class SimpleWithMoreInput {

   public static void main(String[] args)
   {
      String name1;
      String name2;
      int age1;
      int age2;
      String grades;
      double total = 0;
      int credit;
      double gpa; 
            
      Scanner input = new Scanner(System.in);
      
   //Excerise 1
   
      System.out.println("What is your name?");
      name1 = input.next();
      
      System.out.println("what is your age?");
      age1 = input.nextInt(); 
      
      System.out.println("What is your partner name?");
      name2 = input.next();
      
      System.out.println("what is your partner age?");
      age2 = input.nextInt();  
         
      System.out.println("You are such a child, " + name1 + "!" );
      System.out.println("You are so old, " + name2 + "!" );
      System.out.println();
      
   //Excerise 2
      
      //////////////////////////////////////////////////////////////////////////////////////////
      // public class Simple {                                                                //
      //                                                                                      //
      //   public static void main(String[] args) {                                           //
      //                                                                                      //
      //     System.out.print("Early enough for ya?");                                        //
      //  }                                                                                   //
      // }                                                                                    //
      //                                                                                      //
      //The difference between System.out.println(...) and System.out.print(...):             //
      //The print("Early enough for ya") method prints just the string "Early enough for ya", //
      //but does not move the cursor to a new line. Hence, subsequent printing instructions   //
      //will print on the same line. The println("Early enough for ya") method prints the     //
      //string "Early enough for ya" and moves the cursor to a new line.                      //
      /////////////////////////////////////////////////////////////////////////////////////////  
     
   //Excerise 3
   
      System.out.println("My age and my partner age added together is " + (age1 + age2) + "!" );
      System.out.println("My age and my partner age subtracted together is " + (age2 - age1) + "!" );
      System.out.println("My age in dog years is " + (age1 * 7) + "!" );  
           
      //////////////////////////////////////////////////////////////////////////////////////////
      // PART D -                                                                             //
      //The difference between input.next() and input.nextInt():                              //
      //Input.next() is used with the string and input.nextInt() is used with the integer. if //
      //the varible is integer we will put input.nextInt(). Same goes for other types like    //
      //a double varible be .nextDouble(). With the string we only use Input.next().          //
      /////////////////////////////////////////////////////////////////////////////////////////     
      
      System.out.println();
      
   //Excerise 4
     
      System.out.println("My age is " + age1 + ".");
      System.out.println("Twice my age is " + (age1 * 2) + ".");
      System.out.println("Three times my age is " + (age1 * 3) + ".");
      System.out.println("Half of my age is " + (double)(age1 / 2.0) + ".");
      
      double class1 = 4.0;
      double class2 = 4.0;
      double class3 = 4.0;
      double class4 = 4.0;
      double class5 = 3.7;
      double class6 = 3.7;
      double GPA;
      
      GPA = (class1 + class2 + class3 + class4 + class5 + class6) / 6;
      System.out.println("My GPA is " + GPA + ".");
      System.out.println("Half of my GPA is " + (GPA / 2) + ".");
      System.out.println();
      
      // Another way for GPA(I wasn't sure what way was the question asking the answer)SO I DID IT BOTH WAYS
       
      Scanner console = new Scanner(System.in);
      System.out.printf("How many classes did you have?: ");
      double classes = console.nextDouble();
          
      for (int j = 0; j < classes; j++) {
      
         Scanner inputs = new Scanner(System.in);
         System.out.print("What is your Grade?: ");
         grades = inputs.nextLine();
      
         if (grades.equals("A")){
            credit = 4; 
            total = total + credit;         
         } 
         else if (grades.equals("B")){
            credit = 3;
            total = total + credit;         
         } 
         else if (grades.equals("C")){
            credit = 2;
            total = total + credit;        
         } 
         else if (grades.equals("D")){
            credit = 1;
            total = total + credit;         
         } 
         else if (grades.equals("F")){
            credit = 0;
            total = total + credit;         
         }      
      }
      gpa = total / classes;
   
      System.out.println("My GPA is " + gpa + ".");
      System.out.println("Half of my GPA is " + (gpa / 2) + ".");
             
   }
}
