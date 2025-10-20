package practica01;

import java.util.ArrayList;

public class AppBiblioteca {

	public static void main(String[] args) {
		
		ArrayList<Publicaciones> publicaciones = new ArrayList<>();
		
		publicaciones.add(new Libros(1, 2016, "Java desde 0", "Juan Pérez"));
		publicaciones.add(new Libros(2, 2020, "Python", "Manuel García"));
		publicaciones.add(new Revistas(3, 2010, "Fium", 6, 28, 33));
		publicaciones.add(new Revistas(4, 2008, "F1", 8, 20, 30));
		
		for(Publicaciones pub : publicaciones) {
			
			System.out.println(pub.toString());
			System.out.println();
		}

	}

}
