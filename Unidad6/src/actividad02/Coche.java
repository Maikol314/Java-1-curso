package actividad02;

public class Coche extends Vehiculo {
	
	private int numPuertas;
	
	public Coche(String matricula, String color) {
		
		super(matricula, color, 4);
	}
	
	public Coche(String matricula, String color, int cilindrada) {
		
		super(matricula, color, 4, cilindrada);
	}
	
	public Coche(String matricula, String color, int cilindrada, int potencia) {
		
		super(matricula, color, 4, cilindrada, potencia);
	}
	
	public Coche(String matricula, String color, int cilindrada, int potencia, int numPuertas) {
		
		super(matricula, color, 4, cilindrada, potencia);
		this.numPuertas = numPuertas;
	}
	
	void set_numPuertas(int numPuertas) {
		
		this.numPuertas = numPuertas;
	}
	
	int get_numPuertas() {
		
		return numPuertas;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", Puertas: " + numPuertas;
	}

}








