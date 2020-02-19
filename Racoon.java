package assignment2;

public class Racoon extends Animal {
	private double speed;
	private String habitat;
	Racoon(String type, String name, String gender){
		super(type, name, gender);
		this.speed = 10;
		this.habitat = "forest";
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
		System.out.println("Meeeeeeeew");
	}
	void move() {
		System.out.println("Moving at " + speed + "km/hr");
	}
	void scratch() {
		System.out.println("Scratching");
	}
}
