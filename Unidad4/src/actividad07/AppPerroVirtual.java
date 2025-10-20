package actividad07;

import java.util.Random;
import java.util.Scanner;

public class AppPerroVirtual {

	public static void main(String[] args) {
		
		int x = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		PerroVirtual perro = null;
		
		while(x == 0) {
			
			System.out.println("Elige una de las siguientes acciones a realizar: ");
			System.out.println();
			System.out.println("1.- Nacer");
			System.out.println("2.- Comer");
			System.out.println("3.- Hacer ejercicio");
			System.out.println("4.- Dormir");
			System.out.println("5.- Ir al veterinario");
			System.out.println("6.- Consultar nivel de energía");
			System.out.println("0.- Salir");
			
			int opcion = entrada.nextInt();
			entrada.nextLine();
			
			switch (opcion) {
			
			case 1:
				
				System.out.println("Introduce el nombre del perro: ");
				String nombre = entrada.nextLine();
				
				perro = new PerroVirtual(nombre);
				
				System.out.println("El perro virtual " + nombre + " ha nacido");
				
				perro.Nacer();
				
				break;
				
			case 2:
				
				if (perro == null) {
					
					System.out.println("El perro no ha nacido, debe nacer primero");
				}
				
				else {
					
					Random random = new Random();
					double enfermar = random.nextDouble();
					
					if (perro.enfermo() == false || perro.estaEnfermo() == false) {
						
						perro.Comer();
						
						if (enfermar <= 0.3) {
							
							perro.setEnfermo(true);
							
							System.out.println("El perro ha enfermado comiendo");
						}
						
						System.out.println("El perro está comiendo...");
						
					}
					
					else {
						
						System.out.println("El perro está enfermo y no puede comer");
						
					}
				}
				
				break;
				
			case 3:
				
				if (perro == null) {
					
					System.out.println("El perro no ha nacido, debe nacer primero");
				}
				
				else {
					
					if (perro.enfermo() == true || perro.estaEnfermo() == true) {
						
						System.out.println("El perro está enfermo y no puede hacer ejercicio");
					}
					
					else {
						
						perro.hacerEjercicio();
						
						System.out.println("El perro esta haciendo ejercicio...");
					}
				}
				
				break;
			
			case 4:
				
				if(perro == null) {
					
					System.out.println("El perro no ha nacido, debe nacer primero");
				}
				
				else {
					
					if (perro.enfermo() == true || perro.estaEnfermo() == true) {
						
						System.out.println("El perro está enfermo y no puede dormir");
					}
					
					else {
						
						perro.Dormir();
						
						System.out.println("El perro esta durmiendo...");
					}
				}			
				
				break;
				
			case 5:
				
				if (perro == null) {
					
					System.out.println("El perro no ha nacido, debe nacer primero");
				}
				
				else {
					
					perro.veterinario();
					
					System.out.println("El perro ha ido al veterinario!");
					
					perro.setEnfermo(false);
				}
							
				break;
				
			case 6:
				
				if (perro == null) {
					
					System.out.println("El perro no ha nacido, debe nacer primero");
				}
				
				else {
					
					perro.infoEnergia();
				}
				
				break;
				
			case 0:
				
				x = 1;
			
			}
			
		}
		
		entrada.close();
		


	}

}
