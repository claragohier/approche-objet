package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte compte = new Compte(1, 500);		
		CompteTaux compteT = new CompteTaux(1, 200, 100);
		
		Compte[] array = {compte, compteT};
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	
	}

}
