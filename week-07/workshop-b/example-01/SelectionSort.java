public class SelectionSort{
	public int[] sortInt(int[] unsortedArray){
		int size=unsortedArray.length;
		int min=unsortedArray[0];
		int index;
		for(int i=0; i<size; i++){
			index=i;
			for(int j=i+1; j<size; j++){
				if(min>unsortedArray[j]){
					index=j;
					min=unsortedArray[j];
				}
			}
			if(index!=i){
				unsortedArray[index]=unsortedArray[i];
				unsortedArray[i]=min;
			}
		}
		return unsortedArray;
	}
	//selection sort for int array

	public float[] sortFloat(float[] unsortedArray){
		int size=unsortedArray.length;
		float min=unsortedArray[0];
		int index;
		for(int i=0; i<size; i++){
			index=i;
			for(int j=i+1; j<size; j++){
				if(min>unsortedArray[j]){
					index=j;
					min=unsortedArray[j];
				}
			}
			if(index!=i){
				unsortedArray[index]=unsortedArray[i];
				unsortedArray[i]=min;
			}
		}
		return unsortedArray;
	}
	//selection sort for float array

	public String[] sortString(String[] unsortedArray){
		int size=unsortedArray.length;
		String min=unsortedArray[0];
		int index=0;
		for(int i=0; i<size; i++){
			index=i;
			for(int j=i+1; j<size; j++){
				if(compareString(min, unsortedArray[j])==-1){
					index=j;
					min=unsortedArray[j];
				}
			}
			if(index!=i){
				unsortedArray[index]=unsortedArray[i];
				unsortedArray[i]=min;
			}
		}
		return unsortedArray;
	}
	//selection sort for String array
	
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
