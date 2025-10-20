package unidad2;

import java.util.Scanner;

public class Actividad_05 {

	public static void main(String[] args) {
		
		double radio, volumen, pi = Math.PI;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el radio de la esfera: ");
		
		radio = entrada.nextDouble();
		
		volumen = (4 * pi * Math.pow(radio, 3)) / 3;
		
		System.out.print("El volumen de la esfera con radio " + radio + " es " + volumen);
		
		entrada.close();

	}

}
