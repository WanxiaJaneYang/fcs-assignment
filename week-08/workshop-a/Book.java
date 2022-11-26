public class Book {
	private String title;
	private int year;
	//attributes
	
	public String getTitle() {
		return title;
	}
	//getter of title
	
	public void setTitle(String title) {
		this.title = title;
	}
	//setter of title
	
	public int getYear() {
		return year;
	}
	//getter of year
	
	public void setYear(int year) {
		this.year = year;
	}
	//setter of year
	
	public void printBook() {
		System.out.printf("Title:%s\tYear:%d\n", title, year);
	}
	//method to print book
	
	public Book(String title, int year) {
		this.title=title;
		this.year=year;
	}
	//constructor
}

