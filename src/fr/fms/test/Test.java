package fr.fms.test;

import fr.fms.classe.*;

public class Test {

	public static void main(String[] args) {
		
		Person Arthur = new Person("Arthur", "Gibert", 30);
		System.out.println(Arthur);
		Arthur.setAge(0);
		System.out.println(Arthur.getAge());

	}

}
