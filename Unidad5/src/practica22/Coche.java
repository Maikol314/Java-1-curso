package practica22;

public class Coche {
	
	private String matricula, marca, modelo;
	private int km;
	
	public Coche(String matricula, String marca, String modelo, int km) {
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}
	
	public String getMatricula() {
		
		return matricula;
	}
	
	public String getMarca() {
		
		return marca;
	}
	
	public String getModelo() {
		
		return modelo;
	}
	
	public int getKm() {
		
		return km;
	}
	
	@Override
	public String toString() {
		
		return "Matricula: " + matricula + "\n- Marca: " + marca + "\n- Modelo: " + modelo + "\n- Kilómetros: " + km;
	}

}









