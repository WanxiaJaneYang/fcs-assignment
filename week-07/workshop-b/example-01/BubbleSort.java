public class BubbleSort{
	public int[] sortInt(int [] unsortedArray){
		boolean isSorted=false;
		int size=unsortedArray.length;
		for(int i=0; i<size; i++){
			for(int j=0; j<size-i-1; j++){
				if (unsortedArray[j]>unsortedArray[j+1]){
					int temp=unsortedArray[j];
					unsortedArray[j]=unsortedArray[j+1];
					unsortedArray[j+1]=temp;
					isSorted=true;
				}
				if (!isSorted){
					break;
				}
			}
		}
		return unsortedArray;
	}
	//bubble sort for int array
	
	public float[] sortFloat(float[] unsortedArray){
		boolean isSorted=false;
		int size=unsortedArray.length;
		for(int i=0; i<size; i++){
			for(int j=0; j<size-i-1; j++){
				if (unsortedArray[j]>unsortedArray[j+1]){
					float temp=unsortedArray[j];
					unsortedArray[j]=unsortedArray[j+1];
					unsortedArray[j+1]=temp;
					isSorted=true;
				}
				if (!isSorted){
					break;
				}
			}
		}
		return unsortedArray;
	}
	//bubble sort for float array	

	public String[] sortString(String[] unsortedArray){
		boolean isSorted=false;
		int size=unsortedArray.length;
		for(int i=0; i<size; i++){
			for(int j=0; j<size-i-1; j++){
				if (compareString(unsortedArray[j], unsortedArray[j+1])==-1){
					String temp=unsortedArray[j];
					unsortedArray[j]=unsortedArray[j+1];
					unsortedArray[j+1]=temp;
					isSorted=true;
				}
				if (!isSorted){
					break;
				}
			}
		}
		return unsortedArray;
	}
	//bubble sort for String array
	
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
