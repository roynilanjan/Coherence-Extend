package com.coherence.extend.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.coherence.extend.pojo.Person;

public class PersonGenerator {

	Random randomGenerator = new Random();

	public String getRandomFirstName() {
		String[] names = { "Ahmet", "Mehmet", "John", "Tony", "Tom", "James", "Robert", "David", "William", "Thomas",
				"Joseph", "Muhammed", "Mark", "Donald", "Brian", "Steven", "Kevin", "Anthony", "Joe", "Jason",
				"Stephen", "Andrew", "Patrick", "Peter", "Susan", "Mary", "Linda", "Barbara", "Elizabeth", "Lisa",
				"Nancy", "Karen", "Betty", "Helen", "Susan", "Maria", "Jennifer", "Laura", "Michelle", "Nicola", "Emy",
				"Andrea", "Rick", "Shane", "Kate" };

		return getRandomString(names);
	}

	public String getRandomLastName() {
		String[] lastNames = { "Brown", "White", "Foster", "Smith", "Johnson", "Williams", "Jones", "Miller", "Wilson",
				"Martin", "Jackson", "Garcia", "Martinez", "Gonzalez", "Garcia", "Martin", "Cabrera", "Tomic", "Kovac",
				"Andersen", "Pedersen", "Larsen", "Nielsen", "Bernard", "David" };
		return getRandomString(lastNames);
	}

	private String getRandomString(String[] strings) {
		// TODO Auto-generated method stub
		return strings[randomGenerator.nextInt(strings.length)];
	}

	public List<Person> getPersons(int personsSize) {
		List<Person> persons = new ArrayList<Person>();

		for (int i = 0; i < personsSize; i++) {
			Person person = new Person(Integer.toString(i), getRandomFirstName(), getRandomLastName());
			persons.add(person);
		}

		return persons;

	}

	public List<Person> getPersons(int personssSize, int startIndex) {
		List<Person> persons = new ArrayList<Person>();

		for (int i = 0; i < personssSize; i++) {
			Person person = new Person(Integer.toString(i + startIndex), getRandomFirstName(), getRandomLastName());
			persons.add(person);
		}

		return persons;

	}

	public Person getPerson(int userId) {

		Person person = new Person(Integer.toString(userId), getRandomFirstName(), getRandomLastName());
		return person;
	}

}
