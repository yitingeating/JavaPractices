package studio2;
import cse131.ArgsProcessor;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi;
		ArgsProcessor ap=new ArgsProcessor(args);
		int times=ap.nextInt("Input the times you dart");
    double x;
    double y;
    int inCircle=0;
    for (int i=1; i<= times;i++)
    {
    	x=Math.random()-0.5;
    	y=Math.random()-0.5;
    	double d=Math.sqrt(x*x+y*y);
    	if(d<=0.5)
    		inCircle++;
    	
    }
		double prop=(double)inCircle/(double)times;
		
	    pi=prop/(0.5*0.5);
		System.out.println(pi);
		
		
		
	}

}
