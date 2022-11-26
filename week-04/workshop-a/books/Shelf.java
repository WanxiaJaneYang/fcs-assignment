
public class Shelf{
	public Book[] books;
	private int location=0;

	void setBook(Book bookObj){
		if (location<10){
			books[location]= new Book();
			books[location]=bookObj;
			location++;
		}else{
			System.out.println("Book overload. The book felt on the floor");
		}
	}

	Book getBook(int idBook){
		return books[idBook];
	}

}
