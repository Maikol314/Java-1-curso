package unidad2;

import java.util.Scanner;

public class Actividad_09 {

	public static void main(String[] args) {
		
		double altura1, altura2, altura3;
		
		boolean media_boolean;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la altura en metros con decimales de la primera persona: ");
		
		altura1 = entrada.nextDouble();
		
		System.out.print("Introduce la altura en metros con decimales de la segunda persona: ");
		
		altura2 = entrada.nextDouble();
		
		System.out.print("Introduce la altura en metros con decimales de la tercera persona: ");
		
		altura3 = entrada.nextDouble();
		
		media_boolean = ((altura1 + altura2 + altura3) / 3) > 1.69;
		
		System.out.println(media_boolean);
		
		entrada.close();

	}

}
