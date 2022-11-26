public class HeapSort extends MySortAlg {
	@Override
	public int[] sort(int[] array) {
		int length=array.length;
		for(; length>1; length--) {
			sortHeap(array,length);
			array=swap(array, 0, length-1);
		}
		return array;
	}
	//heap sort algorithm
	
	private int[] sortHeap(int[] array, int length) {
		int indexLNCE=length/2-1;
		//find the last non-child element
		for(; indexLNCE>=0;indexLNCE--) {
			int indexLC=2*indexLNCE+1;
			//left child index
			int indexRC=2*indexLNCE+2;
			//right child index
			if((indexLC!=length)&&(array[indexLC]>array[indexLNCE]) ){
				array=swap(array, indexLC, indexLNCE);
			}
			if((indexRC!=length)&&(array[indexRC]>array[indexLNCE])){
				array=swap(array, indexRC, indexLNCE);
			}
		}
		return array;
	}
	//build the maxHeap

	private int[] swap(int[] array, int index1, int index2) {
		int temp=array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
		return array;
	}
	//swap the two elements in the array
}
