package fr.fms.test;

import fr.fms.classe.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
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
//		Course math = new Course("UML", martial);
//		Course poo = new Course("Java Poo", mohamed);
//		Course git = new Course("Github", bernard);
//		courseList.add(math);
//		courseList.add(poo);
//		courseList.add(git);		
		
		//Create.CreateStudent(studentList, scanner);
		//Create.createTeatcher(teacherList, scanner);
		Course.create(studentList, courseList, teacherList, scanner);
	}
	
	public static LocalDate choise(Scanner scanner) {
		System.out.println("Jour");
		int jour = scanner.nextInt();
		System.out.println("Mois");
		int mois = scanner.nextInt();
		System.out.println("Année");
		int annee = scanner.nextInt();
		return LocalDate.of(annee, mois, jour);
	}
}
