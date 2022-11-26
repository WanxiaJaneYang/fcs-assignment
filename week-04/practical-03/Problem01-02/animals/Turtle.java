package animals;

public class Turtle extends Animal{
	public void makeSound(){
		System.out.printf("Turtle %s said:\"We turtles do not have vocal cords\".\n", getName());
	}
	//method required
	


	public Turtle(){
		super();
	}
	//constructor without parameters
	
	public Turtle(String name){
		super(name);
	}
	//constructor using name as parameter

}
