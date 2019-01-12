/**
 * Class Stack - Generic Class
 */
import java.util.*;

public class Stack<E>
{
    private ArrayList<E> st;
    
    public Stack()
    {
        st = new ArrayList<E>();
    }
    
    public void push( E x )
    {
        st.add( x );
    }
    
    public E pop()
    {
        if( st.size() == 0 )
            return null;
            
        return st.remove( st.size() - 1);
    } 
    
    public E peek()
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

