package vehicles.bicycles;
import vehicles.*;

public class Bicycle extends VehicleAbstract{

	private boolean is_serviced;
	private String inDate;
	private String outDate;
	private String serviceResponsible;
	//attributes declared

	public void setIsServiced(boolean is_serviced){
		this.is_serviced=is_serviced;
	}
	// setter for is_serviced

	public void setInDate(String inDate){
		this.inDate=inDate;
	}
	//setter for indate

	public void setOutDate(String outDate){
		this.outDate=outDate;
	}
	//setter for outDate

	public void setServiceResponsible(String serviceResponsible){
		this.serviceResponsible=serviceResponsible;
	}
	//setter for serviceResponsible

	public boolean getIsServiced(){
		return is_serviced;
	}
	//getter for is serviced

	public String getServiceResponsible(){
		return serviceResponsible;
	}
	//getter for service responsible

	public String getInDate(){
		return inDate;
	}
	//getter for indate

	public String getOutDate(){
		return outDate;
	}
	//getter for out date



	public void checkoutService(){
		System.out.println("The Bicycle is checked out.");
	}
	//method to checkout
	


	public void printInformation(){
		super.printInformation();
		System.out.printf("Is serviced or not(true for yes and false for no):\t%b\n", is_serviced);
		System.out.printf("In Date:\t%s\n", inDate);
		System.out.printf("Out Date:\t%s\n", outDate);
		System.out.printf("Service Responsible:\t%s\n", serviceResponsible);
	}
	//to print the basic information


	
	public Bicycle(){
	}
	//consstructor without parameter

	public Bicycle(String color){
		super(color);
	}
	//constructor with color

	public Bicycle(String color, int year){
		super(color, year);
	}
	//constructor with year and color
}
