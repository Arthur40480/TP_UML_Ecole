package fr.fms.classe;

import java.util.Scanner;

public class Create {
	
	public static void CreateStudent () {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("veuillez saisir le nom de l'étudiant : ");
		String StudentName = scanner.next();
		System.out.println(StudentName);
		System.out.println("veuillez saisir le prénom de l'étudiant : ");
		String StudentFirstName = scanner.next();
		System.out.println(StudentFirstName);
		
		System.out.println("saisissez l'âge de l'étudiant :");
		int Age = scanner.nextInt();
		scanner.nextLine();
		 
		System.out.println("veuillez saisir la rue de l'étudiant :");
		String Street = scanner.next();
		System.out.println("veuillez saisir la ville de l'étudiant :" );
		String City = scanner.next();
		System.out.println("Veuillez saisir le code postal de l'étudiant :" );
		String zipCode = scanner.next();
			
		Student karine = new Student (StudentName, StudentFirstName, Age, new Adress (Street,City,zipCode));
		System.out.println(karine);
		scanner.close();
	
	}
		
}


