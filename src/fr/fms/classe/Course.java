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
	// Méthode qui permet d'afficher les élève qui assiste au cours :
	public void displayStudent() {
		if(studentList.size() == 0) {
			System.out.println("Aucun élève n'assiste au cours pour le moment.");
		} else {
			System.out.println("Les élèves qui assisteront au cours " + nomination + ": ");
			for(Student student : studentList) {
				System.out.println(student.getName() + " " + student.getLastName());
			}
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
        
        while(true) {
            System.out.println("Veuillez renseigner les élèves qui participeront à ce cours :");
            Student.display(studentList);
            int indiceStudent = scanner.nextInt();
            course.getStudentList().add(studentList.get(indiceStudent - 1));
            System.out.println("Voulez vous ajouter un autre élève ? :");
            String userResponse = scanner.next();
            if(!userResponse.equals("oui")) {
            	break;
            }
        }
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


