import java.util.Scanner;

public class Problem09{
	public static void main(String[] args){
		System.out.print("Enter the name of the dog: ");
		Scanner input1 = new Scanner(System.in);
		String name01 =input1.next();
		System.out.println("The dog's name is "+ name01);
		//set the name

		System.out.print("Enter the age of the dog: ");
		Scanner input2 =new Scanner(System.in);
		int age01 = input2.nextInt();
		System.out.println(name01+"'s age is "+age01);
		//set the age

		System.out.print("Enter the favorite food of the dog: ");
		Scanner input3 =new Scanner(System.in);
		String favoriteFood01 = input3.next();
		System.out.println(name01+"'s favorite food is "+favoriteFood01);
		//set the favorite food

		
		System.out.print("Enter the height of the dog(cm): ");
		Scanner input4 =new Scanner(System.in);
		float height01 = input4.nextFloat();
		System.out.println(name01+"'s height is "+height01 +"cm");
		//set the height

		System.out.print("Enter the weight of the dog(kg): ");
		Scanner input5 =new Scanner(System.in);
		float weight01 = input5.nextFloat();
		System.out.println(name01+"'s weight is "+weight01 +"kg");
		//set the weight

		
		System.out.print("Enter the favorite toy of the dog: ");
		Scanner input6 =new Scanner(System.in);
		String favoriteToy01 = input6.next();
		System.out.println(name01+"'s favorite toy is "+favoriteToy01);
		//set the favorite toy


		System.out.print("Enter the owner of the dog: ");
		Scanner input7 =new Scanner(System.in);
		String ownerName01 = input7.next();
		System.out.println(name01+"'s owner is "+ownerName01);
		//set the owner's name


	}
}
