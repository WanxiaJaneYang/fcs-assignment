public class TruckLoad {
	public int solve(int pile, int truckSize) {
		if(pile==0) {
			return 0;
		}
		if(truckSize==0) {
			return -1;
		}
		//case of exceptions
		
		if(pile<=truckSize) {
			return 1;
		}else {
			int firstPile=pile/2;
			int secondPile=pile-pile/2;
			return solve(firstPile, truckSize)+solve(secondPile, truckSize);
		}
	}
	//recursive method
	
	public int solveDP(int pile, int truckSize) {
		if(pile==0) {
			return 0;
		}
		if(truckSize==0) {
			return -1;
		}
		//case of exceptions
		
		int[][] dp= new int[pile+1][truckSize+1];
		//instantiate the dynamic array to save the result
		
		for(int i=1;i<pile+1; i++) {
			for(int j=1; j<truckSize+1;j++) {
				if(i<=j) {
					dp[i][j]=1;
				}else {
					dp[i][j]=dp[i/2][j]+dp[i-i/2][j];
				}
			}
		}
		//loop to get the array
		
		return dp[pile][truckSize];
	}
	//dynamic programming method 
}
