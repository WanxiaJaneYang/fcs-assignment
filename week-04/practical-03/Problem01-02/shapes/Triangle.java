package shapes;

public class Triangle extends Shape{
	public double area(){
		double area1=getLength()*getHeight()*0.5;
		return area1;
	}
	//calculate area



	public Triangle(){
	}
	//constructor without parameter

	public Triangle(double length, double height){
		setLength(length);
		setHeight(height);
	}
	//constructor with length and height
}
