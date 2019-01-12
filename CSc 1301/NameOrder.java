import java.util.*;

public class NameOrder
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
   
      System.out.print("Please enter your first name and last name, separated by a space: ");
      String name = console.nextLine();
      
      int index = name.indexOf(" ");
      
      String firstName = name.substring(0, index);
      String lastName = name.substring(index+1);
      System.out.print(lastName+ "," + firstName);
   
   
   
   }
}
