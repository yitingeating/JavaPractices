package ElementsOfProgramming.ConditinalAndLoops;

public class MedianLessThan6 {

	public static void main(String[] args) {
		int a = 3,b = 1,c = 5,d = 9,e = 0,f = 0;
		if(a < b)
		{
			f = b;
			b = a;
			a = f;
		}
	    if(c < d)
	    {
			f = d;
			d = c;
			c = f;
		}
	    if(a < c)
	    {
	    	f = c;
	    	c = a;
	    	a = f;
	    }
	    f = b;
		b = c;
		c = f;
	    if(d < e)
	    {
	    	f = e;
	    	e = d;
	    	d = f;
	    }
	    	
	    if(b < d)
	    {
	    	f = d;
	    	d = b;
	    	b = f;
	    }
	    if(e < d) 
	    System.out.print(d);  
	    else  System.out.print(e);  
					
			
		
		
		// TODO Auto-generated method stub

	}

}
