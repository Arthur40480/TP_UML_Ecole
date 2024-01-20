package fr.fms.classe;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import fr.fms.test.Test;

import java.text.SimpleDateFormat;

public class Teacher extends Person{
	// Propriétés :
	private Date date;
	
	// Constructeurs :
	public Teacher(String name, String lastName, int age, Adress adress, Date date) {
		super(name, lastName, age, adress);		// On invoque le constructeur de la classe parente Person
		this.date = new Date();
	}
	
	// Méthode :
	// Méthode qui affiche le menu pour gérer les élèves :
		public static void menu(ArrayList<Teacher> teacherList, Scanner scanner) {
			boolean exitMenu = false;
			
			do {
				System.out.println("---------- Menu enseignant ----------");
				System.out.println("1 - Afficher les enseignants");
				System.out.println("2 - Ajouter un enseignant");
				System.out.println("3 - Supprimer un enseignant");
				System.out.println("4 - Menu principale");
				System.out.println();
				System.out.print("Veuillez saisir le numéro correspondant à votre choix : ");
				int userChoice = scanner.nextInt();
				
				switch(userChoice) {
					case 1:
						display(teacherList);
						break;
					case 2:
						create(teacherList, scanner);
						break;
					case 3:
						delete(teacherList, scanner);
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
		
	// Méthode qui permet de créer un Enseignant :
	public static void create(ArrayList<Teacher> teacherList, Scanner scanner) {
		
		System.out.println("veuillez saisir le nom du professeur : ");
		String teacherFirstName = scanner.next();
		
		System.out.println("veuillez saisir le prénom du professeur : ");
		String teacherName = scanner.next();
		
		System.out.println("saisissez l'âge du professeur :");
		int age = scanner.nextInt();
		scanner.nextLine();
		 
		System.out.println("veuillez saisir la rue du professeur :");
		String street = scanner.nextLine();
		
		System.out.println("veuillez saisir la ville du professeur :" );
		String city = scanner.next();
		scanner.nextLine();
		
		System.out.println("Veuillez saisir le code postal du professeur :" );
		String zipCode = scanner.next();
		
		Teacher marcial = new Teacher (teacherName, teacherFirstName, age, new Adress(street, city, zipCode), new Date());
		teacherList.add(marcial);
	}
	
	// Méthode pour supprimer un enseignant de la liste :
	public static void delete(ArrayList<Teacher> teacherList, Scanner scanner) {
		display(teacherList);
		System.out.print("Veuillez indiquer l'id de l'élève à supprimer : ");
		int userChoice = (scanner.nextInt()) - 1;
		
		System.out.println("L'enseignant " + teacherList.get(userChoice).getName() + " " + teacherList.get(userChoice).getLastName() + " a bien été supprimer.");
		teacherList.remove(userChoice);
		System.out.println();	
	}
	
	// Méthode pour afficher chaque enseignant de la liste :
	public static void display(ArrayList<Teacher> teacherList) {		
		for(int i = 0; i < teacherList.size(); i++) {
			System.out.println(i + 1 + " " + teacherList.get(i).getName() + " " + teacherList.get(i).getLastName()
					+ ", " + teacherList.get(i).getAge() + "ans, habitant " + teacherList.get(i).getAdress().getStreet() 
					+ " à " + teacherList.get(i).getAdress().getTown() + " " + teacherList.get(i).getAdress().getZipCode()
					+ ", date d'arrivée dans l'école le " + teacherList.get(i).date );
		}
		System.out.println();
	}
	
	// Méthodes :
	@Override // <- On indique au compilateur que la méthode dérive d'une méthode de la classe parente
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date);

        return "Enseignant: " + super.toString() + " - Date d'arriv�e: " + formattedDate;
    }
		
	// Accesseurs :
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
