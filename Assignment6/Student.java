package exercise2;

import java.util.Collections;
import java.util.LinkedList;

public class Student{
	private String firstName;
	private String lastName;
	private double gpa;
	private int age;
	private String major;
	private String department;
	private LinkedList<Course> courses;
	
	public Student(String firstName, String lastName, double gpa, int age, String major, String department,LinkedList courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.age = age;
		this.major = major;
		this.department = department;
		this.courses = courses;
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
	LinkedList<Course> getCourses(){
		return courses;
	}
	void setCourses(LinkedList<Course> courses) {
		this.courses=courses;
	}
	void addCourse(Course toAdd) {
		courses.add(toAdd);
	}
	void removeCourse(Course toRemove) {
		courses.remove(toRemove);
	}
	void sortCourse(boolean ascending, String attribute) throws WrongAttributeException {
		if(attribute.equalsIgnoreCase("name")) {
			Collections.sort(getCourses(), Course.Comparators.NAME);
		}
		else if(attribute.equalsIgnoreCase("description")) {
			Collections.sort(getCourses(), Course.Comparators.DESCRIPTION);
		}
		else if(attribute.equalsIgnoreCase("department")) {
			Collections.sort(getCourses(), Course.Comparators.DEPARTMENT);
		}
		else if(attribute.equalsIgnoreCase("start time")) {
			Collections.sort(getCourses(), Course.Comparators.STARTTIME);
		}
		else if(attribute.equalsIgnoreCase("day")) {
			Collections.sort(getCourses(), Course.Comparators.DAY);
		}
		else {
			throw new WrongAttributeException("Non-exist attribute for comparison");
		}
		if(ascending == false) {
			Collections.sort(getCourses(), Collections.reverseOrder());
		}
		for(Course c : getCourses()) {
			System.out.println(c.getName());
		}
	}
	
}
