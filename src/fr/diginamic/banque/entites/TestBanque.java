package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Comptes compte = new Comptes(1, 500);
		
		// on ne peut pas lire l'objet
		System.out.println(compte);
	
		// on doit lire les valeurs passées en attributs
//		System.out.println(compte.numeroCompte);
//		System.out.println(compte.soldeCompte);
	}

}
