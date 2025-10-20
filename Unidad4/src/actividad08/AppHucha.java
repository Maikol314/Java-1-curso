package actividad08;

import java.util.Scanner;

public class AppHucha {

	public static void main(String[] args) {
		
		int x = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		Hucha hucha = null;
		
		while(x == 0) {
			
			System.out.println("Elige una de las siguientes acciones a realizar: ");
			System.out.println();
			System.out.println("1.- Crear la hucha");
			System.out.println("2.- Abrir la hucha");
			System.out.println("3.- Ingresar dinero");
			System.out.println("4.- Consultar el dinero total de la hucha");
			System.out.println("5.- Comprobar si tienes billetes en la hucha");
			System.out.println("6.- Sacar billetes");
			System.out.println("0.- Salir");
			
			int opcion = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcion) {
			
			case 1:
				
				System.out.println("Introduce un 1 si quieres que la hucha este abierta o 0 si quieres que este cerrada:");
				int estado = entrada.nextInt();
				
				System.out.println("Introduce el número de monedas de 1€ que quieres meter:");
				int monedas1 = entrada.nextInt();
				
				System.out.println("Introduce el número de monedas de 2€ que quieres meter:");
				int monedas2 = entrada.nextInt();
				
				System.out.println("Introduce el número de billetes de 5€ que quieres meter:");
				int billetes = entrada.nextInt();
				
				if (estado == 1) {
					
					hucha = new Hucha("abierta", monedas1, monedas2, billetes);
				}
				
				else if (estado == 0) {
					
					hucha = new Hucha("cerrada", monedas1, monedas2, billetes);
				}
				
				else {
					
					System.out.println("El valor introducido no es válido y no se puede crear la hucha");
				}
				
				break;
				
			case 2:
				
				hucha.abrirHucha();
				
				break;
				
			case 3:
				
				System.out.println("Introduce el número de monedas de 1€ que quieres ingresar:");
				int ingresoMonedas1 = entrada.nextInt();
				
				System.out.println("Introduce el número de monedas de 2€ que quieres ingresar:");
				int ingresoMonedas2 = entrada.nextInt();
				
				System.out.println("Introduce el número de billetes de 5€ que quieres ingresar:");
				int ingresoBilletes = entrada.nextInt();
				
				hucha.ingresar(ingresoMonedas1, ingresoMonedas2, ingresoBilletes);
				
				break;
			
			case 4:
				
				System.out.println("El valor total de la hucha es de " + hucha.valorTotal() + " euros");
				
				break;
				
			case 5:
				
				if (hucha.hayBilletes() == true) {
					
					System.out.println("En la hucha si hay billetes");
				}
				
				else {
					
					System.out.println("En la hucha no hay billetes");
				}
				
				break;
				
			case 6:
				
				System.out.println("Introduce el número de billetes que quieres sacar:");
				int retiroBilletes = entrada.nextInt();
				
				hucha.sacarBilletes(retiroBilletes);
				
				break;
				
			case 0:
				
				x = 1;
			
			}
			
		}
		
		entrada.close();

	}

}
