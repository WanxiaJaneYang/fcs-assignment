public class Rectangle{
	int width;
	int height;
	//declare attribute



	void display(){
		System.out.printf("%d %d\n",width, height);
	}
	//print the width and height

	int area(){
		int area1=width*height;
		return area1;
	}
	//calculate area



	public Rectangle(){
	}
	//constructor without parameter

	public Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	//constructor with width and height
}
