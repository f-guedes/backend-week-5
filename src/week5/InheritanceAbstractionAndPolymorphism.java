package week5;

public class InheritanceAbstractionAndPolymorphism {

	public static void main(String[] args) {
//		List<String> = new ArrayList<String>();
		
		Employee Peter = new SalariedEmployee("Peter", "Brooks", 20, "25 Glenbrook St, Newton, MA", "Sarah Brunswick");
		Employee Luiz = new HourlyEmployee("Luiz", "Brooks", 19, "832 East Maple Ave, Marlborough, Apt 5, MA", "Peter Brooks", 75.5);
		Employee Sarah = new Manager("Sarah", "Brunswick", 32, "117 Chestnut Dr, Westborough, MA", "Greg Abbott", 0.155);
		
		System.out.println(Peter.getInformation());
		System.out.println(Peter.calculatePay());
		System.out.println();
		System.out.println(Luiz.getInformation());
		System.out.println(Luiz.calculatePay());
		System.out.println();
		System.out.println(Sarah.getInformation());
		System.out.println(Sarah.calculatePay());
		
	}

}
