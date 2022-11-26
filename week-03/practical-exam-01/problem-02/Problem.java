//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id:a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:01
//===================================

public class Problem{
	public static void main(String[] args){

		System.out.printf("[");
		//print the first half [

		for(int i=10; i<=30;i=i+2){
			System.out.printf("%d",i);
			if (i<30){
				System.out.print(", ");
			}
		}
		//print the number with",", except the last number
 
		System.out.print("]");
		//print the last half "]"
	}
}
