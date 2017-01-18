package lab3;

import cse131.ArgsProcessor;

public class MineSweeper {

	public static void main (String[] args) {
		
		//
		// Do not change anything between here ...
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int cols = ap.nextInt("How many columns?");
		int rows = ap.nextInt("How many rows?");
		double percent = ap.nextDouble("What is the probability of a bomb?");
		//
		// ... and here
		//
		//  Your code goes below these comments
		//
		percent=(percent>=0)&&(percent<=1)? percent:1;
	 int [][]col=new int[cols][rows];
	// int []row=new int[rows];
	 
	 for(int i=0;i<rows;i++)
	 {System.out.println();
		 for(int j=0;j<cols;j++)
		 { double rnd=Math.random();
		 if(rnd<=percent)
			 col[j][i]=1;
		 else
			 col[j][i]=0;
		 if(col[j][i]==0)
			 System.out.print("."+" ");
		 else
			 System.out.print("*"+" ");	 
		 
		 }
	 }
	 System.out.println();
	 System.out.println("----------------");
    
	  	for(int j=0;j<cols;j++)
      	{  int sum=0;
      	   int i=0;
            if(j==0)		
    		sum+=col[j+1][i]+col[j][i+1]+col[j+1][i+1];
    		else if(j==cols-1)
    			sum+=col[j-1][i]+col[j-1][i+1]+col[j][i];
    		else
    		{
    		sum+=col[j-1][i]+col[j+1][i]+col[j-1][i+1]+col[j][i+1]+col[j+1][i+1];
    		
    		}
    		if(col[j][i]==0)
    		 System.out.print(sum+" ");
    		else
    			System.out.print("*"+" ");
    	}
	  	
    for(int i=1;i<rows-1;i++)
    {System.out.println();
    	for(int j=0;j<cols;j++)
      	{  int sum=0;
            if(j==0)		
    		sum+=col[j][i-1]+col[j+1][i-1]+col[j+1][i]+col[j][i+1]+col[j+1][i+1];
    		else if(j==cols-1)
    			sum+=col[j-1][i-1]+col[j][i-1]+col[j-1][i]+col[j-1][i+1]+col[j][i+1];
    		else
    		{
    		sum+=col[j-1][i-1]+col[j][i-1]+col[j+1][i-1]+col[j-1][i]+col[j+1][i]+col[j-1][i+1]+col[j][i+1]+col[j+1][i+1];
    		
    		}
    		if(col[j][i]==0)
    		 System.out.print(sum+" ");
    		else
    			System.out.print("*"+" ");
    	}
    }
    System.out.println();
  	for(int j=0;j<cols;j++)
  	{  int sum=0;
  	   int i=rows-1;
        if(j==0)		
        	sum+=col[j][i-1]+col[j+1][i-1]+col[j+1][i];
		else if(j==cols-1)
			sum+=col[j-1][i-1]+col[j][i-1]+col[j-1][i];
		else
		{
		sum+=col[j-1][i-1]+col[j][i-1]+col[j+1][i-1]+col[j-1][i]+col[j+1][i];
		
		}
		if(col[j][i]==0)
		 System.out.print(sum+" ");
		else
			System.out.print("*"+" ");
	}
    
	 
	}
}
