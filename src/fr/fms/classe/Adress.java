package fr.fms.classe;

public class Adress {
	
	private String street;
	private String town;
	private int zipCode;

	//the constructor
	public Adress (String street, String town, int zipCode) {
		
		this.street = street;
		this.town = town;
		this.zipCode = zipCode;
	}
	
	// display method
	public String toString() {
	
	  return "Rue: " + street + " - Ville: " + town + " - Code postale: " + zipCode;	
	}

	// getters and setters 
	public String getStreet() {
		 return street;
	}
	
	public String getTown() {
		return town;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	
	// setters
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
