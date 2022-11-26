public class QuickSort{
	public int[] sortInt(int[] unsortedArray){
		int size =unsortedArray.length;
		int pivotIndex=size-1;

		if(size<=1){
			return unsortedArray;
		}else{
			int pivot= unsortedArray[pivotIndex];
			int sizeOfSmallArray=getSizeOfSmallArray(unsortedArray, size, pivot);
			while(sizeOfSmallArray==0){
				pivotIndex--;
				if(pivotIndex<0)
					break;
				pivot= unsortedArray[pivotIndex];
				sizeOfSmallArray=getSizeOfSmallArray(unsortedArray, size, pivot);
			}
			if(pivotIndex<0){
				return unsortedArray;
			}else{
				int[] small= new int[sizeOfSmallArray];
				int[] big=new int[size-sizeOfSmallArray];
				int index1=0, index2=0;
				for(int i=0; i<size; i++){
					if(unsortedArray[i]<pivot){
						small[index1]=unsortedArray[i];
						index1++;
					}else{
						big[index2]=unsortedArray[i];
						index2++;
					}
				}
				small =sortInt(small);
				big = sortInt(big);
				return concatenate(small, big);
			}
		}			
	}
	//quick sort for int array
	
	public float[] sortFloat(float[] unsortedArray){
		int size =unsortedArray.length;
		int pivotIndex=size-1;

		if(size<=1){
			return unsortedArray;
		}else{
			float pivot= unsortedArray[pivotIndex];
			int sizeOfSmallArray=getSizeOfSmallArray(unsortedArray, size, pivot);
			while(sizeOfSmallArray==0){
				pivotIndex--;
				if(pivotIndex<0)
					break;
				pivot= unsortedArray[pivotIndex];
				sizeOfSmallArray=getSizeOfSmallArray(unsortedArray, size, pivot);
			}
			if(pivotIndex<0){
				return unsortedArray;
			}else{
				float[] small= new float[sizeOfSmallArray];
				float[] big=new float[size-sizeOfSmallArray];
				int index1=0, index2=0;
				for(int i=0; i<size; i++){
					if(unsortedArray[i]<pivot){
						small[index1]=unsortedArray[i];
						index1++;
					}else{
						big[index2]=unsortedArray[i];
						index2++;
					}
				}
				small =sortFloat(small);
				big = sortFloat(big);
				return concatenate(small, big);
			}
		}
	}
	//quick sort for float array
		
	public String[] sortString(String[] unsortedArray){
		int size =unsortedArray.length;
		int pivotIndex=size-1;

		if(size<=1){
			return unsortedArray;
		}else{
			String pivot= unsortedArray[pivotIndex];
			int sizeOfSmallArray=getSizeOfSmallArray(unsortedArray, size, pivot);
			while(sizeOfSmallArray==0){
				pivotIndex--;
				if(pivotIndex<0)
					break;
				pivot= unsortedArray[pivotIndex];
				sizeOfSmallArray=getSizeOfSmallArray(unsortedArray, size, pivot);
			}
			if(pivotIndex<0){
				return unsortedArray;
			}else{
				String[] small= new String[sizeOfSmallArray];
				String[] big=new String[size-sizeOfSmallArray];
				int index1=0, index2=0;
				for(int i=0; i<size; i++){
					if(compareString(unsortedArray[i],pivot)==1){
						small[index1]=unsortedArray[i];
						index1++;
					}else{
						big[index2]=unsortedArray[i];
						index2++;
					}
				}
				small = sortString(small);
				big = sortString(big);
				return concatenate(small, big);
			}
		}
	}
	//quick sort for String array
	
	public static int getSizeOfSmallArray(int[] unsortedArray, int size, int pivot){
		int count=0;
		for(int i=0; i<size; i++){
			if(unsortedArray[i]<pivot){
				count++;
			}
		}
		return count;
	}
	//method to get the small array's size(int array)

	public static int getSizeOfSmallArray(float[] unsortedArray, int size, float pivot){
		int count=0;
		for(int i=0; i<size; i++){
			if(unsortedArray[i]<pivot){
				count++;
			}
		}
		return count;
	}
	//method to get the small array's size(float array)
	
	public static int getSizeOfSmallArray(String[] unsortedArray, int size, String pivot){
		int count=0;
		for(int i=0; i<size; i++){
			if(compareString(unsortedArray[i],pivot)==1){
				count++;
			}
		}
		return count;
	}
	//method to get the small array's size(string array)

	public static int[] concatenate(int[] smallArray, int[] bigArray){
		int size=smallArray.length+bigArray.length;
		int[] concatenatedArray=new int[size];
		if((smallArray.length!=0)&&(bigArray.length!=0)){
			for(int i=0; i<size; i++){
				if(i<smallArray.length){
					concatenatedArray[i]=smallArray[i];
				}else{
					concatenatedArray[i]=bigArray[i-smallArray.length];
				}
			}
		}else if(smallArray.length==0){
			concatenatedArray=bigArray;
		}else{
			concatenatedArray=smallArray;
		}
		
		return concatenatedArray;
	}
	//method to get the concatenate array(int array)

	public static float[] concatenate(float[] smallArray, float[] bigArray){
		int size=smallArray.length+bigArray.length;
		float[] concatenatedArray=new float[size];
		if((smallArray.length!=0)&&(bigArray.length!=0)){
			for(int i=0; i<size; i++){
				if(i<smallArray.length){
					concatenatedArray[i]=smallArray[i];
				}else{
					concatenatedArray[i]=bigArray[i-smallArray.length];
				}
			}
		}else if(smallArray.length==0){
			concatenatedArray=bigArray;
		}else{
			concatenatedArray=smallArray;
		}
		
		return concatenatedArray;
	}
	//method to get the concatenate array(float array)
	
	public static String[] concatenate(String[] smallArray, String[] bigArray){
		int size=smallArray.length+bigArray.length;
		String[] concatenatedArray=new String[size];
		if((smallArray.length!=0)&&(bigArray.length!=0)){
			for(int i=0; i<size; i++){
				if(i<smallArray.length){
					concatenatedArray[i]=smallArray[i];
				}else{
					concatenatedArray[i]=bigArray[i-smallArray.length];
				}
			}
		}else if(smallArray.length==0){
			concatenatedArray=bigArray;
		}else{
			concatenatedArray=smallArray;
		}
		
		return concatenatedArray;
	}
	//method to get the concatenate array(float array)
	
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
