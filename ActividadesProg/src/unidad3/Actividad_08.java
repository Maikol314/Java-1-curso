package unidad3;

import java.util.Scanner;

public class Actividad_08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce una nota del 0 al 10: ");
		
		int nota = entrada.nextInt();
		
		switch (nota) {
		
		case 0, 1, 2, 3, 4:
			
			System.out.println("Insuficiente");
			break;
		
		case 5:
			
			System.out.println("Suficiente");
			break;
			
		case 6:
			
			System.out.println("Bien");
			break;
			
		case 7, 8:
			
			System.out.println("Notable");
			break;
		
		case 9, 10:
			
			System.out.println("Sobresaliente");
			break;
		
		default:
			
			System.out.println("La nota no es válida");
			break;
		}
		
		entrada.close();

	}

}
