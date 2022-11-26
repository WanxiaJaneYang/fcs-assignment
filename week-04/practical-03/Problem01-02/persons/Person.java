package persons;

public class Person{
	private String givenName;
	private String lastName;
	private int age;
	private String gender;
	private String citizenship;
	//declare attribute


	public Person(){
	}
	//constructor without parameter

	public Person(String givenName){
		this.givenName=givenName;
	}
	//constructor with string givenName

	public Person(String givenName, String lastName){
		this.givenName=givenName;
		this.lastName=lastName;
	}	
	//constructor with full name

	public Person(String givenName, String lastName, int age){
		this.givenName=givenName;
		this.lastName=lastName;
		this.age=age;
	}
	//constructor with full name and age

	
	public void setName(String givenName, String lastName){
		this.givenName=givenName;
		this.lastName=lastName;
	}
	//setter for full name

	public void setGivenName(String givenName){
		this.givenName=givenName;
	}
	//setter for given name

	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	//setter for last name

	
	public String getGivenName(){
		return givenName;
	}
	//getter for first name
	
	public String getLastName(){
		return lastName;
	}
	//getter for last name


	public void setAge(int age){
		this.age=age;
	}	
	//getter for age

	public int getAge(){
		return this.age;
	}
	//getter of age

	
	public void setGender(String gender){
		this.gender=gender;
	}	
	//setter for gender

	public String getGender(){
		return gender;
	}
	//getter gender

	public void setCitizenship(String citizenship){
		this.citizenship=citizenship;
	}
	//setter for citizenship	
	
	public String getCitizenship(){
		return citizenship;
	}
	//getter for citizenship
	
}
