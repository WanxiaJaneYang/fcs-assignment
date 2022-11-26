import java.util.*;

public class RectangleArea extends Rectangle{
	public void read_input(){
		System.out.println("Input: ");
		Scanner input=new Scanner(System.in);
		width=0;
		height=0;
		//declare the variable needed

		do{
			String inputLine=input.nextLine();
			String[] numberString =inputLine.split(" ");
			//get the numbers as String array

			if (numberString.length!=2){
				System.out.println("You should enter two numbers, please enter again:");
				
			}else{
				try{
					width = Integer.parseInt(numberString[0]);
					height= Integer.parseInt(numberString[1]);
					if((width<=1000)&&(width>=1)&&(height>=1)&&(height<=1000)){
						break;
					}else{
						System.out.println("Number out of range(1~1000), please enter again:");
						width=0;
						height=0;
					}
				}catch(NumberFormatException e){
					System.out.println("You need enter two integers, please enter again:");
					width=0;
					height=0;
				}
				
			}
			//to see if the user have entered two numbers and if the two numbers fit
		} while(height==0);
		//loop until get the right input
	}
	//method to get width and height from user

	void display(){
		System.out.println("");		
		System.out.println("Output:");
		super.display();
		//print the input by using the method from the parent class

		int areaOfRectangle=this.area();
		System.out.printf("%d\n", areaOfRectangle);
	}
	//method to display area
}
