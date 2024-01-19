package fr.fms.classe;

public class Adress {
	
	// Propri�t�s de la classe :
	private String street;
	private String town;
	private String zipCode;

	// Constructeurs :
	public Adress (String street, String town, String zipCode) {
		this.street = street;
		this.town = town;
		this.zipCode = zipCode;
	}
	
	// M�thodes :
	public String toString() {
	  return street + " � " + town + " " + zipCode;	
	}

	// Accesseurs : 
	public String getStreet() {
		 return street;
	}
	
	public String getTown() {
		return town;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
