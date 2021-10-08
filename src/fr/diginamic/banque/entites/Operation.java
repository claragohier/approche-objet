package fr.diginamic.banque.entites;

public abstract class Operation {

	String dateOp;
	int montantOp;

	Operation(String dateOp, int montantOp){
		this.dateOp = dateOp;
		this.montantOp = montantOp;
	}
	
	public abstract String getType();
}
