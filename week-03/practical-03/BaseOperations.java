public class BaseOperations{
	public static void main(String[] args){
		int[] array= {1,2,3,4};
		printArray(array);
		array=reverseArray(array);
		printArray(array);
		//test the method of type int[]

		String[] array2={"China, British, India"};
		printArray(array2);
		array2=reverseArray(array2);
		printArray(array2);
		//test the method of String[] type

		float[] array3={3.4f, 3.1f, 8.9f, 6.3f};
		printArray(array3);
		array3=reverseArray(array3);
		printArray(array3);
		//test the method of float[] type	
		
	}
	
	public static void printArray(int[] array){
		System.out.print("[");
		//print the first part of an array		
		
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]);
			if(i<array.length-1){
				System.out.print(", ");
			}//no ','for the last element
		}

		System.out.println("]");
		//print the final part and change line
	}//method to print the array


	public static void printArray(String[] array){
		System.out.print("[");		
		
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]);
			if(i<array.length-1){
				System.out.print(", ");
			}
		}

		System.out.println("]");
	}//reload with String[] type
		
	public static void printArray(float[] array){
		System.out.print("[");		
		
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]);
			if(i<array.length-1){
				System.out.print(", ");
			}
		}

		System.out.println("]");
	}//reload with float[] type

	public static int[] reverseArray(int[] array){

		int[] result= new int[array.length];
		//create an array to store the result
		
		int i, j=array.length-1;
		for(i=0; i<array.length; i++){
			result[i]=array[j];
			j--;
		}//get the reversed array

		return result;
	}//method to reverse array

	public static String[] reverseArray(String[] array){

		String[] result= new String[array.length];
		
		int i, j=array.length-1;
		for(i=0; i<array.length; i++){
			result[i]=array[j];
			j--;
		}

		return result;
	}//reload with String[] type

	public static float[] reverseArray(float[] array){

		float[] result= new float[array.length];
		
		int i, j=array.length-1;
		for(i=0; i<array.length; i++){
			result[i]=array[j];
			j--;
		}

		return result;
	}//reload with float[] type

	
}
