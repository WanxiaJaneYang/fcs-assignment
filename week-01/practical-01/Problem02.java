import java.util.*;


public class Problem02{

	public static void main(String[] args){

		int number;
		char option='y';
		Scanner input = new Scanner(System.in);
		//set the varibles needed

		
		do{
			switch (option){
				case('y'):
				case('Y'):	
					System.out.println("Please, insert a number: ");
					//print the first line

					while(!input.hasNextInt())
						{
						System.out.println("Invalide input, please insert again: ");
						input.next();
						}
						//check if the input is int or not
		

					number=input.nextInt();
					boolean result= IsPrime(number);

					if(result==true){
						System.out.printf("%d is a Prime.\n", number);
						}
					else{
						System.out.printf("%d is not a Prime.\n", number);
						}
					System.out.println("Do you want to continue? y/n");
					option=input.next().charAt(0);
					break;
				case('n'):
				case('N'):
					break;
				default:
					System.out.println("Invalid input, please enter again: ");
					option='y';
					break;
				}
		}while((option =='y')|| (option == 'Y'));
	}


	public static boolean IsPrime(int number){
		boolean result=true;
		int remainder;

		if (number==1)
		{
			result=false;
		}
		else if (number!=2)
		{
			for(int i=2; i<number; i++){
				remainder = number%i;
				if(remainder == 0){
					result=false;
					break;
				}
			}
		}		
		
		return result;
	}
	//method that check if the given number is prime
}
