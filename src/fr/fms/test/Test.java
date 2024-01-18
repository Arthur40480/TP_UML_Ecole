package fr.fms.test;

import fr.fms.classe.*;

public class Test {

	public static void main(String[] args) {
		
		Student max = new Student("Max", "Thirioux", 42, new Adress("Rue du café", "Bayonne", 64100));
		System.out.println(max);
	}

}
