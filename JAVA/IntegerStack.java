/**
 * Write a description of class IntegerStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class IntegerStack
{
    private ArrayList<Integer> st;
    
    public IntegerStack()
    {
        st = new ArrayList<Integer>();
    }
    
    public void push( Integer x )
    {
        st.add( x );
    }
    
    public Integer pop()
    {
        if( st.size() == 0 )
            return null;
            
        return st.remove( st.size() - 1);
    } 
    
    public Integer peek()
    {
        if( st.size() == 0 )
            return null;
            
        return st.get( st.size() -1 );
    }
    
    public int depth() 
    {
        return st.size();
    }
    
    public String toString()
    {
        return String.format("IntegerStack2: [ %s ]", st);
    }
}



