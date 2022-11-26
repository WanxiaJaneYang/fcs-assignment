import java.util.Scanner;

public class Main{
	static void PrintVariables(){
		float myFloat1 = 10.0f;
		/* declare a float */
		System.out.println(myFloat1);
		//print the float myFloat1

		double myDoulbe1 = 20.3d;
		//delcare a double
		System.out.println(myDoulbe1);
		//print the double myDouble1

		boolean myBoolean1 = true;
		//declare a boolean
		System.out.println(myBoolean1);
		//print the boolean myBoolean1

		char myChar1 = 'z';
		//declare a char
		System.out.println(myChar1);
		//print the char myChar1

		String myString1 = "this is a string";
		//declare a string
		System.out.println(myString1);
		//print the string myString1
	}

	static void ConcatenateAndPrint(){
		boolean myBoolean2 = true;
		float myFloat2 = 2.0f;
		char myChar2 = 'H';
		int myInt = 3110;
		char myChar3 = 'w';
		char myChar4 = 'r';
		char myChar5 = 'd';
		short myShort =0;
		byte myByte = 1;
		String myString2 = "";
	//declare all the variables
		myString2 = myString2 + myChar2 + myInt + myChar3 + myShort + myChar4 + myByte + myChar5 + myFloat2 + myBoolean2;
		System.out.println(myString2);
	//concatenate all the variables and print
	}

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
		PrintVariables();
		ConcatenateAndPrint();
		GetUserInput();
	}
}

