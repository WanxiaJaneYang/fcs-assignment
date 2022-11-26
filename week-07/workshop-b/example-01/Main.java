import java.util.*;

public class Main{
	public static void main(String[] args){
		int[] integers = {6,3,7,3,1};
		float[] floats = {4.2f, 3.9f, 4.2f, 3.2f,7.3f};
		String[] strings ={"miss", "afront", "bee", "candy", "dean"};
		BubbleSort test1 = new BubbleSort();
		InsertionSort test2 = new InsertionSort();
		SelectionSort test3 = new SelectionSort();
		QuickSort test4 = new QuickSort();
		MergeSort test5 = new MergeSort();
		System.out.println(Arrays.toString(test1.sortInt(integers)));
		System.out.println(Arrays.toString(test1.sortFloat(floats)));
		System.out.println(Arrays.toString(test1.sortString(strings)));
		System.out.println(Arrays.toString(test2.sortInt(integers)));
		System.out.println(Arrays.toString(test2.sortFloat(floats)));
		System.out.println(Arrays.toString(test2.sortString(strings)));
		System.out.println(Arrays.toString(test3.sortInt(integers)));
		System.out.println(Arrays.toString(test3.sortFloat(floats)));
		System.out.println(Arrays.toString(test3.sortString(strings)));
		System.out.println(Arrays.toString(test4.sortInt(integers)));
		System.out.println(Arrays.toString(test4.sortFloat(floats)));
		System.out.println(Arrays.toString(test4.sortString(strings)));
		System.out.println(Arrays.toString(test5.sortInt(integers)));
		System.out.println(Arrays.toString(test5.sortFloat(floats)));
		System.out.println(Arrays.toString(test5.sortString(strings)));
	}
}
