import java.util.*;
//import the library first


public class Problem05{
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
				switch (numbers[i]){
					case 0:
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						System.out.print("o");
						break;
					case 6:
					case 7:
					case 8:
					case 9:
					case 10:
						System.out.print("x");
						break;
					case 11:
					case 12:
					case 13:
					case 14:
					case 15:
						System.out.print("s");
						break;
					case 16:
					case 17:
					case 18:
					case 19:
					case 20:
						System.out.print("*");
						break;	
				}
				
			}
			//print numbers[i] times of "o" or "s" or "*" or "x"
	
			System.out.print("\n");
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
