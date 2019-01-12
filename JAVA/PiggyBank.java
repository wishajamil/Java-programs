//
// class PigYBank


import java.util.*; 

public class PiggyBank
{
	// Instance Data
	//
	private int q;
	private int d;
	private int p;
	
	// Class Constructors
	
	public PiggyBank() { q=0; d=0; p=0; }
	public PiggyBank( int q, int d, int p )
	{
    	this.q = 0; this.d=0; this.p=0;
    	
    	if( q >= 0 )
       	this.q = q;
    	if( d >=0 )
       	this.d = d;
    	if( p >=0 )
       	this.p = p;
	}
	
	// Accessor Methods
	
	public int getQuarters() { return q; }
	public int getDimes() { return d; }
	public int getPennies() { return p; }
	
	// Other requested methods
	
	public int getTotalCents() { return p + 10*d + 25*q; }
	public double getTotalDollars() { return (double)getTotalCents()/100.0; }
	public void add( PiggyBank b )
	{
    	this.p += b.p;
    	this.d += b.d;
    	this.q += b.q;
    	b.p = b.q = b.d = 0;
	}
	
	public void withdraw( int q, int d, int p )
	{
    	if( this.q >= q && this.d >= d && this.p >= p)
    	{
        	this.p -= p;
        	this.q -= q;
        	this.d -= d;
    	}
	}
	
	public boolean equals( PiggyBank b )
	{
    	if( this.getTotalCents() == b.getTotalCents() )
        	return true;
    	return false;
	}
	
	public int compareTo( PiggyBank b )
	{
    	if( this.getTotalCents() > b.getTotalCents() )
        	return 1;
    	if( this.getTotalCents() < b.getTotalCents() )
        	return -1;
        	
    	return 0;
	}
	
	public PiggyBank shake( )
	{
    	int remove_p = (int)( (this.p+1)*Math.random() );
    	int remove_d = (int)( (this.d+1)*Math.random() );
    	int remove_q = (int)( (this.q+1)*Math.random() );
    	
    	withdraw( remove_q, remove_d, remove_p);
    	
    	return new PiggyBank( remove_q, remove_d, remove_p);
	}
}