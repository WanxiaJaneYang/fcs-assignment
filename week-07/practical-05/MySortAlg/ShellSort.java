public class ShellSort extends MySortAlg {
	@Override
	public int[] sort(int[] array) {
		int size= array.length;
		float gap= size/2;
		while(gap>=1) {
			int key;
			for(int indexKey=(int)gap; indexKey<size; indexKey+=gap) {
				key= array[indexKey];
				for(int i=indexKey-(int)gap; i>=0; i-=gap) {
					if(key<array[i]) {
						array[i+(int)gap]=array[i];
						array[i]=key;
					}
				}
			}
			gap=gap/2;
		}
		return array;
	}
	//method of shell sort
}
