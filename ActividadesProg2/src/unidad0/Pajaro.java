package unidad0;

public class Pajaro extends Animal {
	
	private boolean puedeVolar;
	
	public Pajaro(String nombre, int edad, double peso, boolean puedeVolar) {
		
		super(nombre, edad, peso);
		this.puedeVolar = puedeVolar;
	}
	
	public boolean isPuedeVolar() {
		
		return puedeVolar;
	}
	
	public void setPuedeVolar(boolean puedeVolar) {
		
		this.puedeVolar = puedeVolar;
	}
	
	@Override
	public void hacerSonido() {
		
		System.out.println("Pio Pio");
	}
	
	@Override
	public String toString() {
		
		return "Animal {" + getNombre() + "; " + getEdad() + "años; " + getPeso() + "kg; " + puedeVolar + "}";  
	}

}
