package persons;

public class Patient extends Person{
	private String diagnostic;
	private String inTime;
	private String prevTime;
	//declare the attributes



	public void setDiagnostic(String diagnostic){
		this.diagnostic=diagnostic;
	}
	//setter for diagnostic

	public void setInTime(String inTime){
		this.inTime=inTime;
	}
	//setter for inTime

	public void setPrevTime(String prevTime){
		this.prevTime=prevTime;
	}
	//setter for PrevTime

	public String getDiagnostic(){
		return diagnostic;
	}
	//getter for diagnostic	

	public String getInTime(){
		return inTime;
	}
	//getter for intime

	public String getPrevTime(){
		return prevTime;
	}
	//getter for prevtime

	
	
	public Patient(){
	}
	//constructor without parameter

	public Patient(String name){
		super(name);
	}
	//constructor with string name
}
