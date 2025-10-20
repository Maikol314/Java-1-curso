package unidad3;

import java.util.Scanner;

public class Actividad_07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime un número entero comprendido entre 0 y 99999: ");
		
		int num = entrada.nextInt();
		
		if (num >= 0 && num <= 99999) {
			
			if (num >= 0 && num <= 9) {
				
				System.out.println("El número " + num + " tiene 1 cifra");
			}
			
			if (num >= 10 && num <= 99) {
				
				System.out.println("El número " + num + " tiene 2 cifras");
			}
			
			if (num >= 100 && num <= 999) {
				
				System.out.println("El número " + num + " tiene 3 cifras");
			}
			
			if (num >= 1000 && num <= 9999) {
				
				System.out.println("El número " + num + " tiene 4 cifras");
			}
			
			if (num >= 10000 && num <= 99999) {
				
				System.out.println("El número " + num + " tiene 5 cifras");
			}
		}
		
		else {
			
			System.out.println("El número introducido no es válido");
		}
		
		entrada.close();

	}

}
