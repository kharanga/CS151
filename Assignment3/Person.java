package assignment3;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private int SSN;
	private String id;
	private Address address;
	private boolean specialAccommodations;
	Person(){
	}
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	Person(String firstName, String lastName, int age, int SSN, 
			String id, Address address, boolean specialAccommodations) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.SSN = SSN;
		this.id = id;
		this.address = address;
		this.specialAccommodations = specialAccommodations;
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
	int getSSN() {
		return SSN;
	}
	void setSSN(int SSN) {
		this.SSN = SSN;
	}
	String getID() {
		return id;
	}
	void setID(String id) {
		this.id = id;
	}
	Address getAddress() {
		return address;
	}
	void setAddress(Address address) {
		this.address = address;
	}
	boolean getSpecialAccommodations () {
		return specialAccommodations;
	}
	void setSpecialAccommodations() {
		this.specialAccommodations = specialAccommodations;
	}
	public String toString() {
		return (firstName + " " + getLastName() +
		"\nAge: " + getAge() +
		"\nSSN: " + getSSN() +
		"\nID: "+ getID()+
		"\nNeed special accommodation: "+ getSpecialAccommodations()+
		"\nAddress: "+address.toString());
	}
	void introduce() {
		System.out.println(this.toString());
	}
	
}

