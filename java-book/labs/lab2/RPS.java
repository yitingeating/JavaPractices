package lab2;
import cse131.ArgsProcessor;
public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArgsProcessor ap=new ArgsProcessor(args);
     int Round = ap.nextInt("Input the number of round");
     System.out.println("Totally, there will be "+Round+" round");
     String RealName= "Harry Potter";
     int RealAge=17;
     int RealM;
     String Move1="Rock";
     String Move2="Paper";
     String Move3="Scissors";
     String VirtName="Dembledore";
     int VirtAge=150;
     System.out.print("Player 1"+"            ");
     System.out.println("Player 2");
     System.out.print(RealName+"        ");
     System.out.println(VirtName);
     System.out.print("Age:"+RealAge+"              ");
     System.out.println("Age:"+VirtAge);
     System.out.println("------------------------------------");
     int Count1=0;
     int Count2=0;
     for (int i=1;i<=Round;i++)
     {
    	 double RandChoice=Math.random();
    	 
    	 // RealPlayer
    	 if(RandChoice<=1.0/3.0)
    	 {
    		 RealM=1;
    		 System.out.print(Move1+"                ");
    	 }
    	 else if((RandChoice>(1.0/3.0))&&(RandChoice<=(2.0/3.0)))
    	 { RealM=2;
    	 System.out.print(Move2+"               ");
    	 }
    	 else
    	 { RealM=3;
    	 System.out.print(Move3+"            ");
    	 }
    	 
    	
    	 //VirtualPlayer
        if(i%3==1)
          System.out.println(Move1+"                ");
        else if(i%3==2)
        	System.out.println(Move2+"               ");
        else
        	System.out.println(Move3+"            ");
        
        //see who wins
        if((RealM-(i%3)==1)||(RealM-(i%3)==-2))
        		Count1++;
        if((RealM-(i%3)==-1)||(RealM-(i%3)==2))
        	    Count2++;
      }
    System.out.println("---------------------");
    System.out.println("Win times:");
    System.out.println(RealName+": "+((double)Count1/(double)Round));
    System.out.println(VirtName+":  "+((double)Count2/(double)Round));
    System.out.println("tie"+":  "+(1-((double)Count1/(double)Round)-((double)Count2/(double)Round)));
    if(Count1>Count2)
    	System.out.println("The winner is: "+RealName);
    else if(Count1<Count2)
    	System.out.println("The winner is:¡¡"+VirtName);
    else
    	System.out.println("They need another round....");

}
}
