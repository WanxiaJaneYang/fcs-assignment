package persons;

public class Lecturer extends Person{
	private double salary;
	private String[] disciplines;
	//declare attributes


	
	public void setSalary(double salary){
		this.salary=salary;
	}
	//setter for salary

	public void setDisciplines(String[] disciplines){
		this.disciplines=disciplines;
	}
	//setter for disciplines

	public double getSalary(){
		return salary;
	}
	//getter for salary

	public String[] getDisciplines(){
		return disciplines;
	}
	//getter for disciplines



	public double annualSalary(){
		double annualS=salary*12;
		return annualS;
	}
	//calculate the annual salary

	public void displayDisciplines(){
		System.out.printf("%s teaches in:", getGivenName());

		for (int i=0;i<disciplines.length;i++){
			System.out.print(disciplines[i]+" ");
		}
		System.out.println("");
	}
	//print the disciplines



	public Lecturer(){
	}
	//constructor without parameter

	public Lecturer(String name){
		super(name);
	}
	//constructor with string name
}

