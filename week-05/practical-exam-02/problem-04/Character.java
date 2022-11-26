//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:02
//===================================

public class Character{
	private String name;
	private int age;
	private String gender;
	private String occupation;
	private String familyRole;
	private float rate;
	//attributes

	public Character(){
	}
	//defaut constructor
	
	public Character(String name, int age, String gender, String occupation, String familyRole, float rate){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.occupation=occupation;
		this.familyRole=familyRole;
		this.rate=rate;
	}
	//constructor with all parameters

	public void setName(String name){
		this.name=name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setGender(String gender){
		this.gender=gender;
	}
	
	public void setOccupation(String occupation){
		this.occupation=occupation;
	}

	public void setFamilyRole(String familyRole){
		this.familyRole=familyRole;
	}
	
	public void setRate(float rate){
		this.rate=rate;
	}
	// mutators for all parameters

	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	public String getGender(){
		return gender;
	}
	
	public String getOccupation(){
		return occupation;
	}

	public String getFamilyRole(){
		return familyRole;
	}

	public float getRate(){
		return rate;
	}
	//getters for all parameters
}
