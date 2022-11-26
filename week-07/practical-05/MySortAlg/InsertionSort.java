public class InsertionSort extends MySortAlg {
	@Override
	int[] sort(int[] array) {
		int size = array.length;
		if (size>1) {
			for(int keyIndex=1; keyIndex<size; keyIndex++) {
					int key=array[keyIndex];
					int i=keyIndex-1;
					for(; i>=0; i--) {
						if(array[i]>key) {
								array[i+1]=array[i];	
						}else {
							break;
						}
					}
					array[i+1]=key;
			}		
		}
		return array;
	}
	//sort from small to big
}
