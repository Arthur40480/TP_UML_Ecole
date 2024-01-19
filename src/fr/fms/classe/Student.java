package fr.fms.classe;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
	// Propriétés :
	private int id;
	private static int numberInstance = 0;
	
	{
		numberInstance ++;
	}
	
	// Constructeurs :
	public Student(String name, String lastName, int age, Adress adress) {
		super(name, lastName, age, adress);		// On invoque le constructeur de la classe parente Person
		this.id = numberInstance;
	}
	
	// Méthodes :
	// Méthode qui permet de créer un Elève :
	public static void create(ArrayList<Student> studentList, Scanner scanner) {
			
		System.out.println("Veuillez saisir le nom de l'étudiant : ");
		String StudentFirstName = scanner.next();
		System.out.println("Veuillez saisir le prénom de l'étudiant : ");
		String StudentName = scanner.next();
			
		System.out.println("Saisissez l'âge de l'étudiant :");
		int Age = scanner.nextInt();
		scanner.nextLine();
			 
		System.out.println("Veuillez saisir la rue de l'étudiant :");
		String Street = scanner.next();
		scanner.nextLine();
		
		System.out.println("Veuillez saisir la ville de l'étudiant :" );
		String City = scanner.next();
		scanner.nextLine();
		
		System.out.println("Veuillez saisir le code postal de l'étudiant :" );
		String zipCode = scanner.next();
				
		Student karine = new Student (StudentName, StudentFirstName, Age, new Adress (Street,City,zipCode));
		studentList.add(karine);
	}
	
	// Méthode qui permet d'afficher tous les élèves de la liste :	
	public static void display(ArrayList<Student> studentList) {		
		for(int i = 0; i < studentList.size(); i++) {
			System.out.println(i + 1 + " " + studentList.get(i).getName() + " " + studentList.get(i).getLastName());
		}
	}
	
	@Override	// <- On indique au compilateur que la méthode dérive d'une méthode de la classe parente
	public String toString() {	// Méthode qui renvoie une chaîne qui inclut les informations :
		return "Elève: " + super.toString() + " - Id: " + id;
	}
	
	// Accesseurs :
	public int getId() {
		return id;
	}
}