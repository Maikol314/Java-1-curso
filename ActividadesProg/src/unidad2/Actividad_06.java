package unidad2;

import java.util.Scanner;

public class Actividad_06 {

	public static void main(String[] args) {
		
		double longitud, pi = Math.PI, radio;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el valor del radio: ");
		
		radio = entrada.nextDouble();
		
		longitud = 2 * pi * radio;
		
		System.out.printf("La longitud de la circunferencia es " + "%.2f", longitud);
		
		entrada.close();
	}

}
