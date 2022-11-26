import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array1= {3,7,4,1,6};
		int[] ans1= {1,3,4,6,7};
		int[] array2 = {3,8,4,9,2};
		int[] ans2= {2,3,4,8,9};
		int[] array3= {2,4,1,2,3};
		int[] ans3= {1,2,2,3,4};
		InsertionSort test1 = new InsertionSort();
		System.out.println("Test of Insertion Sort, print true when the sort algoirthm works.");
		System.out.println(test(ans1, test1.sort(array1)));
		System.out.println(test(ans2, test1.sort(array2)));
		System.out.println(test(ans3, test1.sort(array3)));
		//use method test to test the insertionSort
		//test three times
		
		System.out.println("------------------");
		int[] array4= {3,7,4,1,6};
		int[] ans4= {1,3,4,6,7};
		int[] array5 = {3,8,4,9,2};
		int[] ans5= {2,3,4,8,9};
		int[] array6= {2,4,1,2,3};
		int[] ans6= {1,2,2,3,4};
		MergeSort test2=new MergeSort();
		System.out.println("Test of Merge Sort, print true when the sort algoirthm works.");
		System.out.println(test(ans4, test2.sort(array4)));
		System.out.println(test(ans5, test2.sort(array5)));
		System.out.println(test(ans6, test2.sort(array6)));
		//use method test to test the Merge sort
		//test three times
		
		System.out.println("------------------");
		int[] array7= {3,7,4,1,6};
		int[] ans7= {1,3,4,6,7};
		int[] array8 = {3,8,4,9,2};
		int[] ans8= {2,3,4,8,9};
		int[] array9= {2,4,1,2,3};
		int[] ans9= {1,2,2,3,4};
		QuickSort test3= new QuickSort();
		System.out.println("Test of Quick Sort, print true when the sort algoirthm works.");
		System.out.println(test(ans7, test3.sort(array7)));
		System.out.println(test(ans8, test3.sort(array8)));
		System.out.println(test(ans9, test3.sort(array9)));
		//use the method test to test the quick sort 
		//test three times
		
		System.out.println("------------------");
		int[] array10= {3,7,4,1,6};
		int[] ans10= {1,3,4,6,7};
		int[] array11 = {3,8,4,9,2};
		int[] array12= {2,4,1,2,3};
		System.out.println("Test of Compare Method and should print: true, false, false");
		System.out.println(compare(array10, ans10));
		System.out.println(compare(array11, array12));
		System.out.println(compare(array10, array12));
		//test the three compare methods
		//test three times
		
		System.out.println("------------------");
		int[] array13= {3,7,4,1,6};
		System.out.printf("The smallest sum of %s is %d\n", Arrays.toString(array13), findSmallestSum(array13));
		//test of find smallest sum
		
		System.out.println("------------------");
		int[] array14= {5,2,3,4,56};
		int[] ans14= {2,3,4,5,56};
		int[] array15= {3,7,4,1,6};
		int[] ans15= {1,3,4,6,7};
		int[] array16 = {2,8,4,9,2};
		int[] ans16= {2,2,4,8,9};
		ShellSort test4= new ShellSort();
		System.out.println("Test of Heap Sort, print true when the sort algoirthm works.");
		System.out.println(test(ans14, test4.sort(array14)));
		System.out.println(test(ans15, test4.sort(array15)));
		System.out.println(test(ans16, test4.sort(array16)));
		//test of shell sort
		
		System.out.println("------------------");
		int[] array17= {3,7,4,1,6};
		int[] ans17= {1,3,4,6,7};
		int[] array18 = {3,8,4,9,2};
		int[] ans18= {2,3,4,8,9};
		int[] array19= {2,4,1,2,3};
		int[] ans19= {1,2,2,3,4};
		HeapSort test5=new HeapSort();
		System.out.println("Test of Heap Sort, print true when the sort algoirthm works.");
		System.out.println(test(ans17, test5.sort(array17)));
		System.out.println(test(ans18, test5.sort(array18)));
		System.out.println(test(ans19, test5.sort(array19)));
		//test of heap sort 
		//test three times
	}
	//main part, test of each class and method
	
	public static boolean test(int[] array, int[] ans) {
		boolean result=Arrays.equals(array, ans);
		return result;
	}
	//test method as required

	public static boolean compare(int[] array1, int[] array2) {
		ShellSort instance = new ShellSort();
		array1=instance.sort(array1);
		array2=instance.sort(array2);
		boolean result=test(array1,array2);
		
		return result;
	}
	//compare method as required
	
	public static int findSmallestSum(int[] array) {
		if(array.length==0) {
			return 0;
		}else if(array.length==1) {
			return array[0];
		}else {
			HeapSort instance = new HeapSort();
			array=instance.sort(array);
			return array[0]+array[1];
		}
	}
	//method of find the smallest sum
}

