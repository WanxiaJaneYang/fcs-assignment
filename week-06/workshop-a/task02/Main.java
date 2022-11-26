import java.util.*;

public class Main{
	public static void main(String[] args){
		int number=0;
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter the index of the number in Fibinacci array(starts with 1, 1)");
		do{
			if(!input.hasNextInt()){
				System.out.println("Please enter a number.");
				input.next();
			}
			number=input.nextInt();
			if(number<=0){
				System.out.println("Please enter a positive number.");
			}
		}while(number==0);
		
		Fibinacci test =new Fibinacci();
		System.out.printf("The No.%d number of the Fibinacci array is %d.\n", number, test.fibinacci(number));
	}
}
