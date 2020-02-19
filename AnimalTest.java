package assignment2;

public class AnimalTest {
	public static void main(String[]args) {
		Dog dog = new Dog("Mammal", "Leo", "male"); 
		Cat cat = new Cat("Mammal", "Tom", "female"); 
		Racoon racoon = new Racoon("Mammal", "Billy", "male"); 
		Whale whale = new Whale("Cetacean", "Biggie", "fmale");
		dog.eat();
		dog.sleep();
		dog.sound();
		dog.move();
		dog.bark();
		dog.walk();
		dog.greetHuman();
		System.out.println();
		cat.eat();
		cat.sleep();
		cat.sound();
		cat.move();
		cat.scratch();
		cat.walk();
		cat.greetHuman();
		System.out.println();
		racoon.eat();
		racoon.sleep();
		racoon.sound();
		racoon.move();
		racoon.scratch();
		System.out.println();
		whale.eat();
		whale.sleep();
		whale.sound();
		whale.move();
		whale.swim();
	}
	
}
