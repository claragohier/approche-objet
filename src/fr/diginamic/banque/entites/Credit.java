package fr.diginamic.banque.entites;

public class Credit extends Operation{
	
	public Credit(String dateOp, int montantOp){
		super(dateOp, montantOp);
	}
	
	@Override
	public String getType(){
		return "Crédit";
	}
}
