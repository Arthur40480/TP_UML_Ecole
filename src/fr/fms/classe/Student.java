package fr.fms.classe;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
	
	// Propri�t�s de la classe :
	private int id;
	private static int numberInstance = 0;
	
	{
		numberInstance ++;
	}
	
	// Constructeurs :
	public Student(String name, String lastName, int age, Adress adress) {
		super(name, lastName, age, adress);
		this.id = numberInstance;
	}
	
	// M�thodes :
	@Override
	public String toString() {
		return "El�ve: " + super.toString() + " - Id: " + id;
	}
	
	public static void create(ArrayList<Student> studentList, Scanner scanner) {
		
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
		System.out.println("Veuillez saisir le code postal de l'étudiant :" );
		String zipCode = scanner.next();
			
		Student karine = new Student (StudentName, StudentFirstName, Age, new Adress (Street,City,zipCode));
		studentList.add(karine);
	
	}
	
	public static void display(ArrayList<Student> studentList) {		
		for(int i = 0; i < studentList.size(); i++) {
			System.out.println(i + 1 + " " + studentList.get(i).getName() + " " + studentList.get(i).getLastName());
		}
	}
	
	// Acc�sseurs :
	public int getId() {
		return id;
	}
}