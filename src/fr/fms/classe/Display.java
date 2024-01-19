package fr.fms.classe;

import java.util.ArrayList;

public class Display {
	
	public static void displayTeacher(ArrayList<Teacher> teacherList) {
//		int indice = 1;
//		for(Teacher teacher : teacherList) {
//			System.out.println(indice + " - " + teacher.getName() + " " + teacher.getLastName());
//			indice++;
//		}
		
		for(int i = 0; i < teacherList.size(); i++) {
			System.out.println(i + 1 + " " + teacherList.get(i).getName() + " " + teacherList.get(i).getLastName());
		}
	}
}
