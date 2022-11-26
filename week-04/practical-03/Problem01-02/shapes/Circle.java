package shapes;

public class Circle extends Shape{
	public double area(){
		double area1= getRadius()*getRadius()*3.14;
		return area1;
	}
	//calculate the area



	public Circle(){
	}
	//constructor without parameter
	
	public Circle(double radius){
		super(radius);
	}
	//constructor with radius
}
