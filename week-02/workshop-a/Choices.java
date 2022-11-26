public class Choices{
	public static void main(String[] args){
		int[] myList = new int[5];
		myList[0] = 4;
		myList[1] = 8;
		myList[2] = -3;
		myList[3] = -5;
		myList[4] = 2;

		for(int i=0; i<5; i=i+1){
			if (myList[i] > 0){
				System.out.println("+ "+myList[i]);
				}
			else{
				myList[i]=0-myList[i];
				System.out.println("- "+myList[i]);
			}

			
		}
	}
}
