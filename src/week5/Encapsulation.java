package week5;

public class Encapsulation {

	public static void main(String[] args) {
		
		/*
		 * Access modifiers:
		 * public					accessible everywhere
		 * private					only accessible within the class itself
		 * protected				accessible within the class or other classes in the same package and subclasses
		 * default (No modifier)	same as protected, but not accessible in subclasses in a different package
		 */
		
		Student student = new Student();
		student.setFirstName("Jack");
		student.setLastName("Tequila");
		student.setPhoneNumber("6173451792");
		System.out.println(student.getFirstName() + " " + student.getLastName());
		System.out.println(student.getPhoneNumber());
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());

	}

}

