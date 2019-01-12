/**
 * Write a description of class IntegerStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class BuiltInArrayStack<E>
{
    private String[] st;
    
    public BuiltInArrayStack()
    {
        st = new String[0];
    }
    
    public void push( String x )
    {
        String[] newSt = new String[ st.length + 1 ];
        
        for (int i = 0; i < st.length; i++)
            newSt[i] = st[i];
            
        newSt[ st.length ] = x;
        st = newSt;
        
    }
    
    public String pop()
    {
        if( st.length == 0 )
            return null;
        
        String x = st [st.length -1];
        
        String [] newSt = new String[ st.length -1 ];
        
        for (int i = 0; i < st.length -1; i++)
            newSt[i] = st[i];
        
        st = newSt;
        return x;
    } 
    
    public String peek()
    {
        if( st.length == 0 )
            return null;
            
        return st [st.length -1];
    }
    
    public int depth() 
    {
        return st.length;
    }
    
    public String toString()
    {
        return String.format("IntegerStack2: [ %s ]", st);
    }
}

