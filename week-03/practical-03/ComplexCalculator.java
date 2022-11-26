import java.util.*;

public class ComplexCalculator{
	public static class Complex{
		public float realPart;
		public float imaginaryPart;
		public String complexString;

		public Complex(){
		}
		
		public Complex(float realPart, float imaginaryPart){
			this.realPart=realPart;
			this.imaginaryPart=imaginaryPart;
		}


		public void setComplexString( ){
			if(imaginaryPart>0){
				complexString= realPart +"+"+imaginaryPart+"i";
			}else if(imaginaryPart==0){
				complexString= Float.toString(realPart);
			}
			else{
				complexString= realPart +""+imaginaryPart+"i";
			}
		}
	}
	//create a class to store complex

	public static Complex addComplex(Complex number1, Complex number2){
		Complex result =new Complex();
		result.realPart=number1.realPart+number2.realPart;
		result.imaginaryPart = number1.imaginaryPart +number2.imaginaryPart;
		
		return result;
	}
	//method to add two complex

	public static Complex subComplex(Complex number1, Complex number2){
		Complex result =new Complex();
		result.realPart=number1.realPart-number2.realPart;
		result.imaginaryPart = number1.imaginaryPart -number2.imaginaryPart;
		
		return result;
	}
	//method to sub two complex

	public static Complex multiplyComplex(Complex number1, Complex number2){
		Complex result =new Complex();
		result.realPart = number1.realPart*number2.realPart-number1.imaginaryPart*number2.imaginaryPart;
		result.imaginaryPart=number1.realPart*number2.imaginaryPart+number2.realPart*number1.imaginaryPart;
		
		return result;
	}
	//method to do the multiply

	public static Complex divideComplex(Complex number1, Complex number2){
		Complex result =new Complex();
		result.realPart =(number1.realPart*number2.realPart + number1.imaginaryPart*number2.imaginaryPart)/(number2.realPart*number2.realPart + number2.imaginaryPart*number2.imaginaryPart);
		result.imaginaryPart=(number1.imaginaryPart*number2.realPart-number1.realPart*number2.imaginaryPart)/(number2.realPart*number2.realPart + number2.imaginaryPart*number2.imaginaryPart);
		
		return result;
	}
	//method to divide complex

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Complex number1 =new Complex();
		Complex number2 =new Complex();
		Complex result =new Complex();
		int option=0;
		//declare everything first
		
		System.out.println("Enter the real part of your first complex:");
		while(!input.hasNextFloat()){
			System.out.println("Invalid input, please enter again: ");
			input.next();
		}
		number1.realPart=input.nextFloat();
		System.out.println("Enter the imaginary part of your first complex:");
		while(!input.hasNextFloat()){
			System.out.println("Invalid input, please enter again: ");
			input.next();
		}
		number1.imaginaryPart=input.nextFloat();
		number1.setComplexString();
		System.out.printf("The first complex is %s\n",number1.complexString);
		//get the first complex and print
		
		System.out.println("Enter the real part of your second complex:");
		while(!input.hasNextFloat()){
			System.out.println("Invalid input, please enter again: ");
			input.next();
		}
		number2.realPart=input.nextFloat();
		System.out.println("Enter the imaginary part of your second complex:");
		while(!input.hasNextFloat()){
			System.out.println("Invalid input, please enter again: ");
			input.next();
		}
		number2.imaginaryPart=input.nextFloat();
		number2.setComplexString();
		System.out.printf("The second complex is %s\n",number2.complexString);
		//get the second complex and print
		

		do{
			
			System.out.printf("What do you want to do to the two complex? 1.add 2.sub 3.multiply 4.divide\n");
		
			while(!input.hasNextInt()){
				System.out.println("Invalid input, please enter again: ");
				input.next();
			}
			option= input.nextInt();
			switch (option){
				case 1:
					result= addComplex(number1, number2);
					result.setComplexString();
					System.out.printf("(%s) + (%s) = %s\n", number1.complexString, number2.complexString, result.complexString);
					break;
				case 2:
					result= subComplex(number1, number2);
					result.setComplexString();
					System.out.printf("(%s) - (%s) = %s\n", number1.complexString, number2.complexString, result.complexString);
					break;
				case 3:
					result= multiplyComplex(number1, number2);
					result.setComplexString();
					System.out.printf("(%s) * (%s) = %s\n", number1.complexString, number2.complexString, result.complexString);
					break;

				case 4:
					result=divideComplex(number1, number2);
					result.setComplexString();
					System.out.printf("(%s) / (%s) = %s\n", number1.complexString, number2.complexString, result.complexString);
					break;
				default:
					System.out.println("Invalid input, please enter again:");
					option=0;
					break;
					
				}
		}while(option==0);
	}
}
