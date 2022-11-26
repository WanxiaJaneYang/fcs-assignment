package animals;

public class Lion extends Animal{
	public void makeSound(){
		System.out.printf("Lion %s is roaring.\n", getName());
	}
	//method required



	public Lion(){
	}
	//constructor without paratemter
	
	public Lion(String name){
		super(name);
	}
	//constructor using string as name
}
