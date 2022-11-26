public class Fibinacci{
	public int fibinacci(int value){
		if(value==1){
			return 1;
		}else if(value ==2){
			return 1;
		}else{
			return fibinacci(value-1)+fibinacci(value-2);
		}
	}
}
