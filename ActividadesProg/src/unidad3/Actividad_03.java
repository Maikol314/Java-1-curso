package unidad3;

import java.util.Scanner;

public class Actividad_03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número entero que quieras: ");
		
		int num1 = entrada.nextInt();
		
		System.out.print("Ahora introduce el segundo número entero que quieras: ");
		
		int num2 = entrada.nextInt();
		
		if (num1 == num2) {
			
			System.out.println("Los números introducidos son iguales");
		}
		else {
			
			System.out.println("Los números introducidos son diferentes");
		}
		
		entrada.close();

	}

}
