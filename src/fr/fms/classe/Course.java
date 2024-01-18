package fr.fms.classe;
import java.util.*;

public class Course {

	// Propri�t�s de la classe :
	public String nomination;
	public Teacher teacher;
	public ArrayList<Student> studentList;

	// Constructeurs :
	public Course (String nomination, Teacher teacher) {
		this.nomination = nomination;
		this.teacher = teacher;
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

	public String toString() {
		return "Le cours " + nomination + " est encadr� par " + teacher.getName() + " " + teacher.getLastName();
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


