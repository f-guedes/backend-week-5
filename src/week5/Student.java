package week5;

public class Student {
	
	static int numberOfStudents;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	
	
	/*
	 * Constructors:
	 */
	
	public Student() {}
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
	}
	
	
	/*
	 * Public methods
	 */
	
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("My phone number is " + phoneNumber);
		System.out.println("I'm in grade " + gradeLevel);
	}
	
	
	/*
	 * Private methods
	 */
	private boolean isLengthGreaterThan(String str, int length) {
		return str.length() > length;
	}
	
	
	/*
	 * Getters & Setters
	 */
	
	public void setFirstName(String firstName) {
		if (isLengthGreaterThan(firstName, 1)) {
			this.firstName = firstName;
		}		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (isLengthGreaterThan(phoneNumber, 9)) {
		this.phoneNumber = phoneNumber;
		}
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setGradeLevel (int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel < 13) {
		this.gradeLevel = gradeLevel;
		}
	}	
	
	public int getGradeLevel() {
		return gradeLevel;
	}
	
}
