package exercise2;

import java.util.Comparator;

public class Course {
	private String name;
	private String description;
	private String department;
	private String startTime;
	private String day;
	
	Course(String name, String description, String department, String startTime, String day){
		this.name = name;
		this.description = description;
		this.department = department;
		this.startTime = startTime;
		this.day = day;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description = description;
	}	
	String getDepartment() {
		return department;
	}
	void setDepartment(String department) {
		this.department = department;
	}
	String getStartTime() {
		return startTime;
	}
	void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	String getDay() {
		return day;
	}
	void setDay(String day) {
		this.day = day;
	}
	public String toString() {
		return getName()+"("+getDepartment()+"): "+ getDescription()+". "+ getStartTime()+ " on " + getDay();
	}
	public static class Comparators{
		public static Comparator<Course> NAME = new Comparator<Course>() {
			@Override
			public int compare(Course a, Course b) {
				return a.getName().compareTo(b.getName());
			}
		};
		public static Comparator<Course> DESCRIPTION = new Comparator<Course>() {
			@Override
			public int compare(Course a, Course b) {
				return a.getDescription().compareTo(b.getDescription());
			}
		};
		public static Comparator<Course> DEPARTMENT = new Comparator<Course>() {
			@Override
			public int compare(Course a, Course b) {
				return a.getDepartment().compareTo(b.getDepartment());
			}
		};
		public static Comparator<Course> STARTTIME = new Comparator<Course>() {
			@Override
			public int compare(Course a, Course b) {
				return a.getStartTime().compareTo(b.getStartTime());
			}
		};
		public static Comparator<Course> DAY = new Comparator<Course>() {
			@Override
			public int compare(Course a, Course b) {
				return a.getDay().compareTo(b.getDay());
			}
		};
	}
}

