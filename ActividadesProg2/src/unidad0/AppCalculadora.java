package unidad0;

import java.util.Scanner;

public class AppCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Calculadora operacion = new Calculadora();
		
		int opcion, num1, num2;
		
		System.out.print("Elige el primer número: ");
		
		num1 = entrada.nextInt();
		
		System.out.print("Ahora el segundo: ");
		
		num2 = entrada.nextInt();
		
		System.out.println();
		
		do {
			
			System.out.println("1: Sumar");
			System.out.println("2: Restar");
			System.out.println("3: Multiplicar");
			System.out.println("4: Dividir");
			System.out.println("0: Salir");
			System.out.print("Ahora, elige lo que quieres hacer: ");
			
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcion) {
			
			case 1:
				
				System.out.println("Resultado: " + operacion.sumar(num1, num2));
				
				break;
				
			case 2:
				
				System.out.println("Resultado: " + operacion.restar(num1, num2)); 
				
				break;
				
			case 3:
				
				System.out.println("Resultado: " + operacion.multiplicar(num1, num2)); 
				
				break;
				
			case 4:
				
				System.out.println("Resultado: " + operacion.dividir(num1, num2)); 
				
				break;
				
			case 0:
				
				System.out.println("Saliste del programa");
				
				break;
				
			default:
				
				System.out.println("Opción no válida");
			}
			
		} while(opcion != 0);
		
		entrada.close();

	}

}
