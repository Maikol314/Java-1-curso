package unidad3;

import java.util.Scanner;

public class Actividad_05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el primer número entero que quieras: ");
		
		int num1 = entrada.nextInt();
		
		System.out.print("Ahora introduce el segundo número entero que quieras que sea DIFERENTE del primero: ");
		
		int num2 = entrada.nextInt();
		
		if (num1 > num2) {
			
			System.out.println("El primer número es mayor que el segundo");
		}
		else if (num2 > num1) {
			
			System.out.println("El segundo número es mayor que el primero");
		}
		else {
			System.out.println("Los números son iguales, no funciona");
		}
		
		entrada.close();

	}

}
