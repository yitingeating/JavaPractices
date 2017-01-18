package studio7;

public class Rectangle {
private 
double width;
double length;
public Rectangle(double width, double length) {
	super();
	this.width = width;
	this.length = length;
}
public double getWidth(){
	return width;
}
public double getLength(){
	return length;
}
public double getArea(){
	return width*length;
}
public double getPerimeter(){
	return 2*(width+length);
}
public boolean smaller(Rectangle rectangle){
	return this.getArea()<rectangle.getArea();
}
public boolean isSquare(){
	return width==length;
}

}
