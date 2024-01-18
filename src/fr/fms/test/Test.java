package fr.fms.test;

import fr.fms.classe.*;
import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// Création des liste qui contiendront les données :
		ArrayList<Teacher> teacherList = new ArrayList<>();
		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Course> courseList = new ArrayList<>();
		
		// Création de données pour la présentation du programme :
		// Les enseignants :
		Teacher martial = new Teacher("Martial", "Bret", 45, new Adress("avenue des tulipes", "Toulouse", 31000), new Date());
		Teacher mohamed = new Teacher("Mohamed", "El Babili", 40, new Adress("rue des fraises", "Toulouse", 31000), new Date());
		Teacher bernard = new Teacher("Bernard", "Navarro", 55, new Adress("square Pompidou", "Agen", 47000), new Date());
		teacherList.add(martial);
		teacherList.add(mohamed);
		teacherList.add(bernard);

		// Les élèves :
		Student max = new Student("Max", "Thirioux", 42, new Adress("square du café", "Bayonne", 64100));
		Student claire = new Student("Claire", "Avila", 32, new Adress("rue des chocolatines", "Albi", 81000));
		Student arthur = new Student("Arthur", "Gibert", 30, new Adress("rue des artisans", "Vieux Boucau", 40480));
		Student francois = new Student("Francois", "Longueville", 40, new Adress("avenue des peintres", "Pau", 64445));
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
		
		System.out.println(teacherList);
		for(Teacher teacher : teacherList) {
			System.out.println(teacher.getAge());
		}
		// Pour demain :
		// Commencer le programme qui demande à l'utilisateur de créer deux élèves
		// Ensuite, de créer un enseignant
		// Créer un Cours
		// Ajouter un enseignant au cours existant
		// Ajouter des élèves dans la liste d'élèves du cours
		// Afficher infos du cours

	}
}
