package actividad04;

public class CuentaAhorro extends CuentaCorriente {
	
	private double interes;
	
	public CuentaAhorro(Titular titular, String numCuenta, double saldo, double interes) {
		
		super(titular, numCuenta, saldo);
		this.interes = interes;
	}
	
	public CuentaAhorro(Titular titular, String numCuenta, double interes) {
		
		this(titular, numCuenta, 0, interes);
	}
	
	void setInteres(double interes) {
		
		this.interes = interes;
	}
	
	double getInteres() {
		
		return interes;
	}
	
	double calcularInteres() {
		
		return (super.getSaldo() * interes / 100);
	}
	
	@Override 
	public String toString(){
		
		return super.toString() + "\n- Intereses: " + interes + "%";
	}

}





