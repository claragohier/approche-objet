package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

	int tauxRemuneration;
	
	public CompteTaux(int numeroCompte, int soldeCompte, int tauxRemuneration){
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration; 
	}
	
	@Override
	public String toString() {
		return "numéro compte : " + numeroCompte + ", solde compte : " + soldeCompte + ", taux de rémunération : " + tauxRemuneration;
	}
}
