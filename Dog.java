package assignment2;

public class Dog extends Animal implements Domesticated {
	private double speed;
	private String habitat;
	Dog(String type, String name, String gender){
		super(type, name, gender);
		this.speed = 15;
		this.habitat = "home";
	}
	double getSpeed() {
		return speed;
	}
	void setSpeed(double speed) {
		this.speed = speed; 
	}
	String getHabitat() {
		return habitat;
	}
	void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	void sound() {
		this.bark();
	}
	void move() {
		System.out.println("Moving at " + speed + "km/hr");
	}
	void bark() {
		System.out.println("Woof");
	}
	public void walk() {
		System.out.println("Walking");
	}
	public void greetHuman() {
		System.out.println("Greeting human");
	}
}
