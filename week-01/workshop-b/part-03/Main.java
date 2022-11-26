import java.util.Scanner;

public class Main{
	static void GetUserInput(){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	System.out.println("You entered " + number);
	// print the integer user input

	Scanner input2 = new Scanner(System.in);
	System.out.print("Enter a float: ");
	float number2 = input2.nextFloat();
	System.out.println("You entered " + number2);
	//print the float user input

	Scanner input3 = new Scanner(System.in);
	System.out.print("Enter a long variable: ");
	long number3 = input3.nextLong();
	System.out.println("You entered " + number3);
	//print the long user input

	Scanner input4 = new Scanner(System.in);
	System.out.print("Enter a short variable: ");
	short number4 = input3.nextShort();
	System.out.println("You entered " + number4);
	//print the short user input

	Scanner input5 = new Scanner(System.in);
	System.out.print("Enter a double variable: ");
	double number5 = input5.nextDouble();
	System.out.println("You entered " + number5);
	//print the double user input
	
	Scanner input6 = new Scanner(System.in);
	System.out.print("Enter a boolean variable: ");
	boolean number6 = input5.nextBoolean();
	System.out.println("You entered " + number6);
	//print the boolean user input

	Scanner input7 = new Scanner(System.in);
	System.out.print("Enter a byte variable: ");
	byte number7 = input5.nextByte();
	System.out.println("You entered " + number7);
	//print the byte user input

	Scanner input8 = new Scanner(System.in);
	System.out.print("Enter a char variable: ");
	char number8 = input5.next().charAt(0);
	System.out.println("You entered " + number8);
	//print the char user input
	}

	public static void main(String[] args){
		GetUserInput();
	}
}

