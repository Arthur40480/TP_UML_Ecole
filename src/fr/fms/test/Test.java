package fr.fms.test;

import fr.fms.classe.*;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Teacher martial = new Teacher("Martial", "Bret", 40, new Adress("rue des tapis", "Toulouse", 31000), new Date());
		Student claire = new Student("Claire", "Avila", 32, new Adress("rue des tulipes", "Perpignan", 40140));
		Student arthur = new Student("arthur", "arthur", 32, new Adress("rue des tulipes", "Perpignan", 40140));
		Student francois = new Student("francois", "francois", 32, new Adress("rue des tulipes", "Perpignan", 40140));
		
		
		Course math = new Course("Mathématique", martial);
		math.getStudentList().add(claire);
		math.getStudentList().add(arthur);
		math.getStudentList().add(francois);
		math.displayStudent();


	}
}
