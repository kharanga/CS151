package exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
	public static void main(String [] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Joe", "Smith", 40));
		persons.add(new Person("Amy", "Gold", 32));
		persons.add(new Person("Tony", "Stork", 21));
		persons.add(new Person("Sean", "Irish", 24));
		persons.add(new Person("Tine", "Brock", 28));
		persons.add(new Person("Lenny", "Hep", 18));
		Collections.sort(persons, Person.Comparators.FIRSTNAME);
		System.out.println("Sort by first name in ascending order");
		for(Person p : persons) {
			System.out.println(p.getFirstName()+ " " + p.getLastName()+ "," + p.getAge());
		}
		System.out.println("");
		System.out.println("Sort by first name in descending order");
		Collections.sort(persons, Collections.reverseOrder(Person.Comparators.FIRSTNAME));
		for(Person p : persons) {
			System.out.println(p.getFirstName()+ " " + p.getLastName()+ "," + p.getAge());
		}
		System.out.println("");
		System.out.println("Sort by last name length in ascending order");
		Collections.sort(persons, Person.Comparators.LASTNAME);
		for(Person p : persons) {
			System.out.println(p.getFirstName()+ " " + p.getLastName()+ "," + p.getAge());
		}
		System.out.println("");
		System.out.println("Sort by last name length in descending order");
		Collections.sort(persons, Collections.reverseOrder(Person.Comparators.LASTNAME));
		for(Person p : persons) {
			System.out.println(p.getFirstName()+ " " + p.getLastName()+ "," + p.getAge());
		}
		System.out.println("");
		System.out.println("Sort by age in ascending order");
		Collections.sort(persons, Person.Comparators.AGE);
		for(Person p : persons) {
			System.out.println(p.getFirstName()+ " " + p.getLastName()+ "," + p.getAge());
		}
		System.out.println("");
		System.out.println("Sort by age in descending order");
		Collections.sort(persons, Collections.reverseOrder(Person.Comparators.AGE));
		for(Person p : persons) {
			System.out.println(p.getFirstName()+ " " + p.getLastName()+ "," + p.getAge());
		}
	}
}
