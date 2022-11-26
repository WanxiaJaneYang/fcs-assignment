package persons;

public class Doctor extends Person{
	private String speciality;
	//declare the atrribute



	public void setSpeciality(String speciality){
		this.speciality=speciality;
	}
	//setter for speciality

	public String getSpeciality(){
		return speciality;
	}
	//getter of the speciality



	public Doctor(){
	}
	//constructor without parameters

	public Doctor(String name){
		super(name);
	}
	//constructor with String name
}
