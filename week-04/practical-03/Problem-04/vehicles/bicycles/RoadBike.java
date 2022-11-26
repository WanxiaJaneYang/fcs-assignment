package vehicles.bicycles;
import vehicles.*;

public class RoadBike extends Bicycle{
	private String tyres;
	//attribute declared

	

	public void setTyres(String tyres){
		this.tyres=tyres;
	}
	//tyres setter

	public String getTyres(){
		return tyres;
	}
	//getter of tyres


	
	public void checkoutService(){
		System.out.println("The road bike is checked out.");
	}
	//checkout service
	//added for polymorphysm test



	public void generateName(){
		super.generateName();
		String nameToBeAdded="Road bike "+ getName();
		setName(nameToBeAdded);
	}
	//automatic name setter



	public void printInformation(){
		super.printInformation();
		System.out.printf("Tyres:\t%s\n",tyres);	
	}
	//to print information
}
