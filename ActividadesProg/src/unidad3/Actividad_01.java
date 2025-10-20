package unidad3;

import java.util.Scanner;

public class Actividad_01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el número entero que quieras para ver si es par o impar: ");
		
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
			
			System.out.println("El número introducido es par");
		}
		else {
			
			System.out.println("El número introducido es impar");
		}
		
		entrada.close();

	}

}
