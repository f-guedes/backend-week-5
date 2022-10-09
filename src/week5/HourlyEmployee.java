package week5;

public class HourlyEmployee extends Employee{
	
	private double hoursWorked;
		
	public HourlyEmployee(String firstName, String lastName, double pay, String address, String reportsTo, double hoursWorked) {
		super(firstName, lastName, pay, address, reportsTo);
		this.hoursWorked = hoursWorked;
	}


	
	@Override
	public double calculatePay() {
		return getPay() * hoursWorked;
	}


}
