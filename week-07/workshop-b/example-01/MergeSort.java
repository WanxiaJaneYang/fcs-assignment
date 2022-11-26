public class MergeSort{
	public int[] sortInt(int[] unsortedArray){
		int size = unsortedArray.length;
		if(size>1){
			int[] part1 = new int[size/2];
			int[] part2 = new int[size-size/2];
			for(int i = 0; i<size; i++){
				if(i<size/2){
					part1[i]=unsortedArray[i];
				}else{
					part2[i-size/2]=unsortedArray[i];
				}
			}
			part1 = sortInt(part1);
			part2 = sortInt(part2);
			return merge(part1, part2);
			
		}else{
			return unsortedArray;
		}		
	}
	//merge sort for int array
	
	public float[] sortFloat(float[] unsortedArray){
		int size = unsortedArray.length;
		if(size>1){
			float[] part1 = new float[size/2];
			float[] part2 = new float[size-size/2];
			for(int i = 0; i<size; i++){
				if(i<size/2){
					part1[i]=unsortedArray[i];
				}else{
					part2[i-size/2]=unsortedArray[i];
				}
			}
			part1 = sortFloat(part1);
			part2 = sortFloat(part2);
			return merge(part1, part2);
			
		}else{
			return unsortedArray;
		}
	}
	//merge sort for float array
		
	public String[] sortString(String[] unsortedArray){
		int size = unsortedArray.length;
		if(size>1){
			String[] part1 = new String[size/2];
			String[] part2 = new String[size-size/2];
			for(int i = 0; i<size; i++){
				if(i<size/2){
					part1[i]=unsortedArray[i];
				}else{
					part2[i-size/2]=unsortedArray[i];
				}
			}
			part1 = sortString(part1);
			part2 = sortString(part2);
			return merge(part1, part2);
			
		}else{
			return unsortedArray;
		}
	}
	//merge sort for String array
	
	public int[] merge(int[] part1, int[] part2){
		int[] array = new int[part1.length+part2.length];
		int index1=0, index2=0;
		for(int i=0; i<array.length; i++){
			if((index1<part1.length)&&(index2<part2.length)){
				if(part1[index1]<part2[index2]){
					array[i]=part1[index1];
					index1++;
				}else{
					array[i]=part2[index2];
					index2++;
				}
			}else if(index1==part1.length){
				array[i]=part2[index2];
				index2++;
			}else{
				array[i]=part1[index1];
				index1++;
			}
		}
		return array;
	}
	//merge two sorted array(for int array)

	public float[] merge(float[] part1, float[] part2){
		float[] array = new float[part1.length+part2.length];
		int index1=0, index2=0;
		for(int i=0; i<array.length; i++){
			if((index1<part1.length)&&(index2<part2.length)){
				if(part1[index1]<part2[index2]){
					array[i]=part1[index1];
					index1++;
				}else{
					array[i]=part2[index2];
					index2++;
				}
			}else if(index1==part1.length){
				array[i]=part2[index2];
				index2++;
			}else{
				array[i]=part1[index1];
				index1++;
			}
		}
		return array;
	}
	//merge two sorted array(for float array)

	public String[] merge(String[] part1, String[] part2){
		String[] array = new String[part1.length+part2.length];
		int index1=0, index2=0;
		for(int i=0; i<array.length; i++){
			if((index1<part1.length)&&(index2<part2.length)){
				if(compareString(part1[index1],part2[index2])==1){
					array[i]=part1[index1];
					index1++;
				}else{
					array[i]=part2[index2];
					index2++;
				}
			}else if(index1==part1.length){
				array[i]=part2[index2];
				index2++;
			}else{
				array[i]=part1[index1];
				index1++;
			}
		}
		return array;
	}
	//merge two sorted array(for String array)

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
