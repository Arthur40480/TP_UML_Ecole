package fr.fms.test;

import fr.fms.classe.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Création des listes qui contiendront les données :
		ArrayList<Teacher> teacherList = new ArrayList<>();
		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Course> courseList = new ArrayList<>();
		
		// Création de données pour la présentation du programme :
		// Les enseignants :
		Teacher martial = new Teacher("Martial", "Bret", 45, new Adress("avenue des tulipes", "Toulouse", "31000"), new Date());
		Teacher mohamed = new Teacher("Mohamed", "El Babili", 40, new Adress("rue des fraises", "Toulouse", "31000"), new Date());
		Teacher bernard = new Teacher("Bernard", "Navarro", 55, new Adress("square Pompidou", "Agen", "47000"), new Date());
		teacherList.add(martial);
		teacherList.add(mohamed);
		teacherList.add(bernard);

		// Les élèves :
		Student max = new Student("Max", "Thirioux", 42, new Adress("square du café", "Bayonne", "64100"));
		Student claire = new Student("Claire", "Avila", 32, new Adress("rue des chocolatines", "Albi", "81000"));
		Student arthur = new Student("Arthur", "Gibert", 30, new Adress("rue des artisans", "Vieux Boucau", "40480"));
		Student francois = new Student("Francois", "Longueville", 40, new Adress("avenue des peintres", "Pau", "64445"));
		studentList.add(max);
		studentList.add(claire);
		studentList.add(francois);
		studentList.add(arthur);
		
		// Les cours :
		Course uml = new Course("UML", martial, LocalDate.of(1994,11,05), LocalDate.of(1994,11,07));
		Course poo = new Course("Java Poo", mohamed, LocalDate.of(1995,03,24), LocalDate.of(1995,03,27));
		Course git = new Course("Github", bernard, LocalDate.of(1993,05,21), LocalDate.of(1993,05,22));
		courseList.add(uml);
		courseList.add(poo);
		courseList.add(git);
		
		// On ajoute des élèves dans la liste des cours :
		uml.getStudentList().add(claire);
		uml.getStudentList().add(max);
		poo.getStudentList().add(arthur);
		poo.getStudentList().add(francois);
		git.getStudentList().add(claire);
		git.getStudentList().add(francois);
		
		displayMenu(studentList, teacherList, courseList, scanner);

	}
	
	// Méthode qui permet de créer une date :
	public static LocalDate choise(Scanner scanner) {
		
		System.out.println("Jour");
		int jour = scanner.nextInt();
		
		System.out.println("Mois");
		int mois = scanner.nextInt();
		
		System.out.println("Année");
		int annee = scanner.nextInt();
		return LocalDate.of(annee, mois, jour);
	}
	
	// Méthode qui permet d'afficher le menu
	public static void displayMenu(ArrayList<Student> studentList, ArrayList<Teacher> teacherList, ArrayList<Course> courseList, Scanner scanner) {
		System.out.println("---------- MENU PRINCIPALE ----------");
		System.out.println("1 - Gérer les élèves");
		System.out.println("2 - Gérer les enseignant");
		System.out.println("3 - Gérer les cours");
		System.out.println("4 - Quitter l'application");
		System.out.println();
		System.out.print("Veuillez saisir le numéro correspondant à votre choix : ");
		int userChoice = scanner.nextInt();
		System.out.println();
		
		switch(userChoice) {
		case 1:
			Student.menu(studentList, teacherList, courseList, scanner);
			break;
		case 2:
			Teacher.menu(studentList, teacherList, courseList, scanner);
			break;
		case 3:
			Course.menu(studentList, teacherList, courseList, scanner);
			break;
		case 4:
			System.out.println("A bientôt !");
			System.exit(0);
		}
	}
}
