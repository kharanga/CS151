package assignment2;

public class Student {
	private String firstName;
	private String lastName;
	private double gpa;
	private int age;
	private String major;
	private String department;
	
	public Student(String firstName, String lastName, double gpa, int age, String major, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.age = age;
		this.major = major;
		this.department = department;
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
	double getGPA() { 
		return gpa;
	}
	void setGPA(double gpa) {
		this.gpa = gpa;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getMajor() {
		return major;
	}
	void setMajor(String major) {
		this.major = major;
	}
	String getDepartment() {
		return department;
	}
	void setDepartment(String department) {
		this.department = department;
	}
	class Course{
		void printSchedule() {
			System.out.println("Cs 151, Cs 147, Pols 15, Ling 24");
		}
	}
}
