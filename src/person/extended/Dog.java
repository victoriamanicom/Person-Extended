package person.extended;

public class Dog {
	public String name;
	public int age;
	public String colour;

	public Dog(String name, int age, String colour) {
		this.name = name;
		this.age = age;
		this.colour = colour;
	}

	public String speakDog(Dog dog) {
		return "Woof, my name is" + this.name;
	}

}
