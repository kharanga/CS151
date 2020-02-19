package assignment2;

public class Animal {
	private String type;
	private String name;
	private String gender;
	Animal (String type, String name, String gender){
		this.type = type;
		this.name = name;
		this.gender = gender;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getGender() {
		return gender;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	void eat() {
		System.out.println("Eating");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
	void move() {
		System.out.println("moving");
	}
	void sound() {
		System.out.println("Making noice");
	}
}
