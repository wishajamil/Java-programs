
/**
 * Class StringStack
 * 
 */
public class StringStack
{
    private String st;
    private int    depth;
    
    public StringStack() { st = ""; depth=0; }
    
    public void push( String x )
    {
        st = x + "," + st;
        depth++;
    }
    
    public String pop()
    {
        String s;
        int    p;
        
        if( st.length() == 0 )
            return null;
        else
        {
            p = st.indexOf(",");
            s = st.substring(0, p);
            st = st.substring(p+1);
            depth--;
            return s;
        }
    }
    
    public String peek()
    {
        String s;
        int    p;
        
        if( st.length() == 0 )
            return null;
        else
        {
            p = st.indexOf(",");
            s = st.substring(0, p);
            return s;
        }
        
    }
    
    public int depth() { return depth; }
    
    public String toString()
    {
        return String.format("STACK: [ %s ]", st);
    }
}

