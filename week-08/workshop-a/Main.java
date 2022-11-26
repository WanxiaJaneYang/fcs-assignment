public class Main {

	public static void main(String[] args) {
		Book books[]=new Book[10];
		books[0]=new Book("Pride & Prejudice", 1813);
		books[1]=new Book("Sense and Sensibility", 1811);
		books[2]=new Book("Northanger Abbey", 1818);
		books[3]=new Book("Mansfield Park", 1814);
		books[4]=new Book("Emma", 1815);
		books[5]=new Book("Persuasion", 1818);
		books[6]=new Book("Le Comte de Monte-Cristo", 1846);
		books[7]=new Book("Les Trois Mousquetaires", 1844);
		books[8]=new Book("The adventures of Robinson Crusoe", 1719);
		books[9]=new Book("Vingt ans après", 1845);
		//create books
		
		LinearSearch test1= new LinearSearch();
		System.out.println("Book Search Result:");
		test1.searchByTitle(books, "Pride & Prejudice").printBook();
		System.out.println("Book Search Result:");
		if(test1.searchByYear(books, 1818).size()==0) {
			System.out.println("not Found.");
		}
		for(Book book:test1.searchByYear(books, 1818)) {
			book.printBook();
		}
		//test of Linear Search
		
		System.out.println("----------------");
		BinarySearch test2= new BinarySearch();
		test2.searchByTitle(books, "Pride & Prejudice").printBook();
		try{
			test2.searchByTitle(books, "Gone With the Wind").printBook();
		}catch(NullPointerException e) {
			System.out.println("Book not found.");
		}
		for(Book foundBook:test2.searchByYear(books, 1818)) {
			foundBook.printBook();
		}
		//test of BinarySearch
	}
}

