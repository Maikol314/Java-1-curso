package unidad2;

import java.util.Scanner;

public class Actividad_11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("¿Esta lloviendo? Responde con 'S' o 'N': ");
		
		char llueve = entrada.next().charAt(0);
		
		System.out.print("¿Esta haciendo sol? Responde con 'S' o 'N': ");
		
		char sol = entrada.next().charAt(0);
		
		String condicion = ((llueve == 'S' || llueve == 's') && (sol == 'S' || sol == 's')) ? "Hay arcoiris" : "No hay arcoiris";
		
		System.out.println(condicion);
	
		entrada.close();

	}

}
