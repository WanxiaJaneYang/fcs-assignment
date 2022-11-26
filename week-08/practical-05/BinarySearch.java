import java.util.HashMap;

public class BinarySearch extends MySearchAlg {

	@Override
	public int search(int[] array, int num) {
		int index;
		HashMap<Integer, Integer> hashmap=new HashMap<Integer, Integer>();
		for(int i=0;i<array.length;i++) {
			hashmap.put(array[i], i);
		}
		array=sortInt(array);
		int end=array.length-1;
		boolean isFound=binarySearch(array, num, 0, end);
		if(isFound) {
			index=hashmap.get(num);
		}else {
			index=-1;
		}
		return index;
	}
	//method to find the index of the searched element
	//if the searched element appears multiple times, return the index of the last one
	
	private boolean binarySearch(int[] array, int num, int start, int end) {
		boolean isFound=false;
		int size= end-start;
		if(size<0) {
			return isFound;
		}else if(size==0) {
			if(array[start]==num) {
				isFound=true;
				return isFound;
			}else
				return isFound;
		}else {
			int binaryPoint=(start+end)/2;
			if(array[binaryPoint]<num) {
				return binarySearch(array, num, binaryPoint+1, end);
			}else if(array[binaryPoint]>num) {
				return binarySearch(array, num, start, binaryPoint-1);
			}else {
				isFound=true;
				return isFound;
			}
		}
	}
	//method to use binary search
	
	private int[] sortInt(int[] array) {
		int size=array.length;
		if(size<=1) {
			return array;
		}else {
			for(int i=0; i<size; i++) {
				array=sortHeap(array, size-i);
				array=swap(array, 0, size-i-1);
			}
			return array;
		}
	}
	//heap sort

	private int[] swap(int[] array, int i, int j) {
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
		return array;
	}
	//method to swap

	private int[] sortHeap(int[] array, int length) {
		int nonChildElement=length/2-1;
		for(;nonChildElement>=0; nonChildElement--) {
			int leftChild=2*nonChildElement+1;
			int rightChild=2*nonChildElement+2;
			if((array[leftChild]>array[nonChildElement])&&(leftChild!=length)) {
				array=swap(array, leftChild, nonChildElement);
			}
			if((array[rightChild]>array[nonChildElement])&&(rightChild!=length)) {
				array=swap(array, rightChild, nonChildElement);
			}
		}
		return array;
	}
	//sort heap as max heap
}

