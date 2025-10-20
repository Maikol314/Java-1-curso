package actividad06;

public class CuentaCorriente2 {
	
	String dni;
	public String nombre;
	private double saldo;
	static private String nombreBanco;
	Gestor gestor;
	
	
	CuentaCorriente2(String dni, String nombre, double saldoInicial, Gestor gestor){
		
		this.dni = dni;
		this.nombre = nombre;
		saldo = saldoInicial;
		this.gestor = gestor;
	}
	
	CuentaCorriente2(String dni, String nombre, double saldoInicial){
		
		this(dni, nombre, saldoInicial, null);
	}
	
	CuentaCorriente2(String dni, String nombre){
		
		this(dni, nombre, 0, null);
	}
	
	static String getNombreBanco() {
		
		return nombreBanco;
	}
	
	static void setNombreBanco(String nuevoBanco) {
		
		nombreBanco = nuevoBanco;
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
		
		System.out.println("Banco: " + nombreBanco);
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Saldo: " + saldo);
		
		if (gestor != null) {
			
			System.out.println("Gestor: " + gestor.nombre);
		}
		
		else {
			
			System.out.println("Gestor: No tiene");
		}
		
		System.out.println("___________________");
		
	}

}
