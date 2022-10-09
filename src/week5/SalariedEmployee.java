package week5;

public class SalariedEmployee extends Employee{
	

	public SalariedEmployee(String firstName, String lastName, double pay, String address, String reportsTo) {
		super(firstName, lastName, pay, address, reportsTo);
		
	}

	@Override
	public double calculatePay() {
		return getPay() * 80;
	}

	
}
