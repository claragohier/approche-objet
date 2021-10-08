package fr.diginamic.banque.entites;

public class Compte {

	int numeroCompte;
	int soldeCompte;
	
	Compte(int numeroCompte, int soldeCompte){
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	
	@Override
	public String toString() {
		return "numéro compte : " + numeroCompte + ", solde compte : " + soldeCompte;
	}
}
