package fr.fms.classe;

public class Student extends Person {
	
	// Propriétés de la classe :
	private int id;
	private static int numberInstance = 0;
	
	{
		numberInstance ++;
	}
	
	// Constructeurs :
	public Student(String name, String lastName, int age, Adress adress) {
		super(name, lastName, age, adress);
		this.id = numberInstance;
	}
	
	// Méthodes :
	@Override
	public String toString() {
		return "Elève: " + super.toString() + " - Id: " + id;
	}
	
	// Accésseurs :
	public int getId() {
		return id;
	}
}