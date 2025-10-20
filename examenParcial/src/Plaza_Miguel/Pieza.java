package Plaza_Miguel;

import java.util.Random;

public class Pieza {
	// Ã�rea de datos
	private int id;			  // identificador de la pieza
	private final byte vidaUtil;    // Vida Ãºtil expresada en aÃ±os
	private byte tiempoDeUso; // Tiempo expresado en aÃ±os. 
	
	// Constructores
	public Pieza (int id, byte vidaUtil) {
		this.id=id;
		this.vidaUtil=vidaUtil;
		this.tiempoDeUso=0;
	}
	
	//MÃ©todos getter/setter
	public byte getVidaUtil() {
		return vidaUtil;
	}
	
	public int getId() {
		return id;
	}
	
	public byte getTiempoDeUso() {
		return tiempoDeUso;
	}
	
	public void cambiarPieza() {
		tiempoDeUso=0;
	}
	
	// MÃ©todos generales
	public void mostrarDatosPieza() {
		// Tiene que mostrar cada dato y valor de la pieza en una lÃ­nea
		System.out.println("---- Datos de la pieza ----");
		//completar aquÃ­
		System.out.println("El id de la pieza es " + id);
		System.out.println("El tiempo de vida útil de la pieza es " + vidaUtil + " años");
		System.out.println("El tiempo de uso de la pieza es de " + tiempoDeUso + " años");
		
		System.out.println("---------------------------");
	}
	
	void usarPieza() {
		Random r = new Random();
		int av = r.nextInt(1,7);
		int x=r.nextInt(0, 3);
		int y=r.nextInt(0, 2);
		
		// Resolver sin utilizar la estructura condicional if
		// completar aquÃ­
		int resultado;
		
		switch (av) {
		
		case 1:
			
			resultado = x + y;
			
			tiempoDeUso += resultado;
			
			break;
			
		case 2:
			
			resultado = x - y;
			
			tiempoDeUso += resultado; 
			
			break;
			
		case 3:
			
			resultado = x * y;
			
			tiempoDeUso += resultado;
			
			break;
			
		case 4:
			
			resultado = x / y;
			
			tiempoDeUso += resultado;
			
			break;
			
		case 5, 6:
			
			tiempoDeUso += 1;
		
			break;
			
		}
			

				
				
		
		
	}
}
