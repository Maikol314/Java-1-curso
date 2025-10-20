package actividad04;

public class AppCuentaCorriente {

	public static void main(String[] args) {
		
		CuentaCorriente pepe = new CuentaCorriente("11000000C", "Pepe");
		
		pepe.ingreso(1000);
		pepe.sacarDinero(300);
		pepe.mostrarInfo();
		pepe.sacarDinero(700);
		pepe.sacarDinero(500);

	}

}
