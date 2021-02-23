package exercise4;

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
}
