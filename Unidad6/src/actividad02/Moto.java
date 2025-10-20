package actividad02;

public class Moto extends Vehiculo {
	
	private int numPlazas;
	
	public Moto(String matricula, String color) {
		
		super(matricula, color, 2);
	}
	
	public Moto(String matricula, String color, int cilindrada) {
		
		super(matricula, color, 2, cilindrada);
	}
	
	public Moto(String matricula, String color, int cilindrada, int potencia) {
		
		super(matricula, color, 2, cilindrada, potencia);
	}
	
	public Moto(String matricula, String color, int cilindrada, int potencia, int numPlazas) {
		
		super(matricula, color, 2, cilindrada, potencia);
		this.numPlazas = numPlazas;
	}
	
	void set_numPlazas(int numPlazas) {
		
		this.numPlazas = numPlazas;
	}
	
	int get_numPlazas() {
		
		return numPlazas;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " Plazas: " + numPlazas;
	}

}









