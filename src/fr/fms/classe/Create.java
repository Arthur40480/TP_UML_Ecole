package fr.fms.classe;

import java.util.Scanner;

public class Create {
	
	public static void CreateStudent () {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("veuillez saisir le nom de l'�tudiant : ");
		String StudentName = scanner.next();
		System.out.println(StudentName);
		System.out.println("veuillez saisir le pr�nom de l'�tudiant : ");
		String StudentFirstName = scanner.next();
		System.out.println(StudentFirstName);
		
		System.out.println("saisissez l'�ge de l'�tudiant :");
		int Age = scanner.nextInt();
		scanner.nextLine();
		 
		System.out.println("veuillez saisir la rue de l'�tudiant :");
		String Street = scanner.next();
		System.out.println("veuillez saisir la ville de l'�tudiant :" );
		String City = scanner.next();
		System.out.println("Veuillez saisir le code postal de l'�tudiant :" );
		String zipCode = scanner.next();
			
		Student karine = new Student (StudentName, StudentFirstName, Age, new Adress (Street,City,zipCode));
		System.out.println(karine);
		scanner.close();
	
	}
		
}


