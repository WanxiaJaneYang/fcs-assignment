public class LinearSearch extends MySearchAlg {

	@Override
	int search(int[] array, int num) {
		int index=0;
		boolean isFound=false;
		for(int e: array) {
			if(e==num) {
				isFound=true;
				break;
			}
			index++;
		}
		if(isFound) {
			return index;
		}else {
			return -1;
		}
	}
	//linearSearch method: returns the index of the found value when element found, returns -1 when not found
	//if the searched element appears multiple times, return the index of the first one

}

