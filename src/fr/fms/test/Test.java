package fr.fms.test;

import fr.fms.classe.*;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		
		Teacher martial = new Teacher("Martial", "Bret", 40, new Adress("rue des tapis", "Toulouse", 31000), new Date());
		Student claire = new Student("Claire", "Avila", 32, new Adress("rue des tulipes", "Perpignan", 40140));
		Student arthur = new Student("Claire", "Avila", 32, new Adress("rue des tulipes", "Perpignan", 40140));
		Student françois = new Student("Claire", "Avila", 32, new Adress("rue des tulipes", "Perpignan", 40140));
		System.out.println(claire);
		System.out.println(arthur);
		System.out.println(françois);
		System.out.println(martial);

	}
}
