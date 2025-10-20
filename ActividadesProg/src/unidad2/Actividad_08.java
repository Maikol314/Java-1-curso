package unidad2;

import java.util.Scanner;

public class Actividad_08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean apto_Trabajar;
		
		System.out.print("Introduce tu edad: ");
		
		int edad = entrada.nextInt();
		
		apto_Trabajar = edad >= 16 && edad <= 65;
		
		System.out.println(apto_Trabajar);
		
		entrada.close();

	}

}
