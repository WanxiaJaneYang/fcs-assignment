//==================================
// Foundations of Computer Science
// Student:Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:02
//===================================

public class DebuggingDemo{
	public void bugMethod(){
		int num[] ={1,2,3,4};
		System.out.println(num[3]);
	}
	//the array has only 4 element and the index is from 0 to 3, so 5 is out of the index

	public int bugMethod2(){
		float ans=0.0f;
		System.out.println("This method had a bug!");
		int result=(int)ans;
		return result;
	}
	//the method requires to return an int, but the former version returns a float
}
