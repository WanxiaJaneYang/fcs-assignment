package animals;

public class Animal{
	private String name;
	private double weight;
	private String favoriteFood;
	private int age;
	//declare all the attributes



	public Animal(){
	}
	//constructor without parameters

	public Animal(String name){
		this.name=name;
	}		
	//constructor with a string parameter to set name

	public Animal(String name, double weight){
		this.name=name;
		this.weight=weight;
	}
	//constructors with a string parameter to set name and a double parameter to set weight



	public void setName(String name){
		this.name=name;
	}
	//setter for name

	public void setWeight(double weight){
		this.weight=weight;
	}
	//setter for weight	
	
	public void setAge(int age){
		this.age=age;
	}
	//setter for age
	
	public void setFavoriteFood(String favoriteFood){
		this.favoriteFood=favoriteFood;
	}
	//setter for favoriteFood



	public String getName(){
		return name;
	}
	//getteg for name

	public double getWeight(){
		return weight;
	}
	//getter for weight
	
	public String getFavoriteFood(){
		return favoriteFood;
	}
	//getter for favoritefood

	public int getAge(){
		return age;
	}
	////getter for age

	public void makeSound(){
	}
	//made for test
}
