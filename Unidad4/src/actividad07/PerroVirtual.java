package actividad07;

public class PerroVirtual {
	
	String nombre;
	private static int nivelEnergia;
	private boolean enfermo;
	
	PerroVirtual(String nombre){
		
		this.nombre = nombre;
		this.enfermo = false;
	}
	
	void Nacer() {
		
		nivelEnergia = 20;
		
		if (nivelEnergia < 15 || nivelEnergia > 50) {
			
			System.out.println("ayyyyyyyyy");
		}
		
		else if (nivelEnergia > 17 || nivelEnergia < 48) {
			
			System.out.println("guau");
		}
		
		else {
			
			System.out.println("ay");
		}
	}
	
	void Comer() {
		
		nivelEnergia += 5;
		
		if (nivelEnergia < 15 || nivelEnergia > 50) {
			
			System.out.println("ayyyyyyyyy");
		}
		
		else if (nivelEnergia > 17 || nivelEnergia < 48) {
			
			System.out.println("guau");
		}
		
		else {
			
			System.out.println("ay");
		}
	}
	
	void hacerEjercicio() {
		
		nivelEnergia -= 3;
		
		if (nivelEnergia < 15 || nivelEnergia > 50) {
			
			System.out.println("ayyyyyyyyy");
		}
		
		else if (nivelEnergia > 17 || nivelEnergia < 48) {
			
			System.out.println("guau");
		}
		
		else {
			
			System.out.println("ay");
		}
	}
	
	void Dormir() {
		
		nivelEnergia += 2;
		
		if (nivelEnergia < 15 || nivelEnergia > 50) {
			
			System.out.println("ayyyyyyyyy");
		}
		
		else if (nivelEnergia > 17 || nivelEnergia < 48) {
			
			System.out.println("guau");
		}
		
		else {
			
			System.out.println("ay");
		}
	}
	
	void veterinario() {
		
		if (nivelEnergia > 50 || nivelEnergia < 15) {
			
			nivelEnergia = 20;
		}
		
		if (nivelEnergia < 15 || nivelEnergia > 50) {
			
			System.out.println("ayyyyyyyyy");
		}
		
		else if (nivelEnergia > 17 || nivelEnergia < 48) {
			
			System.out.println("guau");
		}
		
		else {
			
			System.out.println("ay");
		}
		
	}
	
	void infoEnergia() {
		
		System.out.println("Nivel de energía actual: " + nivelEnergia);
	}
	
	boolean enfermo() {
		
		if (nivelEnergia > 50 || nivelEnergia < 15) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	void setEnfermo(boolean estado) {
		
		this.enfermo = estado;
	}
	
	boolean estaEnfermo() {
		
		return enfermo;
	}

}
