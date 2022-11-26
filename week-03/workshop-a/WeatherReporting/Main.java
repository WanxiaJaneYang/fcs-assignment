import java.io.*;
import java.util.*;

public class Table{
	private int year;
	private int month;
	private int day;
	private float maximumTemperature;
	//set the structure of my table

	
	public void setYear(int year){
		this.year=year;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setMonth(int month){
		this.month=month;
	}

	public int getMonth(){
		return month;
	}

	public void setDay(int day){
		this.day=day;
	}

	public int getDay(){
		return day;
	}

	public void setMaximumTemperature(float maximumTemperature){
		this.maximumTemperature = maximumTemperature;
	}
	
	public float getMaximumTemperature(){
		return maximumTemperature;
	}
	//set the method of setting data and retrieving data	
		
}

public class Main{
	public static void main(String[] args) throws IOException
	{
		

		String name = "./data.csv";
		//store name of the file

		
		
		File fileData = new File(name);
		Scanner fileData =new Scanner(fileData);
		//declare a scanner class to read file
		
		List<Table> tempTable = new ArrayList<>();

		while (fileData.hasNext()){
			Scanner lineOfData = new Scanner(file.Data.nextLine());
			lineOfData.useDelimiter(",");
			Table table = new Table();

			while(lineOfData.hasNext()){
				String data = lineOfScanner.next();

				if(index ==2){
					table.setYear(Integer.parseInt(data));
					}
				else if(index ==3){
					table.setMonth(Integer.parseInt(data));
					}
				else if(index ==4){
					table.setDay(Integer.parseInt(data));
					}
				else if(index ==5){
					table.setMaximumTemperature(Float.parseFloat)
					} 
			}

		}
		

	}
}
