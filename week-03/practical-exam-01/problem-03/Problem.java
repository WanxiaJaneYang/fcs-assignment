//==================================
// Foundations of Computer Science
// Student:Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:01
//===================================

import java.util.*;
// import the librart


public class Problem{
	public static void main(String[] args){
		float inches = getANumber();
		if((inches>=0)&&(inches<=400)){
			System.out.printf("The length in meters is %3.3f m\n", convertToMeter(inches));
		}
		else{
			System.out.printf("The length %d is out of range\n", Math.round(inches));
		}//check if the number is out of range or not
				
	}

	public static float getANumber(){
		Scanner input = new Scanner(System.in);
		float inches=0;
		System.out.print("Enter a length in inches:");

		while(input.hasNext()){
			if(input.hasNextFloat()){
				inches=input.nextFloat();
				break;
			}
			else{
				System.out.println("Invalid input, please enter again:");
				input.next();
			}
		}

		return inches;
	}//method to get a number in float

	public static float convertToMeter(float inches){
		float meters = (float)(inches*0.0254);
		return meters;
	}//method to convert inches to meters
	
	
}
