//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:02
//===================================

public class HandlingArrays{
	public static void printArray(double[] testArray){
		System.out.print("[");
		for(int i=0; i<testArray.length; i++){
			if(i!=testArray.length-1){
				System.out.printf("%.1f,",testArray[i]);
			}else{
				System.out.printf("%.1f", testArray[i]);
			}	
		}
		System.out.println("]");
	}
	//method to print an array

	public static double[] sumElements(double[] firstArray, double[] secondArray){
		int size=firstArray.length;
		double[] sumArray=new double [size];

		if(firstArray.length==secondArray.length){
			for(int i=0; i<firstArray.length; i++){
				sumArray[i]=firstArray[i]+secondArray[i];
			}
		}else{
			throw new RuntimeException("Error - Arrays different shape");
		}
		return sumArray;
	}
	//method to sum two arrays

	public static double[] maxArrays(double[] firstArray, double[] secondArray){
		int length1=firstArray.length;
		int length2=secondArray.length;
		double[] resultArray= new double[length1];
		
		if(length1==length2){
			for(int i=0;i<length1;i++){
				resultArray[i]=compareDouble(firstArray[i], secondArray[i]);
			}
		}else{
			throw new RuntimeException("Error - Arrays different shape");
		}
		return resultArray;
	}
	//max array method

	public static double compareDouble(double number1, double number2){
		double result=0;
		if (number1>number2){
			result=number1;
		}else{
			result=number2;
		}
		return result;
	}
	//a compare method 
	
	public static int compareInt(int number1, int number2){
		int result=0;
		if (number1>number2){
			result=number1;
		}else{
			result=number2;
		}
		return result;
	}
	//method to compare two int

	public static int smallerInt(int number1, int number2){
		int result=0;
		if (number1>number2){
			result=number2;
		}else{
			result=number1;
		}
		return result;
	}
	//get smaller int

	public static double[] maxAnyArrays(double[] firstArray, double[] secondArray){
		int length1=firstArray.length;
		int length2=secondArray.length;
		int biggerLength=compareInt(length1, length2);
		double[] resultArray=new double[biggerLength];
				
		for(int i=0; i<biggerLength;i++){
			if(i<smallerInt(length1,length2)){
				resultArray[i]=compareDouble(firstArray[i],secondArray[i]);
			}
			else{
				if(length1>length2){
					resultArray[i]=firstArray[i];
				}else{
					resultArray[i]=secondArray[i];
				}
			}
			
		}
		return resultArray;
	}
	//max Any Arrays method
}
