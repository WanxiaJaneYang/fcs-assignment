import java.util.ArrayList;

public class LinearSearch {
	public Book searchByTitle(Book[] books, String title) {
		Book foundBook = null;
		for(Book book: books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
				foundBook=book;
				break;
			}
		}
		return foundBook;
	}
	//search by title
	
	public ArrayList<Book> searchByYear(Book[] books, int year){
		ArrayList<Book> foundBooks=new ArrayList<>();
		for(Book book:books) {
			if(book.getYear()==year) {
				foundBooks.add(book);
			}
		}
		return foundBooks;
	}
	//search by year
}
