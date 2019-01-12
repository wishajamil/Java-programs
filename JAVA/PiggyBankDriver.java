/**
 * class PiggyBankDRiver
 * AP Computer Science - Exam #5
 */
import java.util.*;
 
public class PiggyBankDriver 
{
    public static void main(String[] args)
	{
    	// (Problem 2) Create three PiggyBanks, bankA, bankB, and bankC
    	// bankA should contain 10 quarters, 5 dimes and 2 pennies
    	PiggyBank bankA = new PiggyBank( 10, 5, 2);
    	// bankB should contain 5 quarters, 10 dimes and 23 pennies
    	PiggyBank bankB = new PiggyBank( 5, 10, 23);
    	// bankC should contain 20 quarters, 10 dimes, and 13 pennies
    	PiggyBank bankC = new PiggyBank( 20, 10, 13);
            	
    	
    	// Display the dollar value of the two banks (PROVIDED)
    	System.out.println("Initial Contents:");
    	displayContents( bankA, bankB, bankC);
    	
    	// (Problem 3) Combine bankB with bankA
    	
    	bankA.add( bankB );
    	
    	System.out.println("After adding BankB to bankA:");
    	displayContents( bankA, bankB, bankC);
    	
    	// (Problem 4) Transfer the dimes from bankA to bankB
      
    	transferDimes(bankA, bankB);
      
    	System.out.println("After Transfering dimes from Bank A to Bank B.");
    	displayContents( bankA, bankB, bankC);    	
     	
    	// (Problem 5) Shake bank C and put money that falls out in bank B
      
    	bankB.add( bankC.shake() );
             //OR
      //PiggyBank x = bankC.shake();
      //bankB.add ( x );


    	System.out.println("After shaking bankC and placing change into bankB.");
    	displayContents( bankA, bankB, bankC);
       	
	}
	
	// (Problem 4) Write transferDimes method below
	
	public static void transferDimes( PiggyBank from, PiggyBank to )
    {
        PiggyBank a = new PiggyBank (0, from.getDimes(), 0);
        to.add( a );
        from.withdraw(0, from.getDimes() );
     
    }	
	
	// The method below is complete and is available for your use.
	
	public static void displayContents( PiggyBank a,
                                    	PiggyBank b,
                                    	PiggyBank c )
	{
    	System.out.printf("  Bank A: %2d Q, %2d D, %2d P ( $%.2f )\n",
      	a.getQuarters(), a.getDimes(), a.getPennies(),
      	a.getTotalDollars() );
    	System.out.printf("  Bank B: %2d Q, %2d D, %2d P ( $%.2f )\n",
      	b.getQuarters(), b.getDimes(), b.getPennies(),
      	b.getTotalDollars() );
    	System.out.printf("  Bank C: %2d Q, %2d D, %2d P ( $%.2f )\n",
      	c.getQuarters(), c.getDimes(), c.getPennies(),
      	c.getTotalDollars() );
	}	
}