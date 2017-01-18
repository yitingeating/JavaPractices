import java.awt.Color;

import sedgewick.StdDraw;
public class ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int  N=100;
   double []x=new double[N+1];
   double []y1=new double[N+1];
   double []y2=new double[N+1];
   double []y3=new double[N+1];
   double []sum=new double[N+1];
   for(int i=0;i<=N;i++){
	   x[i]=2*Math.PI*i/N;
	   y1[i]=1*Math.sin(x[i]);
	   y2[i]=0.75*Math.sin(2*x[i]);
	   y3[i]=0.5*Math.sin((3.0/2)*x[i]);
	   sum[i]=y1[i]+y2[i]+y3[i];
   }
   StdDraw.setXscale(0,2*Math.PI);
   StdDraw.setYscale(-2.0,2.0);
   for(int i=0;i<N;i++){
	   StdDraw.setPenColor(StdDraw.BLACK);
	   StdDraw.point(x[i], y1[i]);
	   StdDraw.point(x[i], y2[i]);
	   StdDraw.point(x[i], y3[i]);
	   StdDraw.setPenColor(StdDraw.RED);
	   StdDraw.line(x[i],sum[i] , x[i+1], sum[i+1]);
	}
	}

}
