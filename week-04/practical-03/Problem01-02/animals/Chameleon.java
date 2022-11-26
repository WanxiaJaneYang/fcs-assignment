package animals;

public class Chameleon extends Animal{
	public void makeSound(){
		System.out.printf("Chameleon %s is sneezing\n", getName());
	}
	// method requried



	public Chameleon(){
		super();
	}
	//constructor without a parameter

	public Chameleon(String name){
		super(name);
	}
	//constructor with string parameter
}
