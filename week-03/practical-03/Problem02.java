import java.util.*;

public class Problem02{
	public static boolean isPrime(int number){
		boolean result=true;
		
		if (number==1){
			result=false;
		}
		else if(number !=2){
			for(int i=2; i< number; i++){
				int remainder= number%i;
				if(remainder ==0){
					result=false;
					break;
				}
			}
		}//check by definition of Prime
		
		return result;
	}//method to know if a number is Prime or not



	public static int getANumber(){
		int number=-1;
		Scanner input =new Scanner(System.in);
		System.out.println("Please, insert a number: ");
		//initialization 

		do{
			while(!input.hasNextInt()){
				System.out.println("Invalid input, insert a number again: ");
				input.next();
			}
			//ask again if there is wrong input
	
			number=input.nextInt();
			if(number<=1){
				System.out.printf("A prime must be bigger than 1.\nPlease enter again:\n");
				number=-1;
			}else{
				break;
			}
		}while(number==-1);
		//get and save the number

		return number;
		
	}//method to get a number from user



	public static void main(String[] args){
		char option=' ';
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome!");

		do{	
			System.out.println("Please choose the service you want: ");
			System.out.printf("a) run a Prime check\nb) quit\n");
			option=input.next().charAt(0);
		
			switch (option){
				case 'a':
				case 'A':
					int userInput=getANumber();
					boolean result= isPrime(userInput);
					if (result==true){
						System.out.printf("Number %d is a Prime.\n", userInput);
					}
					else{
						System.out.printf("Number %d is not a Prime.\n", userInput);
					}
					break;

				case'b':
				case'B':
					option=' ';
					break;
				
				default:
					System.out.printf("Invalid input.\n");
					break;
				}

		}while (option!=' ');		
		
	}
	
}
