package actividad02;

public class Vehiculo {
	
	private String matricula, color;
	private int num_ruedas, cilindrada, potencia;
	
	public Vehiculo(String matricula, String color, int num_ruedas) {
		
		this.matricula = matricula;
		this.color = color;
		this.num_ruedas = num_ruedas;
	}
	
	public Vehiculo(String matricula, String color, int num_ruedas, int cilindrada) {
		
		this(matricula, color, num_ruedas);
		this.cilindrada = cilindrada;
	}
	
	public Vehiculo(String matricula, String color, int num_ruedas, int cilindrada, int potencia) {
		
		this(matricula, color, num_ruedas, cilindrada);
		this.potencia = potencia;
	}
	
	void setCilindrada(int cilindrada) {
		
		this.cilindrada = cilindrada;
	}
	
	void setPotencia(int potencia) {
		
		this.potencia = potencia;
	}
	
	String matricula() {
		
		return matricula;
	}
	
	String color() {
		
		return color;
	}
	
	int num_ruedas() {
		
		return num_ruedas;
	}
	
	@Override
	public String toString() {
		
		return "Vehiculo [Matricula: " + matricula + ", Color: " + color + ", Ruedas: " + num_ruedas + ", Potencia: " + potencia + ", Cilindrada: " + cilindrada + "]";
	}

}















