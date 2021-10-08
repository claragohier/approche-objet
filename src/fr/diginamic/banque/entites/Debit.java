package fr.diginamic.banque.entites;

public class Debit extends Operation{
	
	public Debit(String dateOp, int montantOp){
		super(dateOp, montantOp);
	}
	
	@Override
	public String getType(){
		return "Débit";
	}
}
