public class InsertionSort{
	public int[] sortInt(int[] unsortedArray){
		int size=unsortedArray.length;
		for(int i=1; i<size; i++){
			int key = unsortedArray[i];
			int j=i-1;
			while((j>=0)&&(unsortedArray[j]>key)){
				unsortedArray[j+1]=unsortedArray[j];
				j--;
			}
			unsortedArray[j+1]=key;
		}
		return unsortedArray;
	}
	//insertion sort for int array;
		
	public float[] sortFloat(float[] unsortedArray){
		int size=unsortedArray.length;
		for(int i=1; i<size; i++){
			float key = unsortedArray[i];
			int j=i-1;
			while((j>=0)&&(unsortedArray[j]>key)){
				unsortedArray[j+1]=unsortedArray[j];
				j--;
			}
			unsortedArray[j+1]=key;
		}
		return unsortedArray;
	}
	//insertion sort for float array

	public String[] sortString(String[] unsortedArray){
		int size=unsortedArray.length;
		for(int i=1; i<size; i++){
			String key = unsortedArray[i];
			int j=i-1;
			while((j>=0)&&(compareString(unsortedArray[j], key)==-1)){
				unsortedArray[j+1]=unsortedArray[j];
				j--;
			}
			unsortedArray[j+1]=key;
		}
		return unsortedArray;	
	}
	//insertion sort for String array
	
	public static int compareString(String a, String b){
		int length= a.length()<b.length() ? a.length(): b.length();
		//get the smaller length of a and b

		int result=0;
		//0 for equal, 1 for a<b, -1 for a>b

		for(int i=0; i<length;i++){
			if(a.charAt(i)<b.charAt(i)){
				result=1;
				break;
			}else if(a.charAt(i)>b.charAt(i)){
				result=-1;
				break;
			}
		}
		//compare character one by one

		if(result==0){
			if(a.length()<b.length()){
				result=1;
			}else if(a.length()>b.length()){
				result=-1;
			}
		}
		//if all the characters in the former parts are equal

		return result;
	}
	//write a method to compare strings
}
