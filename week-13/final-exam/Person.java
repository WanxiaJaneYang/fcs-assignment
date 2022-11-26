
public class Person {

    private String name;
    private int age;

    // constructors
    public Person() {
        this("anon", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accessors
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // String representation of the person 
    @Override
    public String toString() {
        return String.format("Person: %s is age: %d", this.name, this.age);
    }

}
