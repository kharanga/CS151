package exercise4;
import java.io.*;
public class Student implements Cloneable {
	private String firstName;
	private String lastName;
	private double gpa;
	private int age;
	private String major;
	private String department;
	private Course cs151;
	private Course cs147;
	private Course ling24;
	private Course pol15;
	
	public Student(String firstName, String lastName, double gpa, int age, String major, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.age = age;
		this.major = major;
		this.department = department;
		this.cs151 = new Course("CS151","Computer Science Class", "Department of Computer Science", "6PM", "Tuesday");
		this.cs147 = new Course("CS147","Computer Science Class", "Department of Computer Science", "7:15PM", "Thursday");
		this.ling24 = new Course("LING24","Language Class", "Department of Linguistics and Language Development", "9AM", "Monday");
		this.pol15 = new Course("POL15","Politic Class", "Department of Political Science", "9:30AM", "Friday");
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
	Course getCS151() {
		return cs151;
	}
	void setCS151(Course cs151) {
		this.cs151 = cs151;
	}
	Course getCS147() {
		return cs151;
	}
	void setCS147(Course cs147) {
		this.cs147 = cs147;
	}
	Course getLING24() {
		return ling24;
	}
	void setLING24(Course ling24) {
		this.ling24 = ling24;
	}
	Course getPOL15() {
		return pol15;
	}
	void setPOL15(Course pol15) {
		this.pol15 = pol15;
	}
	void printInfo() {
		System.out.println("Name: "+getFirstName()+" "+getLastName()
							+"\nAge: " + getAge()
							+"\nGPA: " + getGPA()
							+"\nMajor: " + getMajor()
							+"\nDepartment: " + getDepartment()
							+"\nSchedule: "
							+ "\n"+getCS151().toString() 
							+ "\n"+getCS147().toString() 
							+ "\n"+getLING24().toString() 
							+ "\n"+getPOL15().toString());
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
