public class LuckyNumber {
	public boolean isLuckyNum(int num) {
		while(num!=0) {
			int digit=num%10;
			num=num/10;
			if(!isLucky(digit)) {
				System.out.println(false);
				return false;
			}else {
				
				continue;
			}
		}
		System.out.println(true);
		return true;
	}
	
	private boolean isLucky(int num) {
		if((num==2)||(num==6)||(num==8)) {
			return true;
		}else
			return false;
	}
}
