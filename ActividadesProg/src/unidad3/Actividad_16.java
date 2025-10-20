package unidad3;

import java.util.Scanner;

public class Actividad_16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas del triángulo de Floyd: ");
		int filas = entrada.nextInt();
		
		int numeros = 1;
		
		for (int i = 1; i <= filas; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(numeros + " ");
				
				numeros++;
			}
			
			System.out.println();
		}
		
		entrada.close();

	}

}
