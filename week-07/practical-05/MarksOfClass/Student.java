public class Student {
	private String name;
	private int physicsMark;
	private int chemistryMark;
	private int mathMark;
	private int average;
	
	public void setName(String name) {
		this.name=name;
	}
	//setter for name
	
	public void setPhysicsMark(int physicsMark) {
		this.physicsMark=physicsMark;
	}
	//setter for name
	
	public void setChemistryMark(int chemistryMark) {
		this.chemistryMark=chemistryMark;
	}
	//setter for chemistry
	
	public void setMathMark(int mathMark) {
		this.mathMark=mathMark;
	}
	//setter for mathMark
	
	public String getName() {
		return name;
	}
	//getter for name
	
	public int getPhysicsMark() {
		return physicsMark;
	}
	//getter for physicsMark
	
	public int getChemistryMark() {
		return chemistryMark;
	}
	//getter for chemistryMark
	
	public int getMathMark() {
		return mathMark;
	}
	//getter for mathMark
	
	public void printStudent() {
		System.out.printf("%-7s %-12d %-6d %-9d %-5d\n", name, average, physicsMark, chemistryMark, mathMark);
	}
	//print the information
	
	public Student[] sortStudents(Student[] students) {
		int numberOfStudent = students.length;
		boolean isSwapped=false;
		for(int i=0; i<numberOfStudent; i++) {
			for(int j=0; j<numberOfStudent-1; j++) {
				if(students[j+1].getPhysicsMark()>students[j].getPhysicsMark()) {
					students=swapStudent(students, j, j+1);
					isSwapped=true;
				}else if(students[j+1].getPhysicsMark()==students[j].getPhysicsMark()) {
					if(students[j+1].getChemistryMark()>students[j].getChemistryMark()) {
						students=swapStudent(students, j, j+1);
						isSwapped=true;
					}else if(students[j+1].getChemistryMark()==students[j].getChemistryMark()) {
						if(students[j+1].getMathMark()>students[j].getMathMark()) {
							students=swapStudent(students, j, j+1);
							isSwapped=true;
						}else if(students[j+1].getMathMark()==students[j].getMathMark()) {
							if(stringCompare(students[j+1].getName(),students[j].getName())){
								students=swapStudent(students, j, j+1);
								isSwapped=true;
							}
						}
					}
				}
			}
			if(!isSwapped) {
				break;
			}
		}
		return students;
	}
	//sort the students by marks(descending order), bubble sort
	
	private Student[] swapStudent(Student[] students, int index1, int index2) {
		Student temp =students[index1];
		students[index1]=students[index2];
		students[index2]=temp;
		return students;
	}
	//swap the two student in students array
	
	private boolean stringCompare(String smaller, String bigger) {
		boolean result=true;
		boolean isEqualed=false;
		int size= smaller.length()<bigger.length()?smaller.length():bigger.length();
		for(int i=0; i<size; i++) {
			if(smaller.charAt(i)<bigger.charAt(i)) {
				break;
			}else if(smaller.charAt(i)==bigger.charAt(i)) {
				isEqualed=true;
				continue;
			}else {
				result= false;
				break;
			}
		}
		if(isEqualed && smaller.length()>bigger.length()) {
			result=false;
		}
		return result;
	}
	//compare two strings
	
	public Student() {
		
	}
	//default constructor
	
	public Student(String name, int physicsMark, int chemistryMark, int mathMark) {
		this.name=name;
		this.physicsMark=physicsMark;
		this.chemistryMark=chemistryMark;
		this.mathMark=mathMark;
		average=(physicsMark+chemistryMark+mathMark)/3;
	}
	//constructor that set all the attributes
}

