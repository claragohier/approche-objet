package fr.diginamic.banque.entites;

public class Comptes {

	int numeroCompte;
	int soldeCompte;
	
	Comptes(int numeroCompte, int soldeCompte){
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	
	@Override
	public String toString() {
		return "numéro compte : " + numeroCompte + ", solde compte : " + soldeCompte;
	}
}
