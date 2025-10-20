package unidad3;

import java.util.Scanner;

public class Actividad_06 {

	public static void main(String[] args) {
		
		int mayor, medio, menor;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un primer número entero: ");
		
		int num1 = entrada.nextInt();
		
		System.out.print("Introduce el segundo número entero: ");
		
		int num2 = entrada.nextInt();
		
		System.out.print("Introduce el tercer número entero: ");
		
		int num3 = entrada.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			
			mayor = num1;
			
			if (num2 >= num3) {
				
				medio = num2;
				
				menor = num3;
			}
			else {
				
				medio = num3;
				
				menor = num2;
			}
		}
		
		else if (num2 >= num1 && num2 >= num3) {
			
			mayor = num2;
			
			if (num1 >= num3) {
				
				medio = num1;
				
				menor = num3;
			}
			
			else {
				
				medio = num3;
				
				menor = num1;
			}
		}
		
		else {
			
			mayor = num3;
			
			if (num1 >= num2) {
				
				medio = num1;
				
				menor = num2;
			}
			
			else {
				
				medio = num2;
				
				menor = num1;
			}
		}
		
		System.out.println("Los números ordenados de manera descendente: " + mayor + ", " + medio + ", " + menor);
		
		entrada.close();
	}

}
