package unidad2;

import java.util.Scanner;

public class Actividad_10 {

	public static void main(String[] args) {
		
		double altura1, altura2, altura3, media_numero, media;
		
		char sexo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce la altura en metros con decimales de la primera persona: ");
		
		altura1 = entrada.nextDouble();
		
		System.out.print("Introduce la altura en metros con decimales de la segunda persona: ");
		
		altura2 = entrada.nextDouble();
		
		System.out.print("Introduce la altura en metros con decimales de la tercera persona: ");
		
		altura3 = entrada.nextDouble();
		
		System.out.print("Ahora introduce una 'M' o una 'H' en función del género de las personas: ");
		
		sexo = entrada.next().charAt(0);
		
		media_numero = (altura1 + altura2 + altura3) / 3;
		
		media = (sexo == 'H' || sexo == 'h' ? 1.76 : 1.62);
		
		System.out.println(media_numero > media);
		
		entrada.close();

	}

}
