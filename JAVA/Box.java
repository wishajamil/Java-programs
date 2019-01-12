/**
 * Class Box           is a recipe for making the box. use a recipe to make instance variables 
 * 
 */
public class Box
{
    //instance variable - everytime a create a box they have their own l and w
    private double l;        // instance variable representing length
    private double w;        // instance variable representing width
    //private and public only effects the accessible outside of the class
    
    // Class constructors 
    // -- no return type, non - static, same name as class
    public Box()
    {
       l = 0;
       w = 0;
    }
    
    public Box (double len, double width)
    {
        this.setL( len ); 
        this.setW( width );
    }
    
    //Mutator Method (setter method)
    
    public void setL (double len)
    {   
        if (len < 0)
            return;
        l = len;
    }
    
    public void setW (double w)
    {   
         if (w < 0)
            return;
         this.w = w;       //this is just a reference to w  
         //if i have a peratmer with the same name as instance variable then I can no longer see the instance variable
    }
    
    //Accessor Methods (Getter method)
    
    public double getL ()        //i will able to call this metod because it's public 
    {   
        return l;
    }
    
     public double getW()
    {
        return w;
    }
    
    public double getArea()
    {
        return l * getW();
    }
    
    public boolean equals( Box x )
    {
        if (this.getL() == x.getL() && this.getW() == x.getW() )
            return true;
        return false;
    }
    
    public int compareTo ( Box x )
    {
        if ( getArea() > x.getArea() )
            return 1;
        else if ( getArea() < x.getArea() ) 
            return -1;
        return 0;
    }
}
//after it's cooked (cookie)
