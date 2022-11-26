import animals.*;

public class AnimalTest{
	public static void main(String[] args){
		Animal animal1=new Animal("Vivi",20);
		System.out.printf("The animal's name is %s and the weight is %.0f kg.\n", animal1.getName(), animal1.getWeight());
		animal1.setAge(2);
		System.out.printf("%s is %d year old\n", animal1.getName(), animal1.getAge());
		//test for class Animal

		Animal[] groups= new Animal[3];
		groups[0] =new Lion("Simba");
		groups[1] =new Turtle("Slow");
		groups[2]=new Chameleon("Shadow");
		for(Animal animal:groups){
			animal.makeSound();
		}
		//test for the three classes
	}
}
