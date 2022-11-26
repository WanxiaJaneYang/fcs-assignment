public class Book{
	private String name;
	private int pagesNum;
	
	void setName(String name){
		this.name=name;
	}
	
	String getName(){
		return name;
	}

	void setPageNum(int pNum){
		this.pagesNum=pNum;
	}

	int getPageNum(){
		return pagesNum;
	}
	
	public Book(String name){
		this.name=name;
	}

	public Book(){}
}
