package books;

public class Book{
	private String title;
	private int year;
	private String publish;
	private int pages;
	//decalre attribute


	public Book(){}
	//constructor without parameters

	public Book(String title){
		this.title=title;
	}
	//constructor with string title

	public Book(String title, int year){
		this.title=title;
		this.year=year;
	}
	//contructor with string title and int year



	public void setTitle(String title){
		this.title=title;
	}	
	//setter for title

	public String getTitle(){
		return title;
	}
	//getter for title

	public void setYear(int year){
		this.year=year;
	}
	//setter for year

	public int getYear(){
		return year;
	}
	//getter for year

	public void setPublish(String publish){
		this.publish=publish;
	}
	//setter for publish

	public String getPublish(){
		return publish;
	}
	//getter for publish

	public void setPages(int pages){
		this.pages=pages;
	}
	//setter for pages

	public int getPages(){
		return pages;
	}
	//getter for pages
	
}
