package unidad2;

import java.util.Scanner;

public class Actividad_04 {

	public static void main(String[] args) {
		
		int num1, num2, suma;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número entero: ");
		
		num1 = entrada.nextInt();
		
		System.out.print("Introduce ahora el segundo número entero: ");
		
		num2 = entrada.nextInt();
		
		suma = num1 + num2;
		
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
		
		entrada.close();

	}

}
