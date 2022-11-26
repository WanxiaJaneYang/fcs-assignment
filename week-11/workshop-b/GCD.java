public class GCD {
	public int find(int num1, int num2) {
		if(num1==0||num2==0) {
			return 0;
		}else if(num1<0||num2<0) {
			return -1;
		}
		
		if(num2>num1) {
			return find(num2, num1);
		}
		
		if(num1%num2==0) {
			return num2;
		}else {
			int remainder=num1%num2;
			return find(num2, remainder);
		}
	}
	//find the biggest common divider

	public int findDP(int num1, int num2) {
		if(num2>num1) {
			return find(num2, num1);
		}
		//make sure num1>=num2
		
		int[][] dp= new int[num1+1][num2+1];
		
		for(int i=0; i<num1+1; i++) {
			for(int j=0; j<num2+1; j++) {
				if(i==0||j==0) {
					dp[i][j]=0;
				}else if(i%j==0) {
					dp[i][j]=j;
				}else {
					dp[i][j]=dp[j][i%j];
				}
			}
		}		
		return dp[num1][num2];		
	}
	//use dynamic programming to solve the problem
}
