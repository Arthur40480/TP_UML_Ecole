package fr.fms.classe;

public class Person {
	
	// Propriétés de la classe :
	private String name;
	private String lastName;
	private int age;
//	private Adress adress; 		<-- A venir !
	
	// Constructeurs :
	public Person(String name, String lastName, int age) {
		setName(name);
		setLastName(lastName);
		setAge(age);
	}
	
	// Méthodes :
	public String toString() {
		return "Nom: " + getName() + " - Prénom: " + getLastName() + " - Age: " + getAge() + "ans";
	}
	
	// Accesseurs :
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
			System.out.println("L'âge d'une personne ne peut être inférieur à 0 !");
			setAge(0);
		} else {
			this.age = age;
		}
	}
	
	
}
