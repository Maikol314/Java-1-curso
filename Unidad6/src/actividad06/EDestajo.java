package actividad06;

public class EDestajo extends Empleado {
	
	private final float salarioD = (float)130.05;
	private int numClientes;
	
	public EDestajo(String dni, String nombre, String apellidos, int anioIngreso, int numClientes) {
		
		super(dni, nombre, apellidos, anioIngreso);
		this.numClientes = numClientes;
	}
	
	public int getNumClientes() {
		
		return numClientes;
	}
	
	public void setNumClientes(int numClientes) {
		
		this.numClientes = numClientes;
	}
	
	@Override
	public float getSalario() {
		
		return salarioD * numClientes;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\n- Número de clientes: " + getNumClientes() + "\n- Salario: " + getSalario();
	}

}
