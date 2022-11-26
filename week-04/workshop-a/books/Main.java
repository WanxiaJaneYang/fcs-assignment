public class Main{
	public static void main(String[] args){
		Shelf literature =new Shelf();
		literature.books =new Book[10];
		
		Book prideAndPrejudice = new Book("Pride and Prejudice");
		Book senseAndSensibility =new Book("Sense and Sensibility");
		Book emma =new Book("Emma");
		Book persuation =new Book("Persuation");
		Book ladySusan=new Book("Lady Susan");
		Book northangerAbbey=new Book("Northanger Abby");
		Book mansfieldPark =new Book("Mansfield Park");
		Book janeEyre =new Book("Jane Eyer");
		Book goneWithTheWind =new Book("Gone with the Wind");
		Book littleWomen = new Book("Little Women");
		Book harryPotter =new Book("Harry Potter and the Philosopher's Stone");

		literature.setBook(prideAndPrejudice);
		literature.setBook(senseAndSensibility);
		literature.setBook(emma);
		literature.setBook(persuation);
		literature.setBook(ladySusan);
		literature.setBook(northangerAbbey);
		literature.setBook(mansfieldPark);
		literature.setBook(janeEyre);
		literature.setBook(goneWithTheWind);
		literature.setBook(littleWomen);
		literature.setBook(harryPotter);

		for(int i=0; i<10;i++){
			System.out.println(literature.getBook(i).getName());
		}
	}
}
