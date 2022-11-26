import java.util.*;


public class Problem05{

	public static int getDimension(){
		Scanner input = new Scanner(System.in);
		int dimension=0;

		System.out.println("What is the dimension of the Matrix?");
		System.out.print("Input:");
		//ask for the input

		do{
			while(!input.hasNextInt()){
				System.out.printf("\nInvalid input, please enter an positive integer: ");
				input.next();
				}
			//check if the input is int
		
			dimension = input.nextInt();
			if(dimension<=0){
				System.out.println("please enter a positive number:");
				input.next();
			}
		}while(dimension <=0);
		//make sure to get a positive int		
		
		return dimension;
		
	}
	//method to get a dimension



	public static double[][] setMatrix(int length){
		double[][] matrix= new double[length][length];
		Scanner number = new Scanner(System.in);
		System.out.println("Please insert all the values for your matrix:");
		double element;
		//declare everything we need and begin to ask for input

		for (int i =0; i<length; i++){
			for(int j=0; j<length; j++){
				System.out.printf("New matrix [%d][%d]:", i+1,j+1);
				while((!number.hasNextInt())&& (!number.hasNextFloat())){
					System.out.println("Invalid input, please enter again:");
					number.next();
					}
				element = number.nextDouble();
				matrix[i][j]=element;
			}
		}
		//loop to save the input into matrix

		return matrix;
		
	}
	//set matrix according to user's input



	public static void printMatrix(double[][] matrix){
		System.out.println("The determinant of your matrix is: ");
		//print the head of table

		int length = matrix.length;
		//get the dimension of matrix

		for(int i=0; i<length; i++){
			System.out.printf("|\t");
			for(int j=0; j<length; j++){
				System.out.printf("\t%-3.0f", matrix[i][j]);
				if (j< (length-1)){
				System.out.printf(",");
				}
			}
			System.out.printf("\t|\n");
		}
		//loop to print
	}
	//method to print matrix



	public static double calculateSimpleMatrix(double[][] matrix){
		double result=matrix[0][0]*matrix[1][1] -matrix[0][1]*matrix[1][0];
		return result;	
	}
	//method to calculate a 2x2 matrix



	public static double[][] reduceMatrix(double[][] matrix, int column){
		int dimension= matrix.length;

		double[][] reducedMatrix = new double[dimension-1][dimension-1];
		
		for(int i=0; i<dimension-1; i++){
			for(int j=0; j<dimension-1;j++){
				if(j<column){
					reducedMatrix[i][j] = matrix[i+1][j];
				}
				else{
					reducedMatrix[i][j] = matrix[i+1][j+1];
				}
			}
		}
		
		return reducedMatrix;
		
	}//method to get reduced Matrix



	public static double calculateMatrix(double[][] matrix){
		double result=0;
		int dimension = matrix.length;

		if (dimension ==2){
			result=calculateSimpleMatrix(matrix);
		}else if (dimension ==1){
			result= matrix[0][0];
		}else{
			for(int i=0;i<dimension;i++){
				double[][] newMatrix= reduceMatrix(matrix,i);
				//reduce the matrix into smaller ones;
				if(i%2==0){
					result+=matrix[0][i]*calculateMatrix(newMatrix);
				}
				else{
					result-=matrix[0][i]*calculateMatrix(newMatrix);
				}
			}
		}


		return result;	
	}
	//method to calculate the matrix in a recursive manner



	


	public static void main(String[] args){
		System.out.println("Welcom to Matrix Deteremint Calculator!");

		char option=' ';
		Scanner opt = new Scanner(System.in);
	
		do{
			System.out.println("Would you like to calculate a new Matrix?");
			System.out.println("1.Yes 2.No");
			option = opt.next().charAt(0);

			switch(option){

				case '1':
					int dimension= getDimension();
					System.out.println("Great! Let's calculate this determinant then");
					double[][] matrix= setMatrix(dimension);
					printMatrix(matrix);
					System.out.printf("Determinant: %.2f\n", calculateMatrix(matrix));
					break;
				case '2':
					option=' ';
					break;
				default:
					System.out.println("Invalid input, please print again: ");
					break;
				}
		}while(option!=' ');
	}
	//ask what the user want and loop until the user quit

	
}
