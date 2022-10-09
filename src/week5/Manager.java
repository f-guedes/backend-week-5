package week5;

public class Manager extends Employee{	
	
	private double bonusPercentage;

	public Manager(String firstName, String lastName, double pay, String address, String reportsTo, double bonusPercentage) {
		super(firstName, lastName, pay, address, reportsTo);
		this.bonusPercentage = bonusPercentage;
	}

	@Override
	public double calculatePay() {
		return getPay() * 80 + bonusPercentage * (getPay() * 80);
	}
	
}
