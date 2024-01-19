package fr.fms.classe;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Teacher extends Person{
	// Propriétés :
	private Date date;
	
	// Constructeurs :
	public Teacher(String name, String lastName, int age, Adress adress, Date date) {
		super(name, lastName, age, adress);		// On invoque le constructeur de la classe parente Person
		this.date = new Date();
	}
	
	// Méthode qui permet de créer un Enseignant :
	public static void create(ArrayList<Teacher> teacherList, Scanner scanner) {
		
		System.out.println("veuillez saisir le nom du professeur : ");
		String TeatcherFirstName = scanner.next();
		
		System.out.println("veuillez saisir le prénom du professeur : ");
		String TeatcherName = scanner.next();
		
		System.out.println("saisissez l'âge du professeur :");
		int Age = scanner.nextInt();
		scanner.nextLine();
		 
		System.out.println("veuillez saisir la rue du professeur :");
		String Street = scanner.nextLine();
		
		System.out.println("veuillez saisir la ville du professeur :" );
		String City = scanner.next();
		scanner.nextLine();
		
		System.out.println("Veuillez saisir le code postal du professeur :" );
		String zipCode = scanner.next();
		
		Teacher marcial = new Teacher (TeatcherName, TeatcherFirstName, Age, new Adress(Street, City, zipCode), new Date());
		teacherList.add(marcial);
	}
	
	// Méthode pour afficher chaque enseignant de la liste :
	public static void display(ArrayList<Teacher> teacherList) {		
		for(int i = 0; i < teacherList.size(); i++) {
			System.out.println(i + 1 + " " + teacherList.get(i).getName() + " " + teacherList.get(i).getLastName());
		}
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
