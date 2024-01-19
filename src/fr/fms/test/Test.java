package fr.fms.test;

import fr.fms.classe.*;
import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// Cr�ation des listes qui contiendront les donn�es :
		ArrayList<Teacher> teacherList = new ArrayList<>();
		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Course> courseList = new ArrayList<>();
		
		// Cr�ation de donn�es pour la pr�sentation du programme :
		// Les enseignants :
		Teacher martial = new Teacher("Martial", "Bret", 45, new Adress("avenue des tulipes", "Toulouse", "31000"), new Date());
		Teacher mohamed = new Teacher("Mohamed", "El Babili", 40, new Adress("rue des fraises", "Toulouse", "31000"), new Date());
		Teacher bernard = new Teacher("Bernard", "Navarro", 55, new Adress("square Pompidou", "Agen", "47000"), new Date());
		teacherList.add(martial);
		teacherList.add(mohamed);
		teacherList.add(bernard);

		// Les �l�ves :
		Student max = new Student("Max", "Thirioux", 42, new Adress("square du caf�", "Bayonne", "64100"));
		Student claire = new Student("Claire", "Avila", 32, new Adress("rue des chocolatines", "Albi", "81000"));
		Student arthur = new Student("Arthur", "Gibert", 30, new Adress("rue des artisans", "Vieux Boucau", "40480"));
		Student francois = new Student("Francois", "Longueville", 40, new Adress("avenue des peintres", "Pau", "64445"));
		studentList.add(max);
		studentList.add(claire);
		studentList.add(francois);
		studentList.add(arthur);

		// Les cours :
		Course math = new Course("UML", martial);
		Course poo = new Course("Java Poo", mohamed);
		Course git = new Course("Github", bernard);
		courseList.add(math);
		courseList.add(poo);
		courseList.add(git);
		
		
		
		
		
		
		
		
		//Create.CreateStudent(studentList);
		Create.createTeatcher(teacherList);
		
		// Pour demain :
		// Commencer le programme qui demande � l'utilisateur de cr�er deux �l�ves
		// Ensuite, de cr�er un enseignant
		// Cr�er un Cours
		// Ajouter un enseignant au cours existant
		// Ajouter des �l�ves dans la liste d'�l�ves du cours
		// Afficher infos du cours

	}
	
	public void displayMenu() {
		System.out.println("1 - G�rer les enseignants");
		System.out.println("2 - G�rer les �l�ves");
		System.out.println("3 - G�rer les cours");
	}
}
