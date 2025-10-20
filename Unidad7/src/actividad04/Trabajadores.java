package actividad04;

public class Trabajadores {
	
	private String nombre, puesto;
	private double salario;
	
	public Trabajadores(String nombre, String puesto, double salario) {
		
		this.nombre = nombre;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public String getPuesto() {
		
		return puesto;
	}
	
	public double getSalario() {
		
		return salario;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void setPuesto(String puesto) {
		
		this.puesto = puesto;
	}
	
	public void setSalario(double salario) {
		
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		
	    return "Nombre: " + nombre + "\n- Puesto: " + puesto + "\n- Salario: " + salario;
	}	

}
