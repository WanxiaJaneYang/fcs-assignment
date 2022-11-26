//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:01
//===================================

import java.util.*;

public class Problem{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number1=0, number2=0;
		//declare the variables for future use

		do{
			System.out.println("Enter width and height to draw a rectangular shape (type 0 to finish)");
			while(!input.hasNextInt()){
				System.out.println("Invalid input,please enter again:");
				input.next();
			}//check if the input is int or not

			number1=input.nextInt();
			if(number1==0){
				break;
			}//quit when user input 0

			number2=input.nextInt();
			//get two numbers and store them


			if(number1==number2){
				System.out.printf("Drawing a square of size %d\n", number1);
			}else{
				System.out.printf("Drawing a rectangle of size %d by %d\n", number1,number2);
			}//print different input on square and rectangular cases

			
			for(int i=0; i<number2; i++){
				for(int j=0; j<number1; j++){
					System.out.print("#");
				}
				System.out.printf("\n");
			}//print the rectangle
			
		}while((number1!=0)&&(number2!=0));
		//loop it util user input 0
		
		System.out.println("Drawing is over");
	}
}
