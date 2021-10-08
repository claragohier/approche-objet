package fr.diginamic.banque.entites;

public abstract class Operation {

	private String dateOp;
	private int montantOp;

	Operation(String dateOp, int montantOp){
		this.dateOp = dateOp;
		this.montantOp = montantOp;
	}
	
	public abstract String getType();

	public String getDateOp() {
		return dateOp;
	}

	public void setDateOp(String dateOp) {
		this.dateOp = dateOp;
	}

	public int getMontantOp() {
		return montantOp;
	}

	public void setMontantOp(int montantOp) {
		this.montantOp = montantOp;
	}
	
}
