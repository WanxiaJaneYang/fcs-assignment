//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:02
//===================================

public class Car{
	private String model;
	private int numGears;
	private float literTank;
	private int yearManufacture;
	private int mileage;
	//attributes

	public Car(){
	}
	//default constructor

	public Car(String model, int numGears, float literTank, int yearManufacture, int mileage){
		this.model=model;
		this.numGears=numGears;
		this.literTank=literTank;
		this.yearManufacture=yearManufacture;
		this.mileage=mileage;
	}
	//constructor with all parameters

	public void setModel(String model){
		this.model=model;
	}
	
	public void setNumGears(int numGears){
		this.numGears=numGears;
	}
	
	public void setLiterTank(float literTank){
		this.literTank=literTank;
	}
	
	public void setYearManufacture(int yearManufacture){
		this.yearManufacture=yearManufacture;
	}
	
	public void setMileage(int mileage){
		this.mileage=mileage;
	}
	//setter for all parameters
	
	public String getModel(){
		return model;
	}
	
	public int getNumGears(){
		return numGears;
	}
	
	public float getLiterTank(){
		return literTank;
	}
	
	public int getYearManufacture(){
		return yearManufacture;
	}
	
	public int getMileage(){
		return mileage;
	}
	//getter for all parameters
}
