package lab4;

import sedgewick.StdDraw;
import cse131.ArgsProcessor;


public class BumpingBalls {
	
	public static void main(String[] args) {
	  	
    	ArgsProcessor ap = new ArgsProcessor(args);
    	int pause = ap.nextInt("Enter pause time:");
    	
    	 // set the scale of the coordinate system
    	StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        
        int ballNumber=ap.nextInt("How many balls do you want?:");
        ballNumber=ballNumber>1?ballNumber:1;
        int iteration=ap.nextInt("How many times do you want?:");
        
        
        double [][]ball=new double[ballNumber][5];
        for(int n=0;n<ballNumber;n++)
        {   

         ball[n][0]=2*(Math.random())-1.0;//x initial place rx
          ball[n][1]=2*(Math.random())-1.0; //ry
          ball[n][2]=Math.random()/10;   //r
          ball[n][2]=ball[n][2]>0.005? ball[n][2]:0.01;
          double vx=Math.random()/20.0;
          double vy=Math.random()/20.0;
         ball[n][3]=(vx<=0.04)&&(vx>=0.015)? vx:0.04;  //vx
         ball[n][4]=(vy<=0.04)&&(vy>=0.015)? vy:0.04;   //vy
      //   ball[n][3]=0.015;
       //  ball[n][4]=0.023;
        
         
        }
        
        // main animation loop
       for(int j=0;j<iteration;j++) { 
    	   ball=drawBall(ballNumber,ball);/*
    	   // clear the background
           StdDraw.setPenColor(StdDraw.GRAY);
           StdDraw.filledSquare(0, 0, 1.0);
               for(int n=0;n<ballNumber;n++)
               {
            // bounce off wall according to law of elastic collision
            if (Math.abs(ball[n][0] + ball[n][3]) >= 1.0 - ball[n][2]) ball[n][3] = -ball[n][3];
            if (Math.abs(ball[n][1] + ball[n][4]) >= 1.0 - ball[n][2]) ball[n][4] = -ball[n][4];

            for(int k=0;k<ballNumber;k++)
            {
            	if(k!=n)
            	{   
            		double dist=Math.pow(ball[n][0]-ball[k][0],2)+Math.pow(ball[n][1]-ball[k][1],2);
            		dist=Math.sqrt(dist);
            		if(dist<=ball[n][2]+ball[k][2])
            		{
            			ball[n][3]=-ball[n][3];
            			ball[n][4]=-ball[n][4];
            			ball[k][3]=-ball[k][3];
            			ball[k][4]=-ball[k][4];
            		}
            	}
            }
            
            
            
            // update position
           ball[n][0] = ball[n][0] + ball[n][3]; 
            ball[n][1] = ball[n][1] + ball[n][4]; 
            
            if (Math.abs(ball[n][0] ) >= 1.0 - ball[n][2]) ball[n][0] = ball[n][0]-ball[n][2];
            if (Math.abs(ball[n][1]) >= 1.0 - ball[n][2]) ball[n][1] = -ball[n][1]-ball[n][1];
            if (Math.abs(ball[n][0] ) <=  ball[n][2]) ball[n][0] = ball[n][2];
            if (Math.abs(ball[n][1]) <=  ball[n][2]) ball[n][1] = ball[n][1];
           
         
            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.BLACK); 
            StdDraw.filledCircle(ball[n][0], ball[n][1], ball[n][2]); 

            // display and pause for 20 ms
               } 
             */
               StdDraw.show(pause); 
       }
        
	}
	
	public static double [][] drawBall(int ballNumber,double ball[][]){
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledSquare(0, 0, 1.0);
            for(int n=0;n<ballNumber;n++)
            {
         // bounce off wall according to law of elastic collision
         if (Math.abs(ball[n][0] + ball[n][3]) >= 1.0 - ball[n][2]) ball[n][3] = -ball[n][3];
         if (Math.abs(ball[n][1] + ball[n][4]) >= 1.0 - ball[n][2]) ball[n][4] = -ball[n][4];

         for(int k=0;k<ballNumber;k++)
         {
         	if(k!=n)
         	{   
         		double dist=Math.pow(ball[n][0]-ball[k][0],2)+Math.pow(ball[n][1]-ball[k][1],2);
         		dist=Math.sqrt(dist);
         		if(dist<=ball[n][2]+ball[k][2])
         		{
         			ball[n][3]=-ball[n][3];
         			ball[n][4]=-ball[n][4];
         			ball[k][3]=-ball[k][3];
         			ball[k][4]=-ball[k][4];
         		}
         	}
         }
         ball[n][0] = ball[n][0] + ball[n][3]; 
 ball[n][1] = ball[n][1] + ball[n][4]; 
 
 if (Math.abs(ball[n][0] ) >= 1.0 - ball[n][2]) ball[n][0] = ball[n][0]-ball[n][2];
 if (Math.abs(ball[n][1]) >= 1.0 - ball[n][2]) ball[n][1] = -ball[n][1]-ball[n][1];
 if (Math.abs(ball[n][0] ) <=  ball[n][2]) ball[n][0] = ball[n][2];
 if (Math.abs(ball[n][1]) <=  ball[n][2]) ball[n][1] = ball[n][1];
 
 StdDraw.setPenColor(StdDraw.BLACK); 
 StdDraw.filledCircle(ball[n][0], ball[n][1], ball[n][2]); 
	}         

    
            return ball;
	}
	
}