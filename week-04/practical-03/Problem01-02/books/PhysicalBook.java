package books;

public class PhysicalBook extends Book{
	private int shelf;
	private int aisle;
	private int floor;
	//declare the attributions
	


	public void setShelf(int shelf){
		this.shelf=shelf;
	}
	//setter for shelf

	public void setAisle(int aisle){
		this.aisle=aisle;
	}
	//setter for aisle

	public void setFloor(int floor){
		this.floor=floor;
	}
	//setter for floor

	public int getShelf(){
		return shelf;
	}
	//getter for shelf

	public int getAisle(){
		return aisle;
	}
	//getter for aisle

	public int getFloor(){
		return floor;
	}
	//getter for floor



	public void displayLocation(){
		System.out.printf("The %s is in the Floor %d, Aisle %d, Shelf %d.\n", getTitle(), getFloor(), getAisle(), getShelf());
	}
	//display the location



	public PhysicalBook(){
	}
	//constructor without parameter

	public PhysicalBook(String title){
		super(title);
	}
	//constructor using string title
	
}
