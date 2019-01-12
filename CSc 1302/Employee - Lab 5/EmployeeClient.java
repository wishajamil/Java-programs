import java.util.*; 

public class EmployeeClient 
{
   public static void main(String[] args) 
   {
      Lawyer L = new Lawyer();
      SoftwareEngineer S = new SoftwareEngineer();
      HarvardLawyer H = new HarvardLawyer();
      printEmployee(L);
      printEmployee(S);
      code(S);
      printEmployee(H);
      
   } 
   public static void printEmployee(Employee e) 
   {
      System.out.println(e.getClass().getName());
      System.out.println("Salary: " + e.getSalary());
      System.out.println("Hours: " + e.getHours());
      System.out.println("Vacation Days: " + e.getVacationDays());
      System.out.println("Vacation Form: " + e.getVacationForm());
      System.out.println();
   }
   public static void code(SoftwareEngineer s) 
   {
      s.writeCode();
      System.out.println();
   }
}
      
