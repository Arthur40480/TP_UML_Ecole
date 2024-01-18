package fr.fms.classe;

public class Person {
	
	// Propri�t�s de la classe :
	private String name;
	private String lastName;
	private int age;
	private Adress adress;	
	
	// Constructeurs :
	public Person(String name, String lastName, int age, Adress adress) {
		setName(name);
		setLastName(lastName);
		setAge(age);
		this.adress = adress;
	}
	
	// M�thodes :
	public String toString() {
		return "Nom: " + getName() + " - Pr�nom: " + getLastName() + " - Age: " + getAge() + "ans";
	}
	
	// Accesseurs :
	public Adress getAdress() {
		return adress;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("L'�ge d'une personne ne peut �tre inf�rieur � 0 !");
			setAge(0);
		} else {
			this.age = age;
		}
	}
	
	
}
