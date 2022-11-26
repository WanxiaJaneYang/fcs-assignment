//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:02
//===================================

public class Calculator{
	public int sum(int numA, int numB){
		int sum=0;
		sum=numA+numB;
		return sum;
	}
	//sum method

	public float cube(float num){
		float cube=num*num*num;
		return cube;
	}
	//cube method

	public float division(float numA, float numB){
		float result=0;
		if(numB==0){
			result=(float)-99.9;
		}else{
			result=numA/numB;
		}
		return result;
	}
		
}
