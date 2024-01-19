package fr.fms.classe;

import fr.fms.test.*;
import java.time.LocalDate;
import java.util.*;

public class Course {

	// Propri�t�s de la classe :
	public String nomination;
	public Teacher teacher;
	public LocalDate startDate;
	public LocalDate endDate;
	public ArrayList<Student> studentList;

	// Constructeurs :
	public Course (String nomination, Teacher teacher, LocalDate startDate, LocalDate endDate) {
		this.nomination = nomination;
		this.teacher = teacher;
		this.startDate = startDate;
		this.endDate = endDate;
		this.studentList = new ArrayList<Student>();
	}

	// M�thodes :
	public void displayStudent() {
		if(studentList.size() == 0) {
			System.out.println("Aucun �l�ve n'assiste � ce cours !");
		} else {
			System.out.println("Les �l�ves qui assisteront au cours " + nomination + ": ");
			for(Student student : studentList) {
				System.out.println(student.getName() + " " + student.getLastName());
			}
		}
	}
	
	public static void create(ArrayList<Student> studentList, ArrayList<Course> courseList, ArrayList<Teacher> teacherList, Scanner scanner) {
		
		System.out.println("Veuillez saisir la nomination du cours : ");
		String courseNomination = scanner.next();
		System.out.println("Veuillez saisir la date de début :");
		LocalDate startDate = Test.choise(scanner);
		
        
        System.out.println("Veuillez saisir la date de fin :");
        LocalDate endDate = Test.choise(scanner);
		
        System.out.println("Veuillez assigner un enseignant à ce cours :");
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
        System.out.println(course.getStudentList());
	}

	public String toString() {
		return "Le cours " + nomination + " est encadr� par " + teacher.getName() + " " + teacher.getLastName()
				+ " qui débutera le : " + startDate + " et se terminera le : " + endDate;
	}

	// Acc�sseurs :
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

}


