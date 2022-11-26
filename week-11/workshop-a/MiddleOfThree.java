public class MiddleOfThree {
	public int getMiddle(int a, int b, int c ) {
		if(((a<b)&&(b<c)) ||((a>b)&&(b>c))){
			return b;
		}else if(((a<c)&&(c<b)) ||((a>c)&&(c>b))) {
			return c;
		}else {
			return a;
		}
	}
	//the first method to find the middle element
	
	public int getMiddle2(int a, int b, int c) {
		while((a>b)||(b>c)) {
			if(a>b) {
				int temp=a;
				a=b;
				b=temp;
			}
			if(b>c){
				int temp=b;
				b=c;
				c=temp;
			}
		}
		return b;
	}
	//the second method to find the middle element
}

