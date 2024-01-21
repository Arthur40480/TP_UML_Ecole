package fr.fms.classe;

import fr.fms.test.*;
import java.time.LocalDate;
import java.util.*;

public class Course {
	// Propriétés :
	private String nomination;
	private Teacher teacher;
	private LocalDate startDate;
	private LocalDate endDate;
	private ArrayList<Student> studentList;

	// Constructeurs :
	public Course (String nomination, Teacher teacher, LocalDate startDate, LocalDate endDate) {
		this.nomination = nomination;
		this.teacher = teacher;
		this.startDate = startDate;
		this.endDate = endDate;
		this.studentList = new ArrayList<Student>();
	}

	// Méthodes :
	// Méthode qui affiche le menu pour gérer les cours :
	public static void menu(ArrayList<Student> studentList, ArrayList<Teacher> teacherList, ArrayList<Course> courseList, Scanner scanner) {
		boolean exitMenu = false;
		
		do {
			System.out.println("---------- MENU COURS ----------");
			System.out.println("1 - Afficher les cours");
			System.out.println("2 - Ajouter un cours");
			System.out.println("3 - Supprimer un cours");
			System.out.println("4 - Menu principale");
			System.out.println();
			System.out.print("Veuillez saisir le numéro correspondant à votre choix : ");
			int userChoice = scanner.nextInt();
			
			switch(userChoice) {
				case 1:
					display(courseList);
					break;
				case 2:
					create(studentList, courseList, teacherList, scanner);
					break;
				case 3:
//					delete(courseList, scanner);
					break;
				case 4:
					exitMenu = true;
					Test.displayMenu(studentList, teacherList, courseList, scanner);
					break;
				default:
					System.out.println("Choix invalide, veuillez sélectionner une option valide.");
					break;
			}	
		} while (!exitMenu);
	}
	
	// Méthode qui permet d'afficher les cours et leurs informations :
	public static void display(ArrayList<Course> courseList) {
		if(courseList.size() == 0) {
			System.out.println("Aucun cours enregistrer.");
			
		} else {
			for(int i = 0; i < courseList.size(); i++) {
				System.out.println();
				System.out.println("Pour le cours " + courseList.get(i).getNomination() + " :");
				System.out.println("- Il sera enseigné par l'enseignant : " + courseList.get(i).getTeacher().getName() + " " + courseList.get(i).getTeacher().getLastName());
				System.out.println("- Le cours débutera le " + courseList.get(i).getStartDate() + " et se terminera le " + courseList.get(i).getEndDate());
				if(courseList.get(i).getStudentList().size() == 0) {
					System.out.println("- Aucun élève ne suit ce cours pour le moment.");
				} else {
					System.out.println("- Les élèves présents pour ce cours sont :");
					for(Student student : courseList.get(i).getStudentList()) {
						System.out.println("   " + student.getName() + " " + student.getLastName());
					}
				}
			}
			System.out.println();
		}
	}

	
	// Méthode qui permet de créer un Cours :
	public static void create(ArrayList<Student> studentList, ArrayList<Course> courseList, ArrayList<Teacher> teacherList, Scanner scanner) {
		
		System.out.println("Veuillez saisir la nomination du cours : ");
		String courseNomination = scanner.next();
		
		System.out.println("Veuillez saisir la date de début :");
		LocalDate startDate = Test.choise(scanner);
		
        System.out.println("Veuillez saisir la date de fin :");
        LocalDate endDate = Test.choise(scanner);
		
        System.out.println("Veuillez assigner un enseignant à ce cours :");
        // On apelle la méthode display de la classe Teacher :
        Teacher.display(teacherList);	
        int indiceTeacher = scanner.nextInt();
        Teacher teacherSelected = teacherList.get(indiceTeacher - 1);
        
        Course course = new Course(courseNomination, teacherSelected, startDate, endDate);
        courseList.add(course);
        
        while(true) {
            System.out.println("Veuillez renseigner les élèves qui participeront à ce cours :");
            Student.display(studentList);
            int indiceStudent = scanner.nextInt();
            course.getStudentList().add(studentList.get(indiceStudent - 1));
            System.out.println("Voulez vous ajouter un autre élève ? :");
            String userResponse = scanner.next();
            if(!userResponse.toLowerCase().equals("oui")) {
            	break;
            }
        }
	}
	
	// Méthode qui permet de supprimer un cours de la liste :
	public static void delete(ArrayList<Course> courseList, Scanner scanner) {
		display(courseList);
		System.out.print("Veuillez indiquer l'id du cours à supprimer : ");
		int userChoice = (scanner.nextInt()) - 1;
			
		System.out.println("Le cours de  " + courseList.get(userChoice).getNomination() + " a bien été supprimer.");
		courseList.remove(userChoice);
		System.out.println();	
	}
	
	// Méthode qui renvoie une chaîne qui inclut les informations :
	public String toString() {
		return "Le cours " + nomination + " est encadré par " + teacher.getName() + " " + teacher.getLastName()
				+ " qui débutera le : " + startDate + " et se terminera le : " + endDate;
	}

	// Accesseurs :
	public String getNomination() {
		return nomination;
	}

	public void setNomination(String nomination) {
		this.nomination = nomination;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}


