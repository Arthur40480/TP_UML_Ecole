package fr.fms.classe;

public class Student extends Person {
	
	// Propri�t�s de la classe :
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
	
	// M�thodes :
	@Override
	public String toString() {
		return "El�ve: " + super.toString() + " - Id: " + id;
	}
	
	// Acc�sseurs :
	public int getId() {
		return id;
	}
}