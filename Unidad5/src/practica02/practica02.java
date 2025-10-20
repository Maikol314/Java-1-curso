package practica02;

import java.util.Scanner;

public class practica02 {
	
	int vector1[] = new int [5];
	int vector2[] = new int [5];
	
	Scanner entrada = new Scanner(System.in);
	
	public void rellenar() {
		
		for(int i = 0; i < vector1.length; i++) {
			
			System.out.print("Escribe el valor para vector1[" + i + "]: ");
			
			vector1[i] = entrada.nextInt();
			
			System.out.println();
		}
		
		for(int i = 0; i < vector2.length; i++) {
			
			System.out.print("Escribe el valor para vector2[" + i + "]: ");
			
			vector2[i] = entrada.nextInt();
			
			System.out.println();
		}
	}
	
	public void mostrar() {
		
		for(int i = 0; i < vector1.length; i++) {
			
			System.out.print(vector1[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < vector2.length; i++) {
			
			System.out.print(vector2[i] + " ");
		}
	}

}
