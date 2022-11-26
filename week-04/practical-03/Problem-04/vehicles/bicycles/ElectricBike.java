package vehicles.bicycles;
import vehicles.*;

public class ElectricBike extends Bicycle{
	private String battery;
	//attribute declared

	
	
	public void chargeBike(){
		System.out.printf("Charging Battery...\nCharging Completed.\n");
	}
	//charge bike method

	public void generateName(){
		super.generateName();
		String nameToBeAdded="Electronic bicycle "+ getName();
		setName(nameToBeAdded);
	}
	//set name by different attribute



	public void setBattery(String battery){
		this.battery=battery;
	}
	//setter for battery	
	
	public String getBattery(){
		return battery;
	}
	//getter of battery
	
	
	
	public void checkoutService(){
		System.out.println("The Eletctric Bike is checked out.");
	}
	//checkout service
	//add for polymorphism



	public void printInformation(){
		super.printInformation();
		System.out.printf("Battery:\t%s\n", battery);
	}
	//to print the information	
}
