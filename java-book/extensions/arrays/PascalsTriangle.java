package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {
	
	public static void main(String[] args) {
     ArgsProcessor ap=new ArgsProcessor(args);
     int numRow=ap.nextInt("Input the number of rows");
     System.out.println("          column");
     System.out.print("          ");
     for(int i=0;i<numRow;i++)
    	 System.out.print(i+"  ");
     System.out.println("\n"+"row");
     
     int [][]num=new int[numRow+1][numRow+1];
     for(int i=0;i<numRow+1;i++)
    	 num[i][0]=0;
     for(int j=0;j<numRow+1;j++)
    	 num[0][j]=0;
     
     
     for(int j=1;j<numRow+1;j++)
     for(int i=1;i<numRow+1;i++)
     {
    	 if(i==0)
    		 num[i][j]=1;
    	 if(i==j)
    		 num[i][j]=1;
    	// if((j<0)||(i<0)||(i>j))
    	//	 num[i][j]=0;

    	 else
    		 num[i][j]=num[i][j-1]+num[i-1][j-1];
    	 
     }
     
     for(int j=0;j<numRow;j++){
    	 System.out.print(j+"         ");
    	 
    	 for(int i=0;i<numRow;i++)
    	 {  if(num[i+1][j+1]!=0)
    		System.out.print(num[i+1][j+1]+"  ");
    	 }
    	 System.out.println(); 
     }
		
	}

}
