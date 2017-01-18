package studio2;
import cse131.ArgsProcessor;

public class GC {
public static void main(String args[]){
	ArgsProcessor ap=new ArgsProcessor(args);
	int length=ap.nextInt("Input the length of the string of DNA:");
	length=length>0?length:1;
	System.out.println("Showing the DNA string:");
	 String stri="";
	for(int i = 1;i <= length;i++)
	{
	  double rand=Math.random();
 if((0 <= rand) && (rand < 0.25))
		  stri += "A";
	  else if((0.25 <= rand) && (rand < 0.5))
		  stri += "T";
	  else if((0.5 <= rand) && ( rand <0.75))
		  stri += "C";
	  else
		  stri += "G";
	  System.out.print(stri);	
	}
	
	int cntA=0,cntT=0,cntC=0,cntG=0;
	for(int i = 0;i <=length-1;i++)
	{
		char r=stri.charAt(i);
		if(r=='A')
			cntA++;
		else if(r == 'T')
			cntT++;
		else if(r=='C')
			cntC++;
		else 
			cntG++;
     }
	System.out.print('\n');
	double porA=(double)cntA/(double)length;
	double porT=(double)cntT/(double)length;
	double porC=(double)cntC/(double)length;
	double porG=(double)cntG/(double)length;
	System.out.println("The proportion of A is "+porA);
	System.out.println("The proportion of T is "+porT);
	System.out.println("The proportion of C is "+porC);
	System.out.println("The proportion of G is "+porG);
	System.out.println("The proportion of C or G is "+ (porC+porG));
	 
	
	
}
}
