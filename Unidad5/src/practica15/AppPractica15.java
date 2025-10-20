package practica15;

import java.util.Scanner;

public class AppPractica15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int matriz[][] = new int[3][2];
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 2; j++) {
				
				System.out.print("Introduce el valor para la posición [" + i + "][" + j + "] -> ");
				matriz[i][j] = entrada.nextInt();
				System.out.println();
			}
		}
		
		System.out.print("Ahora introduce una posición de la matriz para saber su valor. Escoge la fila: ");
		int fila = entrada.nextInt();
		
		if(fila < 0 || fila >= 3) {
			
			System.out.println("El valor no es válido");
		}
		
		System.out.println();
		
		System.out.print("Escoge la columna: ");
		int columna = entrada.nextInt();
		
		System.out.println();
		
		if(columna < 0 || columna >= 2) {
			
			System.out.println("El valor no es válido");
		}
		
		System.out.println("El valor de la posición escogida es " + matriz[fila][columna]);
		
		entrada.close();

	}

}
