package recursivepatterns;

import sedgewick.StdDraw;

public class Dragon {

	public static void main(String[] args) {
		boolean[] turns = { true, true, true, true};
		drawTurns(turns, 1);//FIXME: Replace with a call to your method
	}

	public static boolean[] turn(int n, boolean[] turn){
		int length=turn.length;
		if(n==0){
			boolean []outTurn=new boolean[]{true};
			return outTurn;
		}
		else{
			boolean []outTurn=new boolean[2*length+1];
			
			return outTurn;
		}
		
	}
	
	public static boolean[] NR(boolean[] turn){
		
		int length=turn.length;
		boolean [] newTurn=new boolean[length];
		for(int i=0;i<length;i++){
			turn[i]=turn[i]?false:true;
		}
		for(int i=0;i<length;i++){
			newTurn[i]=turn[length-1-i];
		}
		return newTurn;
	}
	public static void drawTurns(boolean[] turns, int depth) {
		double x0 = 0.5, y0 = 0.5, angle = 0;

		double length = 0.35 / Math.pow(2, depth / 2);

		for (int i = 0; i < turns.length; i++) {

			double x1 = x0 + length * Math.cos(angle);
			double y1 = y0 + length * Math.sin(angle);

			StdDraw.line(x0, y0, x1, y1);
			x0 = x1;
			y0 = y1;
			if (turns[i])
				angle += Math.PI / 2;
			else
				angle -= Math.PI / 2;
			StdDraw.pause((int)(length*1000));

		}

		double x1 = x0 + length * Math.cos(angle);
		double y1 = y0 + length * Math.sin(angle);

		StdDraw.line(x0, y0, x1, y1);

	}

}
