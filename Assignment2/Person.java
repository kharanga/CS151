package assignment2;

public class Person {
	private String firstName;
	private String lastName;
	private double weight;
	private int age;
	private String SSN;
	private String gender;
	

	public Person(String firstName, String lastName, double weight, int age, String SSN, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.age = age;
		this.SSN = SSN;
		this.gender = gender;
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
	double getWeight() { 
		return weight;
	}
	void setWeight(double weight) {
		this.weight = weight;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getSSN() {
		return SSN;
	}
	void setSSN(String SSN) {
		this.SSN = SSN;
	}
	String getGender() {
		return gender;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	public String toString() {
		return (firstName + " " + getLastName() +
		"\nWeight: " + getWeight() +
		"\nSSN: " + getSSN() +
		"\nGender: "+ getGender());
	}
	void introduce() {
		System.out.println(this.toString());
	}
}
