//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:02
//===================================

public class Cake{
	private String name;
	private float qtSugar;
	private float qtFlour;
	private float qtYeast;
	private double timePrepare;
	//attributes

	public Cake(){
	}
	//default constructor

	public Cake(String name, float qtSugar, float qtFlour, float qtYeast, double timePrepare){
		this.name=name;
		this.qtSugar=qtSugar;
		this.qtFlour=qtFlour;
		this.qtYeast=qtYeast;
		this.timePrepare=timePrepare;
	}
	//constructor with all parameters

	public void setName(String name){
		this.name=name;
	}
	
	public void setQtSugar(float qtSugar){
		this.qtSugar=qtSugar;
	}
	
	public void setQtFlour(float qtFlour){
		this.qtFlour=qtFlour;
	}
	
	public void setQtYeast(float qtYeast){
		this.qtYeast=qtYeast;
	}
	
	public void setTimePrepare(double timePrepare){
		this.timePrepare=timePrepare;
	}
	//setter for all parameters

	public String getName(){
		return name;
	}

	public float getQtSugar(){
		return qtSugar;
	}
	
	public float getQtFlour(){
		return qtFlour;
	}
	
	public float getQtYeast(){
		return qtYeast;
	}
	
	public double getTimePrepare(){
		return timePrepare;
	}
	//getter for all parameters
}
