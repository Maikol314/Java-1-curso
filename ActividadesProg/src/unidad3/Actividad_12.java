package unidad3;

import java.util.Scanner;

public class Actividad_12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int suma = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Introduce el número " + (i + 1) + ": ");
			
			int num = entrada.nextInt();
			
			suma += num;
		}
		
		int media = suma / 10;
		
		System.out.println("La media de los números introducidos es " + media);
		
		entrada.close();

	}

}
