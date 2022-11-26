public class QuickSort extends MySortAlg {

	@Override
	public int[] sort(int[] array) {
		sort(array,0,array.length-1);
		return array;
	}
	//method to use the private sort method

	private void sort(int[] array, int start, int end) {
		if(end<=start) {
			return;
		}else {
			int partitionPoint=getPartitionPoint(array, start, end);
			sort(array, start, partitionPoint);
			sort(array, partitionPoint+1, end);
		}
	}
	
	private int getPartitionPoint(int[] array, int start, int end) {
		int pivotPoint=start;
		while(start<end) {
			while((start<end)&&(array[start]<array[pivotPoint])){
				start++;
			}
			while((start<end)&&(array[end]>=array[pivotPoint])){
				end--;
			}
			swap(array, start, end);
		}
		swap(array, start, pivotPoint);
		return start;
	}
	//method to get the partition point and sort the array according to partition point
	
	private void swap(int[] array, int index1, int index2) {
		int temp=array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}
	//method to swap two elements of the array
}

