package studio7;

public class Vector {
	public Vector(double deltaX, double deltaY) {
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}
	private
	double deltaX;
	double deltaY;
	
	public String toString(){
		return "[ "+this.deltaX+" , "+this.deltaY+" ]";
	}
	public double getDeltaX(){
		return this.deltaX;
	}
	public double getDeltaY(){
		return this.deltaY;
	}
	public double magnitude(){
		return Math.sqrt(deltaX*deltaX+deltaY*deltaY);
	}
	public Vector deflectX(){
		final Vector newVector=new Vector(-1*this.deltaX,this.deltaY);
		return newVector;
	}
	public Vector deflectY(){
		final Vector newVector=new Vector(this.deltaX,-1*this.deltaY);
		return newVector;
	}
	public Vector plus(Vector input){
		final Vector newVector=new Vector(this.deltaX+input.getDeltaX(),this.deltaY+input.getDeltaY());
		return newVector;
	}
	public Vector minus(Vector input){
		final Vector newVector=new Vector(this.deltaX-input.getDeltaX(),this.deltaY-input.getDeltaY());
		return newVector;
	}
	public Vector scale(double scale){
		final Vector newVector=new Vector(scale*this.deltaX,scale*this.deltaY);
		return newVector;
	}
	public Vector rescale(double magnitude){
		double originMagnitude=magnitude();
		if(originMagnitude==0){
			Vector newVector=new Vector(magnitude,this.deltaY);
			return newVector;
		}
		else{
		
		 Vector newVector=new Vector(this.deltaX/originMagnitude,this.deltaY/originMagnitude);
		return newVector.scale(magnitude);
		}
	}

}
