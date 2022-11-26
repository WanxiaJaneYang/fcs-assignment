/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a1866893
*   student (name): Wanxia Yang
*
* Note: in order to finish your exam you need to make changes in this class
* Problem 03
*/
public class Selection extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){
		int[] index=this.getIndex(arr.length);
		int size=arr.length;
		for(int i=0; i<size; i++){
			int minIndex=findMin(arr, i);
			swap(arr, minIndex, i);
			swap(index, minIndex, i);	
		}
		return index;
	}
	//sort int by index

	@Override
	public int [] sortInt(int [] arr){
		int size=arr.length;
		for(int i=0; i<size; i++){
			int minIndex=findMin(arr, i);
			swap(arr, minIndex, i);	
		}
		return arr;
	}
	//sort int 
	
	private int findMin(int[] array, int start){
		int min=start;
		for(int i=start; i<array.length; i++){
			if(array[min]>array[i]){
				min=i;
			}
		}
		return min;
	}
	//find the smallest in the given range
	
	private int findMin(String[] array, int start){
		int min=start;
		for(int i=start; i<array.length; i++){
			if(array[min].compareTo(array[i])>0){
				min=i;
			}
		}
		return min;
	}
	//find the smallest in the string array
	
	private void swap(String[] array, int index1, int index2){
		String temp=array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}
	//to swap two elements in a String array

	private void swap(int[] array, int index1, int index2){
		int temp=array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}
	//to swap two elements in an array

	@Override
	public int [] sortStringByIndex(String [] arr){
		int[] index=this.getIndex(arr.length);
		int size=arr.length;
		for(int i=0; i<size; i++){
			int minIndex=findMin(arr, i);
			swap(arr, minIndex, i);
			swap(index, minIndex, i);	
		}
		return index;
	}
	//sort string by index

	@Override
	public String [] sortString(String [] arr){
		int size=arr.length;
		for(int i=0; i<size; i++){
			int minIndex=findMin(arr, i);
			swap(arr, minIndex, i);	
		}
		return arr;
	}
}
