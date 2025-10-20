package unidad3;

import java.util.Random;
import java.util.Scanner;

public class Actividad_14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();
		
		int num_random = random.nextInt(1, 101), numero = 0, intentos = 1;
		
		while (numero != num_random && numero != -1) {
			
			System.out.println("Introduce un número del 0 al 100 o introduce -1 para rendirte: ");
			
			numero = entrada.nextInt();
			
			if (numero == -1) {
				
				System.out.println("Te has rendido. El número secreto era el " + num_random);
			}
			
			else if (numero < num_random) {
				
				System.out.println("El número secreto es mayor");
				
				intentos += 1;
			}
			
			else if (numero > num_random) {
				
				System.out.println("El número secreto es menor");
				
				intentos += 1;
			}
			
			else if (numero == num_random) {
				
				System.out.println("Has acertado después de " + intentos + " intentos");
			}
		
		}

		entrada.close();
		
	}

}
