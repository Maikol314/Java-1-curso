package unidad2;

import java.util.Scanner;

public class Actividad_07 {

	public static void main(String[] args) {
		
		boolean mayorDeEdad;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");
		
		int mayorDeEdad_numero = entrada.nextInt();
		
		mayorDeEdad = mayorDeEdad_numero >= 18;
		
		System.out.println(mayorDeEdad);
		
		entrada.close();

	}

}
