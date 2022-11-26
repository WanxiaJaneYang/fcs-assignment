package persons;

public class Student extends Person{
	private double[] marks;
	private String[] disciplines;
	//declare the attribute
		


	public void setMarks(double[] marks){
		this.marks=marks;
	}	
	//setter for marks

	public void setDisciplines(String[] disciplines){
		this.disciplines=disciplines;
	}
	//setter for disciplines


	
	public double[] getMarks(){
		return marks;
	}
	//getter for marks

	public String[] getDisciplines(){
		return disciplines;
	}
	//getter for disciplines
		


	public double averageMarks(){
		double averageMark;
		double sum=0;

		for (int i=0;i<marks.length; i++){
			sum=sum+marks[i];
		}
		
		averageMark=sum/marks.length;
		return averageMark;
	}
	//calculate average mark

	public void displayDisciplines(){
		System.out.printf("%s has studied in:", getGivenName());
		for(int i=0; i<disciplines.length; i++){
			System.out.printf("%s ", disciplines[i]);
		}
		System.out.println("");
	}
	//print disciplines



	public Student(){
	}
	
	public Student(String name){
		super(name);
	}
	//constructors
}
