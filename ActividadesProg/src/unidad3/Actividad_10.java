package unidad3;

import java.util.Scanner;

public class Actividad_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número entero (mayor de 0): ");
		
		int num = entrada.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			if (i == num) {
				
				System.out.print(i);
			}
			
			else {
				
				System.out.print(i + ", ");
			}
			
		}
		
		entrada.close();

	}

}
