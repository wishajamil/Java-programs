/**
 * Class StringStack2
 */
import java.util.*;

public class StringStack2
{
    private ArrayList<String> st;
    
    public StringStack2()
    {
        st = new ArrayList<String>();
    }
    
    public void push( String x )
    {
        st.add( x );
    }
    
    public String pop()
    {
        if( st.size() == 0 )
            return null;
            
        return st.remove( st.size() - 1);
    } 
    
    public String peek()
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
        return String.format("StringStack2: [ %s ]", st);
    }
}

