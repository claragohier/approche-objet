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
	
	public Personne(String lastname, String firstname){
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	
	public String getLastname() {
		return this.lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public AdressePostale getAddress() {
		return this.address;
	}
	
	public void setAddress(AdressePostale address) {
		this.address = address;
	}
	
	
}
