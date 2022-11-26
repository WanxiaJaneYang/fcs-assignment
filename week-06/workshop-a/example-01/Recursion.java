class Recursion{
	public int sum(int value){
		

		if (value==1){
			return 1;
		}else{
			return sum(value-1)+value;
		}
	}
}

