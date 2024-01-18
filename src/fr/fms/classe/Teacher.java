package fr.fms.classe;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Teacher extends Person{
	
	// Propriétés de la classe :
	private Date date;
	
	// Constructeurs :
	public Teacher(String name, String lastName, int age, Adress adress, Date date) {
		super(name, lastName, age, adress);
		this.date = new Date();
	}
	
	// Méthodes :
	@Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormat.format(date);

        return "Enseignant: " + super.toString() + " - Date d'arrivée: " + formattedDate;
    }
	
	// Accesseurs :
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
