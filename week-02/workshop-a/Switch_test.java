public class Switch_test{
	public static void main(String[] args)
	{
		int weekday = 3;
		String day;
		switch(weekday){
			case 1:
				day = "Sunday";
				break;
			case 2:
				day = "Monday";
				break;
			case 3:
				day = "Tuesday";
				break;
			case 4:
				day = "Wednesday";
				break;
			case 5:
				day = "Thursday";
				break;
			case 6:
				day = "Friday";
				break;
			case 7:
				day  ="Saturday";
				break;
			default:
				day = "Invalid data\n";
				break;
		}
		System.out.println(day);
	}
}
