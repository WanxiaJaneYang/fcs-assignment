import java.util.Scanner;

public class SumAsRequest{
	public static void main(String[] args){
		System.out.printf("Welcome dear user!\n\n");
		//print the welcome line with an extra \n
		
		Scanner input = new Scanner(System.in);
		//create a new Scanner object
		String option ="";
		//initialize the option

		do{
			System.out.println("Woud you like to:");
			System.out.println("a) sum again");
			System.out.println("b) exit");
			System.out.println("Option: ");
			//print the option-part lines

			option = input.next();
			//get the users input

			switch (option){
				case "a":
				case "A":
				case "a)":
				case "A)":
					System.out.print("Please, insert the first number: ");
					int number_a = input.nextInt();
					
					System.out.print("Please, insert the second number: ");
					int number_b = input.nextInt();
					
					int sum = number_a +number_b;
					System.out.println("----");
					System.out.printf("Thank you for your enquiry, the sum between %d and %d is %d\n", number_a, number_b, sum);
					break;
					//ask for two number, get them, calculate and print the result
				case "b":
				case "B":
				case "b)":
				case "B)":
					System.out.println("Thank you! Have a good day.");
					option ="";					
					break;
					//initialize option to break the loop
				default:
					System.out.println("Invalid input, you may want to enter again:");			
					break;
					//if user input invalide input, print this and loop again				
				}
		}while(option != "");
		//loop the part while the user input anything but "b", "B", "b)" or "B)"
	}
}
