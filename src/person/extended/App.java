package person.extended;

public class App {

	public static void main(String[] args) {
		PersonManager personManager = new PersonManager();

		Person person1 = new Person(1, "Victoria", 21, "Software Engineer");
		personManager.addPerson(person1);
		Person person2 = new Person(2, "Adam", 42, "IT Help");
		personManager.addPerson(person2);

		Dog dog1 = new Dog("Rusty", 2, "Red");
		personManager.findPerson("Victoria").addDog(dog1);

		personManager.printPerson(person1);
		personManager.findPerson("Victoria").listDog();

	}

}
