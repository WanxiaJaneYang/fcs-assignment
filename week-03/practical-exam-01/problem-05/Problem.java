//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:01
//===================================

public class Problem{
	public static void main(String[] args){
		System.out.println("This is the last line of the code!");
		//print the first line

		int ths =25;
		//put the static value first

		for(int i=0; i<10; i++){
			for (int j=i; j<10;j++){
				for(int k=j;k<10;k++){
					int value =i*j*k;
					if(value!=0){
						if(value % ths==0){
							System.out.print("i: "+i);
							System.out.print(" j: "+ j);
							System.out.println(" k: " + k +" - value "+value);
						}
					}
				}
			}
		}//do the print loop to print only the needed numbers and values

		System.out.println("This is the first line of the code!");
		//finish with last print line
	}
}
