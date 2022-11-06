package week5;

public class Player {
	
	private String name;
	private String position;
	private String specialty;
	
	
	/*
	 * Constructors
	 */
	public Player (String name, String position, String specialty) {
		this.name = name;
		this.position = position;
		this.specialty = specialty;
	}
	
	/*
	 * Public methods
	 */
	public void describe() {
		System.out.println("Player: " +  name + "\tPosition: " + position + "\tSpecialy: " + specialty);
	}

	
	/*
	 * Getters & Setters
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

}
