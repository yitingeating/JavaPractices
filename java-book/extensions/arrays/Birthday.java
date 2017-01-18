package arrays;
import cse131.ArgsProcessor;

public class Birthday {
	
	public static void main(String[] args) {
    ArgsProcessor ap=new ArgsProcessor(args);
    int numEnter= ap.nextInt("How many people enter the room");
    int [][]birthDay=new int[2][numEnter];
    double []indexMonth=new double[13];
    double []indexDay=new double[32];
    for(int i=0;i<13;i++)
    	indexMonth[i]=i*(1.0/12.0);
    for(int i=0;i<32;i++)
    	indexDay[i]=i*(1.0/31.0);
    int Month=0;
    int Day=0;
	
	
	for(int i=0;i<numEnter;i++)
	{
		double mon=Math.random();
		double day=Math.random();
		for(int j=0;j<12;j++)
		{
			if((mon>=indexMonth[j]&&(mon<indexMonth[j+1])))
			Month=j+1;	
		}
		for(int j=0;j<31;j++)
		{
			if((day>=indexDay[j]&&(day<indexDay[j+1])))
			Day=j+1;	
		}
		
       birthDay[0][i]=Month;
       birthDay[1][i]=Day;
	}

	for(int i=0;i<numEnter;i++)
	{
		System.out.println(birthDay[0][i]+"  "+birthDay[1][i]);
	}
	
	//print out the each month fraction
	double []monCnt=new double[12];
	System.out.println("-------------");
	for(int i=0;i<numEnter;i++)
	{
		for(int j=1;j<=12;j++)
		{
			if(birthDay[0][i]==j)
				monCnt[j-1]+=1.0/(double)numEnter;
		}
		
	}
	double aveMonth=0.0;
	for(int i=0;i<12;i++)
	{ System.out.println((i+1)+"th month : "+monCnt[i]);
	aveMonth+=monCnt[i]/12.0;
	}
	System.out.println("average freq "+aveMonth);
	
	//print out each day fraction
	double []dayCnt=new double[31];
	System.out.println("-------------");
	for(int i=0;i<numEnter;i++)
	{
		for(int j=1;j<=31;j++)
		{
			if(birthDay[1][i]==j)
				dayCnt[j-1]+=1.0/(double)numEnter;
		}
		
	}
	double aveDay=0.0;
	for(int i=0;i<31;i++)
	{ System.out.println((i+1)+"th day : "+dayCnt[i]);
	aveDay+=dayCnt[i]/31.0;
	}
	System.out.println("average freq "+aveDay);
	
	//same day

	System.out.println("-------------");
	int counter=0;
    for(int i=0;i<numEnter;i++)
    {
    	for(int j=i;j<numEnter;j++)
    	{
    		if(i!=j)
    		{
    			if((birthDay[0][i]==birthDay[0][j])&&(birthDay[1][i]==birthDay[1][j]))
    				counter++;
    		}
    	}
    }
  System.out.println("same day proportion  "+counter/(double)numEnter);
	
}
}