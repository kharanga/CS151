package assignment2;

public class Whale extends Animal {
	private double speed;
	private String habitat;
	Whale(String type, String name, String gender){
		super(type, name, gender);
		this.speed = 100;
		this.habitat = "ocean";
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
		System.out.println("Whiieeeeeaooooooo");
	}
	void move() {
		this.swim();
	}
	void swim() {
		System.out.println("Swimming at " + speed + "km/hr");
	}
}
