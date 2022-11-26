package vehicles.bicycles;
import vehicles.*;

public class MountainBike extends Bicycle{
	private String suspension;
	private String forks;
	//attribute declared


	
	public void setSuspension(String suspension){
		this.suspension=suspension;
	}
	//setter suspension

	public void setForks(String forks){
		this.forks=forks;
	}
	//setter for forks

	public String getSuspension(){
		return suspension;
	}
	//getter for suspension

	public String getForks(){
		return forks;
	}
	//getter for forks

	public void generateName(){
		super.generateName();
		String nameToBeAdded="Mountain bike "+ getName();
		setName(nameToBeAdded);
	}
	//generate name 


	
	public void checkoutServce(){
		System.out.println("The Mountain Bike is checked out.");
	}
	//checkout service
	//added for polymorphism



	public void printInformation(){
		super.printInformation();
		System.out.printf("Suspension:\t%s\n", suspension);
		System.out.printf("Forks:\t%s\n", forks);
	}
	//to print the information	
}
