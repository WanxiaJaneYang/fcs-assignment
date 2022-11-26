import java.util.*;
import java.io.*;

public class Problem03{

	public static void main(String[] args){
		double number_a =getANumber();
		double number_b =getANumber();
		double result = comparison(number_a, number_b);
		if(result-Math.round(result)==0){
			int resultInt= (int)Math.round(result);
			System.out.println("The bigger number is "+resultInt);
		}else{
			System.out.println("The bigger number is "+result);
		}
	}


	public static double getANumber(){
		Scanner input = new Scanner(System.in);
		double number=0;
		System.out.println("Please, insert a number: ");
		while(!input.hasNextDouble()){
			System.out.println("Please, insert a number: ");
			input.next();
		}
		
		if(input.hasNextDouble())
		{
			number = input.nextDouble();
		}
		
		return number;
	}// method to save a number in double type

	public static double comparison(double number_a, double number_b){
		double biggerNumber;
		biggerNumber = number_a > number_b ? number_a : number_b;
		return biggerNumber;
	}//method to find the bigger float
}
