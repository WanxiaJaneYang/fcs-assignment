import books.*;

public class BookTest{
	public static void main(String[] args){
		Book headFirstJava =new Book("Head First Java", 2005);
		headFirstJava.setPublish("O'Reilly Media Inc");
		headFirstJava.setPages(722);
		System.out.printf("%s is published by %s in the year of %d, it has %d pages.\n", headFirstJava.getTitle(), headFirstJava.getPublish(), headFirstJava.getYear(), headFirstJava.getPages());
		//test of Class Book

		Ebook projectManagement= new Ebook("Project Management", 2010);
		projectManagement.setUrl("https://myuni.adelaide.edu.au/courses/74996/assignments/267719");
		System.out.printf("You can find %s in the %s\n", projectManagement.getTitle(), projectManagement.getUrl());
		//test of Class Ebook

		PhysicalBook algorithm = new PhysicalBook("Data Structure and Algorithms");
		algorithm.setFloor(3);
		algorithm.setShelf(7);
		algorithm.setAisle(4);
		algorithm.displayLocation();
		//test of PysicalBook
	}
}

