package interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] array = new ObjetGeometrique[2];
		
		Cercle circle = new Cercle(5);
		Rectangle rectangle = new Rectangle(5, 2);
		
		array[0] = circle;
		array[1] = rectangle;
		
		for(int i=0; i < array.length; i++) {
			System.out.println("perimetre : " + array[i].perimetre());
			System.out.println("surface : " + array[i].surface());
		}
	}

}
