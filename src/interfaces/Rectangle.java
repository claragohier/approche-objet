package interfaces;

public class Rectangle implements ObjetGeometrique {

	private int longueur;
	private int largeur;
	
	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	@Override 
	public double perimetre() {
		return 2 * (this.longueur + this.largeur);
	}
	
	@Override 
	public double surface() {
		return this.longueur * this.largeur;
	}
}
