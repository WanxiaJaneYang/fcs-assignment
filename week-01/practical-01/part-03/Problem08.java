import java.util.Scanner;

public class Problem08{
	public static void main(String[] args){
		System.out.print("Enter the name of the student: ");
		Scanner input1 = new Scanner(System.in);
		String name01 =input1.next();
		System.out.println("Student name is "+ name01);
		//set the name

		System.out.print("Enter the age of the student: ");
		Scanner input2 =new Scanner(System.in);
		int age01 = input2.nextInt();
		System.out.println(name01+"'s age is "+age01);
		//set the age

		System.out.print("Enter the favorite food of the student: ");
		Scanner input3 =new Scanner(System.in);
		String favoriteFood01 = input3.next();
		System.out.println(name01+"'s favorite food is "+favoriteFood01);
		//set the favorite food

		System.out.print("Enter the grade of maths: ");
		Scanner input4 =new Scanner(System.in);
		float grade01_01 = input4.nextFloat();
		System.out.println(name01+"'s grade in maths is "+grade01_01);
		System.out.print("Enter the grade of english: ");
		Scanner input5 =new Scanner(System.in);
		float grade01_02 = input4.nextFloat();
		System.out.println(name01+"'s grade in english is "+grade01_02);
		//set the grade

		System.out.print("Enter the height of the student(cm): ");
		Scanner input6 =new Scanner(System.in);
		float height01 = input6.nextFloat();
		System.out.println(name01+"'s height is "+height01 +"cm");
		//set the height

		System.out.print("Enter the weight of the student(kg): ");
		Scanner input7 =new Scanner(System.in);
		float weight01 = input7.nextFloat();
		System.out.println(name01+"'s weight is "+weight01 +"kg");
		//set the weight

		System.out.print("Enter the number of subject of the student: ");
		Scanner input8 =new Scanner(System.in);
		int numberOfSubject01 = input8.nextInt();
		System.out.println(name01+"'s number of subject is "+numberOfSubject01);
		//set the number of subject
	}
}
