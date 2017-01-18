package studio3;
import cse131.ArgsProcessor;
public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap= new ArgsProcessor(args);
		int numDice = ap.nextInt("Input the number of dices");
		int numTime=ap.nextInt("How many times you throw:");
		System.out.println("There will be "+numDice+" dices");
		System.out.println("You will throw them for "+numTime+" times for each");
     
		int []a=new int[6];
		for(int i=0;i<6;i++)
			a[i]=i+1;
		int sameFreq=0;
		int [] sumRes=new int[numTime];
		
		
		for(int i=0;i<numTime;i++)
		{   int sum=0;
			double []Result=new double[numDice];
			int[] Show=new int[numDice];
			System.out.println("Time:"+(i+1)+"  ");
			
			for(int j=0;j<numDice;j++)
			{
			Result[j]=Math.random();
			if(Result[j]<1.0/6.0)
				Show[j]=a[0];
			if((Result[j]>=1.0/6.0)&&(Result[j]<2.0/6.0))
				Show[j]=a[1];
			if((Result[j]>=2.0/6.0)&&(Result[j]<3.0/6.0))
				Show[j]=a[2];
			if((Result[j]>=3.0/6.0)&&(Result[j]<4.0/6.0))
				Show[j]=a[3];
			if((Result[j]>=4.0/6.0)&&(Result[j]<5.0/6.0))
				Show[j]=a[4];
			if((Result[j]>=5.0/6.0)&&(Result[j]<1))
				Show[j]=a[5];
			System.out.print(Show[j]+"  ");
			sum+=Show[j];
			}
			sumRes[i]=sum;
			
			 int countSame=1;
			for(int j=1;j<numDice;j++){
				if(Show[j]==Show[0])
					countSame++;
	           }
			if(countSame==numDice)
				sameFreq++;
			
			System.out.print("        sum:"+sum);
			System.out.println();
		}
		
		
		for(int i=0;i<numTime;i++)
			for(int j=0;j<numTime-i-1;j++)
			{
				if(sumRes[j]>sumRes[j+1])
					{int temp=sumRes[j];
				sumRes[j]=sumRes[j+1];
				sumRes[j+1]=temp;}
			}
		
		
		System.out.println("frequency of same sides:"+(double)sameFreq/(double)numTime);
		
		System.out.println("The values of sum after sorting");
		System.out.println("Sums:");
		System.out.println("The frequency of each sum value");
		for(int i=0;i<numTime;i++)
			System.out.print(sumRes[i]+"  ");
		System.out.println();
		
		int count=1;
		System.out.print(sumRes[0]+"    ");
		for(int i=1;i<numTime;i++)
		{  
		   if(sumRes[i]!=sumRes[i-1])
		   {   System.out.println(count);
			   System.out.print(sumRes[i]+"    ");
			   count=1;
		   }
		   else
		   {
			count++;   
		   }
		}
		System.out.println(count);
		
		
		
		
	}

}
