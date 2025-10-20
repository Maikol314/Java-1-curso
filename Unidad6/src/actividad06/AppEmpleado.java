package actividad06;

import java.util.ArrayList;
import java.util.Scanner;

public class AppEmpleado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Empleado> empleados = new ArrayList<>();
		
		int opcion;
		
		do {
			System.out.println("1: Registrar empleado contratado");
			System.out.println("2: Registrar empleado a destajo");
			System.out.println("3: Mostrar salarios de todos los empleados");
			System.out.println("4: Eliminar un empleado");
			System.out.println("5: Mostrar datos de un empleado");
			System.out.println("6: Salir");
			System.out.println("");
			System.out.println("¿Que opción escoges?");
			
			opcion = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcion) {
			
			case 1:
				
				System.out.print("Escribe el DNI del empleado: ");
				String dniC = entrada.nextLine();
				System.out.println();
				
				System.out.print("Escribe el nombre del empleado: ");
				String nombreC = entrada.nextLine();
				System.out.println();
				
				System.out.print("Escribe los apellidos del empleado: ");
				String apellidosC = entrada.nextLine();
				System.out.println();
				
				System.out.print("Escribe el año de ingreso del empleado: ");
				int anioIngresoC = entrada.nextInt();
				entrada.nextLine();
				System.out.println();
				
				System.out.print("Escribe el salario del empleado: ");
				float salarioC = entrada.nextFloat();
				entrada.nextLine();
				System.out.println();
				
				empleados.add(new EContratado(dniC, nombreC, apellidosC, anioIngresoC, salarioC));
				
				break;
			
			case 2:
				
				System.out.print("Escribe el DNI del empleado: ");
				String dniD = entrada.nextLine();
				System.out.println();
				
				System.out.print("Escribe el nombre del empleado: ");
				String nombreD = entrada.nextLine();
				System.out.println();
				
				System.out.print("Escribe los apellidos del empleado: ");
				String apellidosD = entrada.nextLine();
				System.out.println();
				
				System.out.print("Escribe el año de ingreso del empleado: ");
				int anioIngresoD = entrada.nextInt();
				entrada.nextLine();
				System.out.println();
				
				System.out.print("Escribe los números de clientes que tiene: ");
				int numClientesD = entrada.nextInt();
				entrada.nextLine();
				System.out.println();
				
				empleados.add(new EDestajo(dniD, nombreD, apellidosD, anioIngresoD, numClientesD));
				
				break;
				
			case 3:
				
				for(int i = 0; i < empleados.size(); i++) {
						
					System.out.println(empleados.get(i).getSalario());
				}
				
				break;
				
			case 4:
				
				System.out.print("Escribe el DNI del empleado que quieras eliminar: ");
				String dniEliminar = entrada.nextLine();
				
				boolean eliminado = false;
				
				for(int i = 0; i < empleados.size(); i++) {
					
					if(dniEliminar.equalsIgnoreCase(empleados.get(i).getDni())) {
						
						empleados.remove(i);
						
						eliminado = true;
						
						System.out.println("Empleado eliminado correctamente");
						
						break;
					}	
				}
				
				if (!eliminado) {
					
					System.out.println("No se ha encontrado ningún empleado con el DNI indicado");
				}
				
				break;
				
			case 5:
				
				System.out.print("Escribe el DNI del empleado del que quieras ver los datos: ");
				String dniVer = entrada.nextLine();
				
				boolean mostrar = false;
				
				for(int i = 0; i < empleados.size(); i++) {
					
					if(dniVer.equalsIgnoreCase(empleados.get(i).getDni())) {
						
						System.out.println(empleados.get(i).toString()); 
						
						mostrar = true;
						
						break;
					}
				}
				
				if(!mostrar) {
					
					System.out.println("No se ha encontrado ningún empleado con el DNI indicado");
				}
				
				break;
				
			case 6:
				
				System.out.println("Has salido del programa");
				
				break;
				
			default:
				
				System.out.println("Opción no válida");
			
			}
			
		} while(opcion != 6);
		
		entrada.close();

	}

}
