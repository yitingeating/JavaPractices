package studio7;

public class Point {
	
	private 
	double x;
	double y;
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public String toString(){
		return "("+this.x+" , "+this.y+")";
	}
	public Point plus(Vector vector){
		final Point newPoint=new Point(this.x+vector.getDeltaX(),this.y+vector.getDeltaY());
		return newPoint;
	}
	public Vector minus(Point point){
		final Vector newVector=new Vector(this.x-point.getX(),this.y-point.getY());
		return newVector;
	}
	public double distance(Point point){
		double distX=this.getX()-point.getX();
		double distY=this.getY()-point.getY();
		return Math.sqrt(distX*distX+distY*distY);
	}

}
