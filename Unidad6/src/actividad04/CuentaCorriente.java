package actividad04;

public class CuentaCorriente {
	
	private Titular titular;
	private String numCuenta;
	private double saldo;
	
	public CuentaCorriente(Titular titular, String numCuenta, double saldo) {
		
		this.titular = titular;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}
	
	public CuentaCorriente(Titular titular, String numCuenta) {
		
		this(titular, numCuenta, 0);
	}
	
	void setSaldo(double saldo) {
		
		this.saldo = saldo;
	}
	
	void ingreso(double ingreso) {
		
		saldo += ingreso;
	}
	
	void reintegro(double reintegro) {
		
		saldo -= reintegro;
	}
	
	double getSaldo() {
		
		return saldo;
	}
	
	String getNumCta() {
		
		return numCuenta;
	}
	
	@Override
	public String toString() {
		
		return "Datos de la cuenta: \n- Titular: " + titular.getNombre() + " " + titular.getApellidos() + "\n- Número de cuenta: " + numCuenta + "\n- Saldo: " + saldo + "€";
	}

}











