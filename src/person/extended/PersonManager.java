package person.extended;

import java.util.ArrayList;

public class PersonManager {
	public ArrayList<Person> listOfPeople = new ArrayList<>();

	public void addPerson(Person person) {
		listOfPeople.add(person);
	}

	public void removePerson(Person person) {
		listOfPeople.remove(person);
	}

	public void printPerson(Person person) {
		System.out.print("Name: ");
		System.out.println(person.name);
		System.out.print("Age: ");
		System.out.println(person.age);
		System.out.print("Job Title: ");
		System.out.println(person.jobTitle);
	}

	public Person findPerson(String name) {
		for (int j = 0; j < listOfPeople.size(); j++) {
			if (listOfPeople.get(j).name == name) {
				return listOfPeople.get(j);
			}
		}
		return null;
	}
}
