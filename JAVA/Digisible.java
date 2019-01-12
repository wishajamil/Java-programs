/**
 * class Digisible
 *
 */

import java.util.*;

public class Digisible
{

    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter an integer with the following properties:\n");
        System.out.printf(" a) It has no 0 digits\n");
        System.out.printf(" b) All digits are different from each other.\n\n");
        System.out.printf("Number? ");
        int n = console.nextInt();
        
        int originaln = n;
        while (n > 0) 
        {
            int d = n % 10;
            n = n / 10;
            
            if (originaln % d !=0)
                break;
        }
        if (n > 0)
            System.out.printf("%d is NOT digisible!",originaln);
        else 
            System.out.printf("%d is digisible!\n",originaln);
    }
}

