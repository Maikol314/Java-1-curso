package unidad2;

import java.util.Scanner;

public class Actividad_12 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el valor del primero número entero: ");
		
		num1 = entrada.nextInt();
		
		System.out.println("Introduce el valor del segundo número entero: ");
		
		num2 = entrada.nextInt();
		
		int x = num1;
		
		num1 = num2;
		
		num2 = x;
		
		System.out.println("El valor de la primera variable invertida es " + num1 + " y el valor de la segunda variable invertida es " + num2);

		entrada.close();
	}

}
