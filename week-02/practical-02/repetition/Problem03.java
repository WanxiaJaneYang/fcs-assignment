import java.util.*;
//import the library first


public class Problem03{
	public static void main(String[] args){
		Random number = new Random();
		//create new Random obeject

		int[] numbers = new int[10];
		//set an array to store all the random numbers

		int sum=0;

		for(int i=0; i<10; i++)
		//run for 10 times
		{
			numbers[i]=number.nextInt(21);
			//get and store the random numbers

			System.out.printf("Number (%-2d): ", numbers[i]);		
			//print the former part for each line
			
			sum=sum+numbers[i];
			//calculate the sum for further use

			for(int j=1; j<= numbers[i]; j++)
			{
				if((numbers[i]%2) != 0)
				// to see if the number is odd
				{
					System.out.print("-");
				}
				else{
					System.out.print("+");
				}
			}
			//print numbers[i] times of "+" or "-"
	
			System.out.println("");
			//change the line
		}


		float meanFloat =(float)sum/10;
		//get the mean in float type

		int meanInt =Math.round(meanFloat);
		//get the mean in round type

		System.out.printf("Average (%-2d): ", meanInt);

		for(int t=0; t<meanInt; t++){
			System.out.print("*");
			}//print mean times of "*" 
		
		System.out.print("\n");
		//print the average part
	}

}
