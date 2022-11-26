import java.util.*;
//import the library

public class Problem01{
	public static void main(String[] args){
		Random numberOfStars = new Random();
		//create random object

		for(int i=0; i<10; i++)
		//loop for ten times
		{
			int number= numberOfStars.nextInt(21);
			//get a random number that between 0 and 21
			
			System.out.printf("Number (%-2d): ", number);
			//print the former part 

			for(int j=0; j<number; j++)
			//loop for "number" times
			{
				System.out.print("*");
			}//output as many as "*" as required
			
			System.out.print("\n");
			//change into next line
		}
	}
}
