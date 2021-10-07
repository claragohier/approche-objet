package entities;

public class AdressePostale {

	private int numero;
	private String libelle;
	private int postalCode;
	private String city;
	
	AdressePostale(int numero, String libelle, int postalCode, String city){
		this.numero = numero;
		this.libelle = libelle;
		this.postalCode = postalCode;
		this.city = city;
	}
	
}
