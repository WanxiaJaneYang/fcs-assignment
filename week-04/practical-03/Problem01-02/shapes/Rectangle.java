package shapes;

public class Rectangle extends Shape{
	public double area(){
		double area1=getWidth()*getLength();
		return area1;
	}
	//calculate the area



	public Rectangle(){
	}
	//constructor without parameters

	public Rectangle(double width, double length){
		super(width, length);
	}
	//constructor with width and length
}
