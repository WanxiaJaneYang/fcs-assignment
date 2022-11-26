package vehicles;

public abstract class VehicleAbstract implements Vehicle{
	private String name;
	private String color;
	private int year;
	private double numberGears;
	//declare the attributes


	
	public void setColor(String color){
		this.color=color;
	}
	//setter for color

	public void setYear(int year){
		this.year=year;
	}
	//setter for year

	public void setNumberGears(double numberGears){
		this.numberGears=numberGears;
	}
	//setter for numberGears

	public String getColor(){
		return color;
	}
	//getter for color

	public int getYear(){
		return year;
	}
	//getter for year

	public double getNumberGears(){
		return numberGears;
	}
	//getter for numberGears

	public void setName(String name){
		this.name=name;
	}
	//setter for name

	public String getName(){
		return name;
	}
	//getter for name



	public void generateName(){
		name=color + " " + year + " "+numberGears+" gears.";
	}
	//generator for name;

	
	
	public void printInformation(){
		System.out.println(name);
	}
	//printer to show basic information


	public void changeGear(double numberGears){
		this.numberGears=numberGears;
		System.out.printf("The number of gear has been changed to %.2f\n", numberGears);
	}
	//method to change gear

	public void checkBreak(double timeOfBreak){
		System.out.printf("The vehicle need %.2f second to stop.\n", timeOfBreak);
	}
	//method to check break

	

	public VehicleAbstract(){
	}
	//constructor without parameters

	public VehicleAbstract(String color){
		this.color=color;
	}
	//constructor with string color

	public VehicleAbstract(int year){
		this.year=year;
	}
	//constructor with year

	public VehicleAbstract(String color, int year){
		this.color=color;
		this.year=year;
	}
	//constructor with color and year
}
