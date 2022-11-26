package shapes;

public class Shape{
	private double width;
	private double height;
	private double radius;
	private double length;
	//declare attribute



	public Shape(){
	}
	//constructor without parameters

	public Shape(double length, double width){
		this.width=width;
		this.length=length;
	}
	//constructor without length and width

	public Shape(double radius){
		this.radius =radius;
	}
	//constuctor with radius



	public void setWidth(double width){
		this.width=width;
	}
	//setter for width

	public void setHeight(double height){
		this.height=height;
	}
	//setter for height

	public void setRadius(double radius){
		this.radius=radius;
	}
	//setter for radius

	public void setLength(double length){
		this.length=length;
	}
	//setter for length



	public double getWidth(){
		return width;
	}
	//getter for width

	public double getHeight(){
		return height;	
	}
	//getter for height

	public double getRadius(){
		return radius;
	}
	//getter for radius

	public double getLength(){
		return length;
	}
	//getter for length
}
