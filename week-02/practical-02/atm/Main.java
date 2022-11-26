import java.util.*;
//import the library

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//create the new Scanner object
		int numberOfCash;

		System.out.println("Welcome! Please enter the number of cash you want to withdraw:");
		
		while((!input.hasNextInt()) && (!input.hasNextFloat()))
		{
			System.out.println("Invalide Input, please input the number again: ");	
			input.next();	
			
		}
		//test if the input is correct

		if(input.hasNextInt())
		{
			numberOfCash = input.nextInt();
		}
		else
		{
			numberOfCash = Math.round(input.nextFloat());	
		}
		//get the number and save as numberOfCash
		
		System.out.println(run(numberOfCash));
		//use the method defined later	
		}

	public static String run(int number)
	//declare a method that receives int and returns String
	{
		String result;
		
		int number_of_50, number_of_20, left_value, remainder;
		//declare all the variables we need
		
		
		number_of_50= number/50;
		remainder=number%50;
		number_of_20= remainder/20;
		remainder= remainder%20;

		if(remainder!=0){
			number_of_20=number/20;
			remainder=number%20;
			number_of_50=remainder/20;
			remainder=remainder%20;
			if(remainder==0){
				result="Here is "+number_of_20+" $20 notes and "+number_of_50+" $50 notes.";
			}
			else{
				result="Sorry, the value you input cannot be withdrew.";
			}
		}
		else{
			result="Here is "+number_of_20+" $20 notes and "+number_of_50+" $50 notes.";
		}

		return result;
		//set 2 return for two cases		
	}
}
