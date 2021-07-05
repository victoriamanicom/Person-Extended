package person.extended;

import java.util.ArrayList;

public class Person {
	public int id;
	public String name;
	public int age;
	public String jobTitle;
	public ArrayList<Cat> listOfCats = new ArrayList<>();
	public ArrayList<Dog> listOfDogs = new ArrayList<>();

	public Person(int id, String name, int age, String jobTitle) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.listOfCats = new ArrayList<>();
		this.listOfDogs = new ArrayList<>();
	};

	public void addDog(Dog dog) {
		listOfDogs.add(dog);
	}

	public void removeDog(Dog dog) {
		listOfDogs.remove(dog);
	}

	public void addCat(Cat cat) {
		listOfCats.add(cat);
	}

	public void removeCat(Cat cat) {
		listOfCats.remove(cat);
	}

	public void listDog() {
		for (int j = 0; j < listOfDogs.size(); j++) {

			printDog(listOfDogs.get(j));

		}
	}

	public void listCat() {
		for (int j = 0; j < listOfCats.size(); j++) {

			System.out.println(listOfCats.get(j).name);

		}
	}

	public void printDog(Dog dog) {
		System.out.print("Name: ");
		System.out.println(dog.name);
		System.out.print("Age: ");
		System.out.println(dog.age);
		System.out.print("Colour: ");
		System.out.println(dog.colour);
	}

}