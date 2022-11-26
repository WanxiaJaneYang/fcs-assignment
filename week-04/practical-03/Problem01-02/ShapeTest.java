import shapes.*;
public class ShapeTest{
	public static void main(String[] args){
		Shape square=new Shape(23,23);
		System.out.printf("The Square's width is %.0f\n", square.getWidth());
		//test Shape
		
		Rectangle rec1=new Rectangle(12,5);
		System.out.printf("The area of the rectangle is %.0f\n", rec1.area());
		//test Rectangle

		Circle circle1=new Circle(3);
		System.out.printf("The area of the circle is %.2f\n", circle1.area());
		//test class Circle

		Triangle tri1=new Triangle(3,5);
		System.out.printf("The area of the triangle is %.2f\n", tri1.area());
	}
}
