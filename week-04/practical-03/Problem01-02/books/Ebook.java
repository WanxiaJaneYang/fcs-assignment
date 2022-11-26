package books;

public class Ebook extends Book{
	private String url;
	//set url attribute



	public void setUrl(String url){
		this.url=url;
	}
	//setter for url
	
	public String getUrl(){
		return url;
	}
	//getter of url
	
	
	
	public Ebook(){
	}
	//constructor without parameters

	public Ebook(String title){
		super(title);
	}	
	//constructor with string title

	public Ebook(String title, int year){
		super(title, year);
	}
	//constructor with string title and int year
}
