package fr.fms.classe;

import java.util.ArrayList;
import java.util.Scanner;

import fr.fms.test.Test;

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
	// Méthode qui affiche le menu pour gérer les élèves :
	public static void menu(ArrayList<Student> studentList, Scanner scanner) {
		boolean exitMenu = false;
		
		do {
			System.out.println("---------- Menu élèves ----------");
			System.out.println("1 - Afficher les élèves");
			System.out.println("2 - Ajouter un élève");
			System.out.println("3 - Supprimer un élève");
			System.out.println("4 - Menu principale");
			System.out.println();
			System.out.print("Veuillez saisir le numéro correspondant à votre choix : ");
			int userChoice = scanner.nextInt();
			
			switch(userChoice) {
				case 1:
					display(studentList);
					break;
				case 2:
					create(studentList, scanner);
					System.out.println("Bye !");
					break;
				case 3:
					delete(studentList, scanner);
					break;
				case 4:
					exitMenu = true;
					Test.displayMenu();
					break;
				default:
					System.out.println("Choix invalide, veuillez sélectionner une option valide.");
					break;
			}	
		} while (!exitMenu);
	}
	
	// Méthode qui permet de créer un Elève :
	public static void create(ArrayList<Student> studentList, Scanner scanner) {	
		System.out.print("Veuillez saisir le nom : ");
		String studentFirstName = scanner.next();
		
		System.out.print("Veuillez saisir le prénom : ");
		String studentName = scanner.next();
			
		System.out.print("Saisissez l'âge : ");
		int age = scanner.nextInt();
		scanner.nextLine();
			 
		System.out.print("Veuillez saisir la rue : ");
		String street = scanner.next();
		scanner.nextLine();
		
		System.out.print("Veuillez saisir la ville : " );
		String city = scanner.next();
		scanner.nextLine();
		
		System.out.print("Veuillez saisir le code postal : " );
		String zipCode = scanner.next();
				
		Student student = new Student (studentName, studentFirstName, age, new Adress(street, city, zipCode));
		studentList.add(student);
		
		System.out.println();
		System.out.println("L'élève " + studentName + " " + studentFirstName + " a bien été ajouté.");
	}
	
	// Méthode qui permet de supprimer un élève de la liste :
	public static void delete(ArrayList<Student> studentList, Scanner scanner) {
		display(studentList);
		System.out.print("Veuillez indiquer l'id de l'élève à supprimer : ");
		int userChoice = (scanner.nextInt()) - 1;
		
		System.out.println("L'élève " + studentList.get(userChoice).getName() + " " + studentList.get(userChoice).getLastName() + " a bien été supprimer.");
		studentList.remove(userChoice);
		System.out.println();	
	}
	
	// Méthode qui permet d'afficher tous les élèves de la liste :	
	public static void display(ArrayList<Student> studentList) {	
		if(studentList.size() == 0) {
			System.out.println("Aucun élève enregistrer.");
			System.out.println();
			
		} else {
			for(int i = 0; i < studentList.size(); i++) {
				System.out.println(i + 1 + " - " + studentList.get(i).getName() + " " + studentList.get(i).getLastName()
									+ ", " + studentList.get(i).getAge() + "ans, habitant " + studentList.get(i).getAdress().getStreet() 
									+ " à " + studentList.get(i).getAdress().getTown() + " " + studentList.get(i).getAdress().getZipCode());
			}
			System.out.println();
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