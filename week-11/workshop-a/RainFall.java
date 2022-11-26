public class RainFall {
	public void calculateRainFall() {
		System.out.println("Please input the rainfall data:");
		Scanner input=new Scanner(System.in);
		String line=input.nextLine();
		input.close();
		String[] numbers=line.split(",");
		int[] data=new int[numbers.length];
		int count=0;
		for(String number:numbers) {
			int value;
			try {
				value=Integer.parseInt(number);
			}catch(NumberFormatException e) {
				System.out.println("Invalid input");
				break;
			}
			if(value==9999) {
				break;
			}else {
				data[count]=value;
				count++;
			}
		}
		int sum=0;
		for(int i:data) {
			sum=sum+i;
		}
		int average=sum/count;
		System.out.println("The average rainfall on the last "+count+" days  is " +average+ " mm.");
	}
}
