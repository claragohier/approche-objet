package entities2;

import entities.AdressePostale;

public class Personne {
	
	private String lastname;
	private String firstname;
	private AdressePostale address;
	
	public Personne(String lastname, String firstname, AdressePostale address){
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
	}
	
}
