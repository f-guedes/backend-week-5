package week5;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	
	public Employee (String firstName, String lastName, double pay, String address, String reportsTo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
		this.address = address;
		this.reportsTo = reportsTo;
		
	}
	
	public abstract double calculatePay();
		
	public String getInformation() {
		return "Name: " + firstName + " " + lastName
				+ "\nReports to: " + reportsTo
				+ "\nAddress: " + address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReport() {
		return reportsTo;
	}

	public void setReport(String reportsTo) {
		this.reportsTo = reportsTo;
	}

}
