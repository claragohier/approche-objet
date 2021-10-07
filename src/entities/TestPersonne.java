package entities;
import entities2.Personne;


public class TestPersonne {

	public static void main(String[] args) {
		
		Personne person1 = new Personne("Gohier", "Clara", new AdressePostale(1, "rue de test", 34500, "Béziers"));
		Personne person2 = new Personne("Nom", "Prenom");
		
		person2.setAddress(new AdressePostale(2, "rue test", 34500, "Béziers"));
		
	}

}
