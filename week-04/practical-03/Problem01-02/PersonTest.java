import persons.*;

public class PersonTest{
	public static void main(String[] args){
		Person andy =new Person("Andy","Smith",27);
		System.out.printf("%s %s is %d years old.\n", andy.getGivenName(), andy.getLastName(), andy.getAge());
		andy.setGender("male");
		andy.setCitizenship("British");
		System.out.printf("%s is a %s %s.\n", andy.getGivenName(), andy.getGender(), andy.getCitizenship());
		//test of class Person

		Student lily = new Student("Lily");
		lily.setLastName("Evans");
		double[] lilyMarks={98,94,92,58,39};
		lily.setMarks(lilyMarks);
		String[] lilyDisciplines={"Math", "English", "Geology", "Biology", "Sociology"};
		lily.setDisciplines(lilyDisciplines);
		lily.displayDisciplines();
		System.out.printf("The average mark of %s %s is %.2f\n", lily.getGivenName(), lily.getLastName(), lily.averageMarks());
		//test of Class Student

		Lecturer confucius =new Lecturer("Confucius");
		confucius.setAge(72);
		confucius.setSalary(8000);
		System.out.printf("The annual salary of %s is $%.2f\n", confucius.getGivenName(), confucius.annualSalary());
		String[] confuciusDisciplines={"Literarture", "Etiquette", "Driving", "Archery"};
		confucius.setDisciplines(confuciusDisciplines);
		confucius.displayDisciplines();
		//test of Class Lecturer
		
		Patient james=new Patient("James");
		james.setGender("Male");
		james.setDiagnostic("Diabetes");
		System.out.printf("%s was diagnosed with %s\n", james.getGivenName(), james.getDiagnostic());
		//test of Class Patient

		Doctor strange= new Doctor("Stephan");
		strange.setLastName("Strange");
		strange.setSpeciality("Neurosurgery");
		System.out.printf("Dr %s specializes in %s\n", strange.getLastName(), strange.getSpeciality());
		//test of Class Doctor
	}
}
