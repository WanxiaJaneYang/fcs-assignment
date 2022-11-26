import java.util.*;
//import the library


public class Part1{
public static void main(String[] args){
	int[] numbers = new int[10];
	// create an array to store my numbers

	int sum=0;
	//create a sum to store the sum
	
	Random rand = new Random();
	//create a new object under the class Random
	
	for(int i=0; i<10; i++)
		{
		numbers[i]=rand.nextInt(500);
		//create the ten random integers within 0-500
		sum=sum+numbers[i];
		//calculating the sum
		}

	float mean = (float)sum/10;
	//divid the sum by 10 and cast it into float

	System.out.printf("The average of %s is %f.", Arrays.toString(numbers), mean);
	//print the result	
	}
}
