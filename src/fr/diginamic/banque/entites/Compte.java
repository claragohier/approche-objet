package fr.diginamic.banque.entites;

/**
 * Cette classe représente le concept de compte bancaire dans l'app
 * @author clarousse
 *
 */
public class Compte {

	private int numeroCompte;
	private int soldeCompte;

	/**
	 * 
	 * @param numeroCompte
	 * @param soldeCompte
	 */
	Compte(int numeroCompte, int soldeCompte){
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	
	@Override
	public String toString() {
		return "numéro compte : " + numeroCompte + ", solde compte : " + soldeCompte;
	}
	
	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public int getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
}
