import java.util.ArrayList;

public class BinarySearch {
	public Book searchByTitle(Book[] books, String title) {
		Book foundBook=null;
		int size=books.length;
		if(size!=1) {
			int binaryPoint=size/2;
			books=sortedByString(books);
			int compare=books[binaryPoint].getTitle().compareTo(title);
			if(compare==0) {
				foundBook=books[binaryPoint];
				return foundBook;
			}else if(compare>0){
				Book[] books1=new Book[binaryPoint];
				for(int i=0;i<binaryPoint; i++) {
					books1[i]=books[i];
				}
				return searchByTitle(books1, title);
			}else {
				Book[] books2=new Book[size-binaryPoint-1];
				for(int j= binaryPoint+1; j<size;j++) {
					books2[j-binaryPoint-1]=books[j];
				}
				return searchByTitle(books2, title);
			}
		}else if(books[0].getTitle().compareTo(title)==0) {
			foundBook=books[0];
			return foundBook;
		}else {
			return foundBook;
		}
	}
	//binary search
	
	private Book[] sortedByString(Book[] books) {
		int size=books.length;
		if(size==1) {
			return books;
		}else {
			int formerSize=size/2;
			int latterSize=size-size/2;
			Book[] former= new Book[formerSize];
			Book[] latter=new Book[latterSize];
			for(int i=0;i<size; i++){
				if(i<formerSize) {
					former[i]=books[i];
				}else {
					latter[i-formerSize]=books[i];
				}
			}
			former=sortedByString(former);
			latter=sortedByString(latter);
			return mergeByString(former, latter);
		}	
	}
	//sorted by string, mergeSort

	private Book[] mergeByString(Book[] former, Book[] latter) {
		int size=former.length+latter.length;
		Book[] books=new Book[size];
		int index1=0, index2=0;
		for(int i=0; i<size; i++) {
			if((index1!=former.length)&&(index2!=latter.length)) {
				if(former[index1].getTitle().compareTo(latter[index2].getTitle())<0) {
					books[i]=former[index1];
					index1++;
				}else{
					books[i]=latter[index2];
					index2++;	
				}
			}else if(index1!=former.length) {
				books[i]=former[index1];
				index1++;
			}else {
				books[i]=latter[index2];
				index2++;
			}
		}
		return books;
	}
	//merge books[] by string
	
	public ArrayList<Book> searchByYear(Book[] books, int year) {
		ArrayList<Book> foundBooks=new ArrayList<>();
		int size=books.length;
		if(size!=1) {
			int binaryPoint=size/2;
			books=sortedByYear(books);
			if(books[binaryPoint].getYear()==year) {
				foundBooks.add(books[binaryPoint]);
				for(int same=binaryPoint-1; same>=0; same--) {
					if(books[same].getYear()==year) {
						foundBooks.add(books[same]);
					}else {
						break;
					}
				}
				for(int same=binaryPoint+1; same<size; same++) {
					if(books[same].getYear()==year) {
						foundBooks.add(books[same]);
					}else {
						break;
					}
				}
				return foundBooks;
			}else if(books[binaryPoint].getYear()<year){
				Book[] books1=new Book[binaryPoint];
				for(int i=0;i<binaryPoint; i++) {
					books1[i]=books[i];
				}
				return searchByYear(books1, year);
			}else {
				Book[] books2=new Book[size-binaryPoint-1];
				for(int j= binaryPoint+1; j<size;j++) {
					books2[j-binaryPoint-1]=books[j];
				}
				return searchByYear(books2, year);
			}
		}else if(books[0].getYear()==year) {
			foundBooks.add(books[0]);
			return foundBooks;
		}else {
			return foundBooks;
		}
	}
	
	private Book[] sortedByYear(Book[] books) {
		int size=books.length;
		if(size==1) {
			return books;
		}else {
			int formerSize=size/2;
			int latterSize=size-size/2;
			Book[] former= new Book[formerSize];
			Book[] latter=new Book[latterSize];
			for(int i=0;i<size; i++){
				if(i<formerSize) {
					former[i]=books[i];
				}else {
					latter[i-formerSize]=books[i];
				}
			}
			former=sortedByYear(former);
			latter=sortedByYear(latter);
			return mergeByYear(former, latter);
		}	
	}
	//sort book[] by year
	
	private Book[] mergeByYear(Book[] former, Book[] latter) {
		int size=former.length+latter.length;
		Book[] books= new Book[size];
		int index1=0, index2=0;
		for(int i=0; i<size; i++) {
			if((index1!=former.length)&&(index2!=latter.length)) {
				if(former[index1].getYear()<latter[index2].getYear()) {
					books[i]=former[index1];
					index1++;
				}else{
					books[i]=latter[index2];
					index2++;	
				}
			}else if(index1!=former.length) {
				books[i]=former[index1];
				index1++;
			}else {
				books[i]=latter[index2];
				index2++;
			}
		}
		return books;
	}
	//merge books by year
}
