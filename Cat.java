package assignment2;

public class Cat extends Animal implements Domesticated {
	private double speed;
	private String habitat;
	Cat(String type, String name, String gender){
		super(type, name, gender);
		this.speed = 20;
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
		System.out.println("Meow");
	}
	void move() {
		System.out.println("Moving at " + speed + "km/hr");
	}
	void scratch() {
		System.out.println("Scratching");
	}
	public void walk() {
		System.out.println("Walking");
	}
	public void greetHuman() {
		System.out.println("Greeting human");
	}
}
