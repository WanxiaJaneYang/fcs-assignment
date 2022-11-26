import java.util.Arrays;

public class MergeSort extends MySortAlg{
	@Override
	int[] sort(int[] array) {
		int size=array.length;
		if(size>1) {
			int formerSize=size/2;
			int latterSize=size-size/2;
			int[] formerArray=getFormerArray(array,formerSize);
			int[] latterArray=getLatterArray(array, latterSize);
			formerArray= sort(formerArray);
			latterArray=sort(latterArray);
			array=Merge(formerArray, latterArray);
		}
		return array;
	}
	//the merge sort algorithm

	private int[] Merge(int[] formerArray, int[] latterArray) {
		int size=formerArray.length+latterArray.length;
		int[] array=new int[size];
		int indexF=0, indexL=0;
		for(int i=0; i<size; i++) {
			if(indexF<formerArray.length && indexL<latterArray.length) {
				if(formerArray[indexF]<latterArray[indexL]) {
					array[i]=formerArray[indexF];
					indexF++;
				}else {
					array[i]=latterArray[indexL];
					indexL++;
				}
			}else if(indexF==formerArray.length) {
				array[i]=latterArray[indexL];
				indexL++;
			}else if(indexL==latterArray.length){
				array[i]=formerArray[indexF];
				indexF++;
			}
		}
		return array;
	}
	//the method to merge two parts of the array

	private int[] getLatterArray(int[] array, int latterSize) {
		int[] latterArray=new int[latterSize];
		int formerSize=array.length-latterSize;
		for(int i=formerSize;i<array.length;i++) {
			latterArray[i-formerSize]=array[i];
		}
		return latterArray;
	}
	//get the former part of the array

	private int[] getFormerArray(int[] array, int formerSize) {
		int[] formerArray=new int[formerSize];
		for(int i=0; i<formerSize; i++) {
			formerArray[i]=array[i];
		}
		return formerArray;
	}
	//get the latter part of the array
}
