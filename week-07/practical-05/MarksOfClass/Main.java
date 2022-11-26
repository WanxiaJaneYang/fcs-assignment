import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName="./students.txt";
		Student[] students=readFile(fileName);
		Student sort= new Student();
		students=sort.sortStudents(students);
		System.out.println("Student AverageScore Physic Chemistry Maths");
		for(Student student: students) {
			student.printStudent();
		}
	}
	//main program:read file, get students array, sort the array and print it
	
	public static Student[] readFile(String fileName) throws FileNotFoundException {
		File file =new File(fileName);
		BufferedReader br =new BufferedReader(new FileReader(file));
		int countLine=0;
		String st="";
		try {
			while((st= br.readLine())!=null) {
				countLine++;				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//get the number of students

		Student[] students=new Student[countLine];
		//create students to store the array;
		
		BufferedReader br2 =new BufferedReader(new FileReader(file));
		int i=0;
		try {
			while((st= br2.readLine())!=null) {
				if(i<countLine) {
					String[] strings = st.split(" ");
					students[i]=new Student(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]),Integer.parseInt(strings[3]));
					i++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//store the student one by one

		return students;
	}
	//method to read a file according to file name and save as students array
}

