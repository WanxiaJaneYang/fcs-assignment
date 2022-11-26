public class Main {

	public static void main(String[] args) {
		LinearSearch test1=new LinearSearch();
		int[] array1= {4,2,7,3,9};
		int num1=3;
		System.out.println(test(test1.search(array1, num1), 3));
		int[] array2= {7,23,6,1234,7};
		int num2=7;
		System.out.println(test(test1.search(array2, num2), 0));
		int[] array3= {0,6,2,4,6,12,56};
		int num3=6;
		System.out.println(test(test1.search(array3, num3), 1));
		//use method test to test linear search class
		//test three times
		
		BinarySearch binaryTest1=new BinarySearch();
		System.out.println(test(binaryTest1.search(array1, num1), 3));
		System.out.println(test(binaryTest1.search(array2, num2), 4));
		System.out.println(test(binaryTest1.search(array3, num3), 4));
		//use method test to test binary search class
		//test three times
		
		int[] array4= {2,3,4,5,6,7,3,2,1};
		try {
			System.out.println(test(findMaxVal(array4),5));
		} catch (ArrayException e) {
			e.printStackTrace();
		}
		//test of findMaxVal method, use try catch because it may throw an exception
	}
	//main 

	private static boolean test(int result, int ans){
		return result==ans?true:false;
	}
	//method to test the result
	
	private static int findMaxVal(int[] array) throws ArrayException{
		if(array.length==0){
			throw new ArrayException("The array's length is 0.");//to be modified
		}else{
			return binaryFindMax(array, 0, array.length-1);
		}
	}
	//method to find the max value's index
	
	private static int binaryFindMax(int[] array, int start, int end) {
		int size=end-start+1;
		int binaryPoint=(start+end)/2;
		if(size==1) {
			return start;
		}else {
			if(binaryPoint==start) {
				return array[binaryPoint]>array[binaryPoint+1]?binaryPoint:binaryPoint+1;
			}else {
				if(array[binaryPoint]<array[binaryPoint+1]) {
					return binaryFindMax(array, binaryPoint+1, end);
				}else {
					if(array[binaryPoint]<array[binaryPoint-1]) {
						return binaryFindMax(array, start, binaryPoint-1);
					}else {
						return binaryPoint;
					}
				}
			}
		}
	}
	//method to find the max value's index
}

