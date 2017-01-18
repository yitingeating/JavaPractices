package studio4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	
	public static void main(String[] args) {
		//
		//  Add code for your studio below here.
		//
	Color back1=new Color(0,0,255);
	sedgewick.StdDraw.setPenColor(back1);
	sedgewick.StdDraw.filledRectangle(0.5, 0.7, 0.4, 0.15);
	Color backGround= new Color(255,255,0);	
	sedgewick.StdDraw.setPenColor(backGround);
	sedgewick.StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
	Color back2=new Color(255,0,255);
	sedgewick.StdDraw.setPenColor(back2);
	sedgewick.StdDraw.filledRectangle(0.5, 0.3, 0.4, 0.05);
	Color poly=new Color(255,0,0);
	sedgewick.StdDraw.setPenColor(poly);
  
    double par1=Math.sqrt(3)*0.05;
    double []polyX= new double[]{0.45,0.45-par1,0.45,0.5,0.55,0.55+par1,0.55,0.5};
    double []polyY= new double[]{0.55,0.5,0.45,0.45-par1,0.45,0.5,0.55,0.55+par1};
   sedgewick.StdDraw.filledPolygon(polyX, polyY);
    Color cir= new Color(200,30,200);
    sedgewick.StdDraw.setPenColor(cir);
    sedgewick.StdDraw.filledCircle(0.5, 0.5, 0.03);
    Color text=new Color(0,0,255);
    sedgewick.StdDraw.setPenColor(text);
   
    sedgewick.StdDraw.text(0.5,0.65, "Matrix");
    sedgewick.StdDraw.show(1000);
    sedgewick.StdDraw.text(0.0,0.65, "Matrix");
    sedgewick.StdDraw.show(1000);
    sedgewick.StdDraw.text(0.2,0.65, "Matrix");
    StdDraw.show();
    
    
    
	ArgsProcessor.useStdInput("music");

    // repeat as long as there are more integers to read in
    while (!StdIn.isEmpty()) {

        // read in the pitch, where 0 = Concert A (A4)
        int pitch = StdIn.readInt();

        // read in duration in seconds
        double duration = StdIn.readDouble();

        // build sine wave with desired frequency
        double hz = 440 * Math.pow(2, pitch / 12.0);
        int N = (int) (StdAudio.SAMPLE_RATE * duration);
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++) {
            a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
        }

        // play it using standard audio
        StdAudio.play(a);
    }
	}

}
