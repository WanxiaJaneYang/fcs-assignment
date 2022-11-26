public class Patient {
	private static int totalPatient;
	// The unique id for the patient
	private int id;
	// can be 1-5, from not urgent to resuscitation
	private int triageLevel;
	private String phoneNumber;
	private String name;
	private String location;
	//field
	
	@SuppressWarnings("static-access")
	public Patient(String name, String phoneNumber, int triageLevel, String location) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.triageLevel = triageLevel;
		this.location = location;
		this.totalPatient ++;
		this.id = this.totalPatient;
	}
	//constructor
	
	public String getName() {
		return name;
	}
	//getter of name
	
	public void setName(String name) {
		this.name = name;
	}
	//setter of name
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	//getter of phoneNumber
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	//setter of phoneNumber
	
	public int getTriageLevel() {
		return triageLevel;
	}
	//getter of triageLevel
	
	public void setTriageLevel(int triageLevel) {
		this.triageLevel = triageLevel;
	}
	//setter of triageLevel
	
	public String getLocation() {
		return location;
	}
	//getter of location
	
	public void setLocation(String location) {
		this.location = location;
	}
	//setter of location
	
	public int getId() {
		return this.id;
	}
	//getter of id
}
