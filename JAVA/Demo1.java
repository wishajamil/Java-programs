/**
 * Class Demo1
 * 
 */
import java.util.*;


public class Demo1
{
    public static void main(String[] args)
    {
        String s, t;
        int    d;
        
        s = "Duluth High School";
        //   012345678901234567890
        //
        
        System.out.printf("s = %s\n", s);
        System.out.printf("length = %d\n", s.length () );
        
        //subsrting gives u back a aplha =  string 
        t = s.substring(0, 1);
        System.out.printf("s.substring(0,1) = %s\n", t);
        t = s.substring(7, 11);        // 7 through 11 but doesn't include 11
        System.out.printf("s.substring(7,11) = %s\n", t);
        t = s.substring( 7 );
        System.out.printf("s.substring( 7 ) = %s\n", t);
        
        //30 is too big so the program canot run
        //t = s.substring( 7, 30 );
        //System.out.printf("s.substring( 7, 30 ) = %s\n", t);
        
        //index gives back a 3
        d = s.indexOf("u");     // means that start searching this index
        System.out.printf("s.indexOf(\"u \") = %d\n", d);
        
        d = s.indexOf("High");
        System.out.printf("s.indexOf(\"High \") = %d\n", d);
        
        d = s.indexOf("Cat");
        System.out.printf("s.indexOf(\"Cat \") = %d\n", d);
        
         d = s.indexOf("u", 2);     //start searching the index at #2
        System.out.printf("s.indexOf(\"u\",2) = %d\n", d);
        
        d = s.indexOf("u", 2);     
        t = s.substring(d+1, d+3);
        System.out.printf("s.substring(d+1, d+3) = %s\n", t);
        
        String first, middle, last;
        first = s.substring(0,1);
        d = s.indexOf(" "); 
        middle = s.substring (d+1, d+2);
        d = s.indexOf(" ", d+1);
        last = s.substring(d+1, d+2);
        
        String initials = first + middle + last;
        System.out.printf("The initials of %s are %s\n", s, initials);
        
        first = s.substring(0,0);    //it returns a empty string = has a length of zero
        System.out.printf("%s\n", first);
    }
}




