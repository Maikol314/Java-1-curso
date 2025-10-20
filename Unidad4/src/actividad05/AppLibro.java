package actividad05;

import java.util.Scanner;

public class AppLibro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Libro l1 = new Libro ("El Quijote", "Cervantes", 1);

		System.out.println("Introduce el nombre del segundo libro: ");
		String l2_nombre = entrada.nextLine();
		
		System.out.println("Introduce el nombre del autor del segundo libro: ");
		String l2_autor = entrada.nextLine();
		
		System.out.println("Introduce la cantidad de ejemplares del segundo libro: ");
		int l2_ejemplares = entrada.nextInt();
		
		entrada.close();
		
		Libro l2 = new Libro (l2_nombre, l2_autor, l2_ejemplares);
		
		for (int i = 0; i <= 2; i++) {
			
			if (l1.prestamo()) {
				
				System.out.println("El Quijote ha sido prestado");
			}
			
			else {
				
				System.out.println("No se dispone de suficientes unidades");
			}

		}
		
		for (int i = 0; i <= 2; i++) {
			
			if (l1.devolucion()) {
				
				System.out.println("El Quijote ha sido devuelto");
			}
			
			else {
				
				System.out.println("No es posible devolver el libro");
			}

		}
		
		for (int i = 0; i <= 2; i++) {
			
			if (l2.prestamo()) {
				
				System.out.println(l2_nombre + " ha sido prestado");
			}
			
			else {
				
				System.out.println("No se dispone de suficientes unidades");
			}

		}
		
		for (int i = 0; i <= 2; i++) {
			
			if (l2.devolucion()) {
				
				System.out.println(l2_nombre + " ha sido devuelto");
			}
			
			else {
				
				System.out.println("No es posible devolver el libro");
			}

		}

	}

}
