package vehicles.bicycles;
import vehicles.*;

public class Hibrid extends Bicycle{
	private String suspension;
	//attribute declared


	
	public void setSuspension(String suspension){
		this.suspension=suspension;
	}
	//setter for suspension

	public String getSuspension(){
		return suspension;
	}
	//getter for suspension

	public void generateName(){
		super.generateName();
		String nameToBeAdded="Hibrid bicycle "+ getName();
		setName(nameToBeAdded);
	}
	//generate name by using other attribute


	
	public void checkoutService(){
		System.out.println("The hibrid is checked out.");
	}
	//checkout service
	//added for polymorphysm test



	public void printInformation(){
		super.printInformation();
		System.out.printf("Suspension:\t%s\n", suspension);
	}
	//to print the information	
}
