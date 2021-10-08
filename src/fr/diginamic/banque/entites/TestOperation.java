package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {

		Credit credit1 = new Credit("08/10/2021", 200);
		Credit credit2 = new Credit("10/05/2021", 500);
		
		Debit debit1 = new Debit("02/05/2021", 10);
		Debit debit2 = new Debit("25/07/2021", 1000);
		
		int sum = 0;
		
		Operation[] operations = {credit1, credit2, debit1, debit2};

		for(int i=0; i < operations.length; i++) {
			System.out.println(operations[i].getType());
			System.out.println("date : " + operations[i].getDateOp());
			System.out.println("montant : " + operations[i].getMontantOp());
			
			if(operations[i].getType() == "Crédit") {
				sum += operations[i].getMontantOp();
			} else {
				sum -= operations[i].getMontantOp();
			}
			
		}
		System.out.println(sum);
	}

}
