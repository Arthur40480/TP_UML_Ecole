package fr.fms.classe;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Create {
	
	public static void CreateStudent(ArrayList<Student> studentList) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("veuillez saisir le nom de l'�tudiant : ");
		String StudentFirstName = scanner.next();
		System.out.println("veuillez saisir le pr�nom de l'�tudiant : ");
		String StudentName = scanner.next();
		
		System.out.println("saisissez l'�ge de l'�tudiant :");
		int Age = scanner.nextInt();
		scanner.nextLine();
		 
		System.out.println("veuillez saisir la rue de l'�tudiant :");
		String Street = scanner.next();
		scanner.nextLine();
		System.out.println("veuillez saisir la ville de l'�tudiant :" );
		String City = scanner.next();
		scanner.nextLine();
		System.out.println("Veuillez saisir le code postal de l'�tudiant :" );
		String zipCode = scanner.next();
			
		Student karine = new Student (StudentName, StudentFirstName, Age, new Adress (Street,City,zipCode));
		studentList.add(karine);
		scanner.close();
	
	}
	
	public static void createTeatcher(ArrayList<Teacher> teacherList) {
		Scanner scanner = new Scanner (System.in);
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
		scanner.close();
		System.out.println(teacherList);
	}
		
}