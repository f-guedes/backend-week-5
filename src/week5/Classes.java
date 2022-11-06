package week5;

public class Classes {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstName("Tony");
		student1.setLastName("Hawk");
		student1.setGradeLevel(12);
		student1.setPhoneNumber("617-457-1836");
		
		student1.introduce();
		
		Student student2 = new Student("Bob", "Burnquist");
		student2.introduce();
		
		Student student3 = new Student ("Bucky", "Lasek", "617-786-4570", 10);
		student3.introduce();

	}

}

