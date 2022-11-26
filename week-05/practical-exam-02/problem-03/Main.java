//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:02
//===================================

public class Main{
	public static void main(String[] args){
		HandlingArrays test1=new HandlingArrays();
		double[] array1={1.0,2.0,3.0,4.0};
		test1.printArray(array1);
		//test the print array

		double[] array2={1.0,2.0,3.0};
		double[] array3={3.0,4.0,6.0};
		double[] array4={3.0,4.0};
		test1.printArray(test1.sumElements(array2,array3));
//		test1.printArray(test1.sumElements(array2,array4));
		//test the sumElement methd

		double[] array5={1.0,3.0,5.0};
		double[] array6={3.0,4.0,2.0};
		test1.printArray(test1.maxArrays(array5,array6));
//		test1.printArray(test1.maxArrays(array5,array4));
		//test the maxArray

		double[] array7={1.0,5.0,3.0};
		double[] array8={3.0,4.0,6.0};
		test1.printArray(test1.maxAnyArrays(array7, array8));
		double[] array9={3.0,4.0,6.0,7.0};
		test1.printArray(test1.maxAnyArrays(array7,array9));
		//test the maxAnyArray
	}
}
