package exercise3;

import java.util.Comparator;


public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	Person(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName; 
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	public static class Comparators{
		public static Comparator<Person> FIRSTNAME = new Comparator<Person>() {
			@Override
			public int compare(Person a, Person b) {
				return a.getFirstName().compareTo(b.getFirstName());
			}
		};
		public static Comparator<Person> LASTNAME = new Comparator<Person>() {
			@Override
			public int compare(Person a, Person b) {
				return a.getLastName().length() - b.getLastName().length();
			}
		};
		public static Comparator<Person> AGE = new Comparator<Person>() {
			@Override
			public int compare(Person a, Person b) {
				return a.getAge()-b.getAge();
			}
		};
	}
}