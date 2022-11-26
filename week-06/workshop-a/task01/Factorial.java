public class Factorial{
	public int factorial(int value){
		if(value<0){
			System.out.println("it should be non negative.");
			return -1;
		}
		else if(value==0){
			return 1;
		}else{
			return factorial(value-1)*value;
		}
	}
}
