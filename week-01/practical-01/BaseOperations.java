public class BaseOperations{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4};
		//set the test array
	
		printArray(array);
		//test the print method
		
		array= reverseArray(array);
		printArray(array);
		//test the reverse method
	}

	public static void printArray(int[] array)
	{	
		System.out.print("[");
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]);
			if (i!=(array.length-1))
			{
			System.out.print(",");
			}
		}
		//print the array
		System.out.println("]");
		//change to another line
	}

	public static void printArray(String[] array)
	{
		System.out.print("[");
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+",");
			if (i!=(array.length-1))
			{
			System.out.print(",");
			}
		}
		System.out.println("]");
	}
	//reload the method with different arguments
	
	public static void printArray(float[] array)
	{	
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+",");
			if (i!=(array.length-1))
			{
			System.out.print(",");
			}
		}
		System.out.println("]");
	}
	//reload the method with different arguments

	public static int[] reverseArray(int [] array)
	{
		int[] reverse = new int[array.length];
		//create an array to store the reverse version

		int arrayIndex =0;
		//declare and initialize the Index


		for(int i = array.length-1; i>=0; i--)
		{
			reverse[arrayIndex]=array[i];
			arrayIndex++;
		}
		//reverse the order

		return reverse;
		//return the new array
	}
	
	public static String[] reverseArray(String [] array)
	{
		String[] reverse = new String[array.length];

		int arrayIndex =0;

		for(int i = array.length-1; i>=0; i--)
		{
			reverse[arrayIndex]=array[i];
			arrayIndex++;
		}
		return reverse;
		
	}
	//reload the method with different arguments

	public static float[] reverseArray(float [] array)
	{
		float[] reverse = new float[array.length];

		int arrayIndex =0;

		for(int i = array.length-1; i>=0; i--)
		{
			reverse[arrayIndex]=array[i];
			arrayIndex++;
		}
		return reverse;
	}
	//reload the method with different arguments
}	
