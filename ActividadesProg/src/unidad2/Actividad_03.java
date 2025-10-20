package unidad2;

import java.util.Scanner;

public class Actividad_03 {

	public static void main(String[] args) {
		
		String nombre;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		
		nombre = entrada.nextLine();
		
		System.out.println("Tu nombre es " + nombre);
		
		entrada.close();

	}

}
