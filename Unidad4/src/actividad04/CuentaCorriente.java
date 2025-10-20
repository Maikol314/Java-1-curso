package actividad04;

public class CuentaCorriente {
	
	String dni;
	public String nombre;
	private double saldo;
	
	CuentaCorriente(String dni, String nombre, double saldoInicial){
		
		this.dni = dni;
		this.nombre = nombre;
		saldo = saldoInicial;
	}
	
	CuentaCorriente(String dni, String nombre){
		
		this(dni, nombre, 0);
	}
	
	boolean sacarDinero(double dinero) {
		
		if (dinero > saldo) {
			
			System.out.println("No hay dinero suficiente");
			
			return false;
		}
		
		else {
			
			saldo -= dinero;
			
			System.out.println("Se ha retiado el dinero correctamente");
			
			return true;
		}
	}
	
	void ingreso(double cantidad) {
		
		saldo += cantidad;
	}
	
	void mostrarInfo() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Saldo: " + saldo);
	}

}
